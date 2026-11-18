package com.hackseekho.app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.hackseekho.app.data.ContentPart1
import com.hackseekho.app.data.ProgressStore
import com.hackseekho.app.data.allModules
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.Calendar

class HackSeekhoViewModel(application: Application) : AndroidViewModel(application) {

    private val store = ProgressStore(application.applicationContext)

    private val _completedLessons = MutableStateFlow(store.loadCompletedLessons())
    val completedLessons: StateFlow<Set<String>> = _completedLessons.asStateFlow()

    private val _quizScores = MutableStateFlow(store.loadQuizScores())
    val quizScores: StateFlow<Map<String, Int>> = _quizScores.asStateFlow()

    val totalLessons: Int = allModules.sumOf { it.lessons.size }

    fun markLessonDone(moduleId: String, lessonId: String) {
        store.markLessonDone(moduleId, lessonId)
        _completedLessons.value = store.loadCompletedLessons()
    }

    fun saveQuizScore(moduleId: String, score: Int) {
        store.saveQuizScore(moduleId, score)
        _quizScores.value = store.loadQuizScores()
    }

    fun getQuizBest(moduleId: String): Int? {
        return _quizScores.value[moduleId]
    }

    fun isModuleComplete(moduleId: String): Boolean {
        val module = allModules.firstOrNull { it.id == moduleId } ?: return false
        if (module.lessons.isEmpty()) return false
        return module.lessons.all { lesson ->
            _completedLessons.value.contains("${moduleId}_${lesson.id}")
        }
    }

    fun dailyTip(): String {
        val tips = ContentPart1.dailyTips
        if (tips.isEmpty()) return "Har roz kuch naya seekhein."
        val dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        return tips[dayOfYear % tips.size]
    }
}
