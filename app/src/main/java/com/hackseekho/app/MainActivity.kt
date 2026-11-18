package com.hackseekho.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hackseekho.app.data.allModules
import com.hackseekho.app.ui.AboutScreen
import com.hackseekho.app.ui.HomeScreen
import com.hackseekho.app.ui.LearnScreen
import com.hackseekho.app.ui.LessonScreen
import com.hackseekho.app.ui.ModuleDetailScreen
import com.hackseekho.app.ui.QuizScreen
import com.hackseekho.app.ui.ToolsScreen
import com.hackseekho.app.viewmodel.HackSeekhoViewModel

sealed class Screen {
    object Home : Screen()
    object Learn : Screen()
    object Tools : Screen()
    object About : Screen()
    data class ModuleDetail(val moduleId: String) : Screen()
    data class LessonDetail(val moduleId: String, val lessonId: String) : Screen()
    data class Quiz(val moduleId: String) : Screen()
}

@Composable
fun HackSeekhoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Color(0xFF22C55E),
            background = Color(0xFF0B1220),
            surface = Color(0xFF111827),
            onPrimary = Color.Black,
            onBackground = Color.White,
            onSurface = Color.White
        ),
        content = content
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackSeekhoTheme {
                HackSeekhoApp()
            }
        }
    }
}

@Composable
fun HackSeekhoApp() {
    val vm: HackSeekhoViewModel = viewModel()
    val backStack = remember { mutableStateListOf<Screen>(Screen.Home) }

    fun push(screen: Screen) {
        backStack.add(screen)
    }

    fun goToRoot(screen: Screen) {
        backStack.clear()
        backStack.add(screen)
    }

    BackHandler(enabled = backStack.size > 1) {
        backStack.removeLast()
    }

    val current = backStack.last()
    val currentRoot: Screen = when (current) {
        is Screen.ModuleDetail, is Screen.LessonDetail, is Screen.Quiz -> Screen.Learn
        is Screen.Home -> Screen.Home
        is Screen.Learn -> Screen.Learn
        is Screen.Tools -> Screen.Tools
        is Screen.About -> Screen.About
    }

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = currentRoot is Screen.Home,
                    onClick = { goToRoot(Screen.Home) },
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                NavigationBarItem(
                    selected = currentRoot is Screen.Learn,
                    onClick = { goToRoot(Screen.Learn) },
                    icon = { Icon(Icons.Filled.School, contentDescription = "Seekho") },
                    label = { Text("Seekho") }
                )
                NavigationBarItem(
                    selected = currentRoot is Screen.Tools,
                    onClick = { goToRoot(Screen.Tools) },
                    icon = { Icon(Icons.Filled.Build, contentDescription = "Tools") },
                    label = { Text("Tools") }
                )
                NavigationBarItem(
                    selected = currentRoot is Screen.About,
                    onClick = { goToRoot(Screen.About) },
                    icon = { Icon(Icons.Filled.Info, contentDescription = "About") },
                    label = { Text("About") }
                )
            }
        }
    ) { innerPadding ->
        val contentModifier = Modifier.padding(innerPadding)
        when (val screen = current) {
            is Screen.Home -> HomeScreen(
                vm = vm,
                onModuleClick = { moduleId -> push(Screen.ModuleDetail(moduleId)) },
                onToolsClick = { goToRoot(Screen.Tools) },
                modifier = contentModifier
            )
            is Screen.Learn -> LearnScreen(
                vm = vm,
                onModuleClick = { moduleId -> push(Screen.ModuleDetail(moduleId)) },
                modifier = contentModifier
            )
            is Screen.Tools -> ToolsScreen(modifier = contentModifier)
            is Screen.About -> AboutScreen(modifier = contentModifier)
            is Screen.ModuleDetail -> {
                val module = allModules.firstOrNull { it.id == screen.moduleId }
                if (module != null) {
                    ModuleDetailScreen(
                        module = module,
                        vm = vm,
                        onLessonClick = { lessonId ->
                            push(Screen.LessonDetail(screen.moduleId, lessonId))
                        },
                        onQuizClick = { push(Screen.Quiz(screen.moduleId)) },
                        modifier = contentModifier
                    )
                }
            }
            is Screen.LessonDetail -> {
                val module = allModules.firstOrNull { it.id == screen.moduleId }
                val lesson = module?.lessons?.firstOrNull { it.id == screen.lessonId }
                if (module != null && lesson != null) {
                    LessonScreen(
                        lesson = lesson,
                        moduleId = screen.moduleId,
                        vm = vm,
                        onDone = { backStack.removeLast() },
                        modifier = contentModifier
                    )
                }
            }
            is Screen.Quiz -> {
                val module = allModules.firstOrNull { it.id == screen.moduleId }
                if (module != null) {
                    QuizScreen(
                        module = module,
                        vm = vm,
                        onFinish = { backStack.removeLast() },
                        modifier = contentModifier
                    )
                }
            }
        }
    }
}
