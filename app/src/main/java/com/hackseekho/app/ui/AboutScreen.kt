package com.hackseekho.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hackseekho.app.data.allModules

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "HackSeekho", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "v1.0.0", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Ethical hacking seekhne ki app — Roman Urdu mein, bilkul muft aur fully offline.",
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Ethical hacking ka matlab hai: apni ya kisi ki cheez ki security ko sirf permission ke saath check karna, taake kamzoriyan theek ki ja sakein. Is app mein aap networking, Linux, password security, phishing, web security, Wi-Fi security aur bug bounty ke bare mein seekhein ge.",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Ye app sirf seekhne ke liye hai. Kisi ki cheez par permission ke baghair testing karna ghair-qanooni hai.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Modules: ${allModules.size}", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Fully offline — koi internet nahi",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
