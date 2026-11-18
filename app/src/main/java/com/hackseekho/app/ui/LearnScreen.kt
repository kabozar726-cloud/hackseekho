package com.hackseekho.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hackseekho.app.data.Module
import com.hackseekho.app.data.allModules
import com.hackseekho.app.viewmodel.HackSeekhoViewModel

@Composable
fun LearnScreen(
    vm: HackSeekhoViewModel,
    onModuleClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val completedLessons by vm.completedLessons.collectAsState()
    val quizScores by vm.quizScores.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Seekho", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "10 modules — har module mein lessons aur quiz",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(allModules) { module ->
                val done = module.lessons.count { lesson ->
                    completedLessons.contains("${module.id}_${lesson.id}")
                }
                val best = quizScores[module.id]
                val complete = vm.isModuleComplete(module.id)
                Card(
                    onClick = { onModuleClick(module.id) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = moduleIcon(module.iconKey),
                            contentDescription = module.title,
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Column(modifier = Modifier.padding(start = 12.dp)) {
                            Text(
                                text = "${module.number}. ${module.title}",
                                style = MaterialTheme.typography.titleMedium
                            )
                            Text(
                                text = module.subtitle,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "$done / ${module.lessons.size} lessons" +
                                    if (best != null) "  •  Quiz best: $best / ${module.quiz.size}" else "",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        if (complete) {
                            Icon(
                                imageVector = Icons.Filled.CheckCircle,
                                contentDescription = "Mukammal",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ModuleDetailScreen(
    module: Module,
    vm: HackSeekhoViewModel,
    onLessonClick: (String) -> Unit,
    onQuizClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val completedLessons by vm.completedLessons.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "${module.number}. ${module.title}", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = module.subtitle, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            items(module.lessons) { lesson ->
                val done = completedLessons.contains("${module.id}_${lesson.id}")
                Card(
                    onClick = { onLessonClick(lesson.id) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = lesson.title,
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.weight(1f)
                        )
                        if (done) {
                            Icon(
                                imageVector = Icons.Filled.CheckCircle,
                                contentDescription = "Mukammal",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onQuizClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Quiz dein (${module.quiz.size} sawal)")
        }
    }
}
