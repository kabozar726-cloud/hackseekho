package com.hackseekho.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hackseekho.app.data.Lesson
import com.hackseekho.app.viewmodel.HackSeekhoViewModel

@Composable
fun LessonScreen(
    lesson: Lesson,
    moduleId: String,
    vm: HackSeekhoViewModel,
    onDone: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(scrollState)
        ) {
            Text(text = lesson.title, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            lesson.body.split("\n\n").forEach { paragraph ->
                if (paragraph.isNotBlank()) {
                    Text(text = paragraph.trim(), style = MaterialTheme.typography.bodyLarge)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Sirf apni cheezon par, permission ke saath.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                vm.markLessonDone(moduleId, lesson.id)
                onDone()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Lesson Mukammal")
        }
    }
}
