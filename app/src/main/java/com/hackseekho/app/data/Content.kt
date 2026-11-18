package com.hackseekho.app.data

data class Lesson(val id: String, val title: String, val body: String)

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

data class Module(
    val id: String,
    val number: Int,
    val title: String,
    val subtitle: String,
    val iconKey: String,
    val lessons: List<Lesson>,
    val quiz: List<QuizQuestion>
)

// ContentPart1.kt / ContentPart2.kt (written by other agents, same package)
// provide ContentPart1.modules, ContentPart2.modules and ContentPart1.dailyTips.
val allModules: List<Module> = ContentPart1.modules + ContentPart2.modules
