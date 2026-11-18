package com.hackseekho.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hackseekho.app.data.Module
import com.hackseekho.app.viewmodel.HackSeekhoViewModel

@Composable
fun QuizScreen(
    module: Module,
    vm: HackSeekhoViewModel,
    onFinish: () -> Unit,
    modifier: Modifier = Modifier
) {
    var currentIndex by remember { mutableStateOf(0) }
    var selectedIndex by remember { mutableStateOf(-1) }
    var answered by remember { mutableStateOf(false) }
    var correctCount by remember { mutableStateOf(0) }
    var finished by remember { mutableStateOf(false) }

    val total = module.quiz.size

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (finished) {
            Text(text = "Quiz mukammal!", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Aap ka score: $correctCount / $total",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            val best = vm.getQuizBest(module.id)
            if (best != null) {
                Text(
                    text = "Best score: $best / $total",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onFinish, modifier = Modifier.fillMaxWidth()) {
                Text("Wapas")
            }
            return
        }

        if (total == 0) {
            Text(text = "Is module mein abhi koi quiz nahi hai.", style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onFinish, modifier = Modifier.fillMaxWidth()) {
                Text("Wapas")
            }
            return
        }

        val question = module.quiz[currentIndex]

        Text(text = "Sawal ${currentIndex + 1} / $total", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = question.question, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        question.options.forEachIndexed { index, option ->
            val isCorrectOption = index == question.correctIndex
            val isPicked = index == selectedIndex
            val containerColor = when {
                answered && isCorrectOption -> Color(0xFF22C55E)
                answered && isPicked -> Color(0xFFEF4444)
                else -> MaterialTheme.colorScheme.surface
            }
            Button(
                onClick = {
                    if (!answered) {
                        selectedIndex = index
                        answered = true
                        if (isCorrectOption) correctCount += 1
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = containerColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            ) {
                Text(option)
            }
        }

        if (answered) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = question.explanation, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    if (currentIndex + 1 < total) {
                        currentIndex += 1
                        selectedIndex = -1
                        answered = false
                    } else {
                        vm.saveQuizScore(module.id, correctCount)
                        finished = true
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(if (currentIndex + 1 < total) "Agla Sawal" else "Khatam karein")
            }
        }
    }
}
