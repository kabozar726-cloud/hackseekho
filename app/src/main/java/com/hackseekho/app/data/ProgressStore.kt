package com.hackseekho.app.data

import android.content.Context

class ProgressStore(context: Context) {

    private val prefs = context.getSharedPreferences(
        "hackseekho_progress",
        Context.MODE_PRIVATE
    )

    fun loadCompletedLessons(): Set<String> {
        return prefs.all
            .filter { (key, value) -> key.startsWith("lesson_") && value == true }
            .keys
            .map { it.removePrefix("lesson_") }
            .toSet()
    }

    fun loadQuizScores(): Map<String, Int> {
        return prefs.all
            .filter { (key, value) -> key.startsWith("quiz_") && value is Int }
            .map { (key, value) -> key.removePrefix("quiz_") to (value as Int) }
            .toMap()
    }

    fun markLessonDone(moduleId: String, lessonId: String) {
        prefs.edit()
            .putBoolean("lesson_${moduleId}_${lessonId}", true)
            .apply()
    }

    fun saveQuizScore(moduleId: String, score: Int) {
        val best = prefs.getInt("quiz_${moduleId}", 0)
        if (score > best) {
            prefs.edit()
                .putInt("quiz_${moduleId}", score)
                .apply()
        }
    }
}
