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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.hackseekho.app.data.checkUrl
import com.hackseekho.app.data.runFakeCommand
import com.hackseekho.app.data.scorePassword

private enum class ToolTab { PASSWORD, URL, TERMINAL }

@Composable
fun ToolsScreen(modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(ToolTab.PASSWORD) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Tools", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Sab kuch offline — koi internet nahi",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { selectedTab = ToolTab.PASSWORD },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
            ) { Text("Password") }
            Button(
                onClick = { selectedTab = ToolTab.URL },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
            ) { Text("Link") }
            Button(
                onClick = { selectedTab = ToolTab.TERMINAL },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp)
            ) { Text("Terminal") }
        }

        Spacer(modifier = Modifier.height(16.dp))

        when (selectedTab) {
            ToolTab.PASSWORD -> PasswordChecker()
            ToolTab.URL -> UrlChecker()
            ToolTab.TERMINAL -> FakeTerminal()
        }
    }
}

@Composable
private fun PasswordChecker() {
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    val result = if (password.isEmpty()) null else scorePassword(password)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password likhein") },
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { showPassword = !showPassword }) {
                    Icon(
                        imageVector = if (showPassword) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                        contentDescription = if (showPassword) "Chhupayen" else "Dikhayen"
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )

        if (result != null) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = result.label, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            val barColor = when (result.score) {
                0 -> Color(0xFFEF4444)
                1 -> Color(0xFFF97316)
                2 -> Color(0xFFEAB308)
                3 -> Color(0xFF84CC16)
                else -> Color(0xFF22C55E)
            }
            LinearProgressIndicator(
                progress = { result.score.toFloat() / 4f },
                color = barColor,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Mashwaray:", style = MaterialTheme.typography.titleMedium)
            result.suggestions.forEach { suggestion ->
                Text(text = "• $suggestion", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}

@Composable
private fun UrlChecker() {
    var url by remember { mutableStateOf("") }
    var result by remember { mutableStateOf<com.hackseekho.app.data.UrlCheckResult?>(null) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        OutlinedTextField(
            value = url,
            onValueChange = { url = it },
            label = { Text("Link yahan likhein") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { result = checkUrl(url) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Check karein")
        }

        result?.let { check ->
            Spacer(modifier = Modifier.height(16.dp))
            val verdictText = when (check.verdict) {
                "safe" -> "Mehfooz lagta hai"
                "suspicious" -> "Mashkook hai"
                else -> "Khatarnak hai"
            }
            val verdictColor = when (check.verdict) {
                "safe" -> Color(0xFF22C55E)
                "suspicious" -> Color(0xFFEAB308)
                else -> Color(0xFFEF4444)
            }
            Text(text = verdictText, style = MaterialTheme.typography.titleLarge, color = verdictColor)
            Spacer(modifier = Modifier.height(8.dp))
            check.reasons.forEach { reason ->
                Text(text = "• $reason", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}

@Composable
private fun FakeTerminal() {
    val output = remember {
        mutableStateListOf(
            "HackSeekho Terminal — ye sirf seekhne ke liye nakli hai.",
            "Kuch bhi asal mein nahi chalta.",
            "'help' likh kar commands dekhein."
        )
    }
    var input by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            LazyColumn(modifier = Modifier.padding(12.dp)) {
                items(output) { line ->
                    Text(text = line, style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = input,
                onValueChange = { input = it },
                placeholder = { Text("Command likhein...") },
                singleLine = true,
                modifier = Modifier.weight(1f)
            )
            IconButton(
                onClick = {
                    val cmd = input.trim()
                    if (cmd.isNotEmpty()) {
                        val result = runFakeCommand(cmd)
                        if (result == "CLEAR") {
                            output.clear()
                        } else {
                            output.add("> $cmd")
                            if (result.isNotEmpty()) output.add(result)
                        }
                        input = ""
                    }
                }
            ) {
                Icon(Icons.Filled.Send, contentDescription = "Bhejein")
            }
        }
    }
}
