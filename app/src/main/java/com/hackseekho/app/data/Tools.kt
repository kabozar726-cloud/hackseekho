package com.hackseekho.app.data

// ---------- Password checker ----------

data class PasswordResult(val score: Int, val label: String, val suggestions: List<String>)

private val commonPasswords = setOf(
    "password", "123456", "12345678", "qwerty", "pakistan",
    "admin", "letmein", "123456789", "111111"
)

fun scorePassword(password: String): PasswordResult {
    if (password.lowercase() in commonPasswords) {
        return PasswordResult(
            score = 0,
            label = "Bohat Kamzor",
            suggestions = listOf(
                "Ye password bohat aam hai — ise kabhi use na karein",
                "Password lamba rakhein — kam az kam 12 harf",
                "Bara aur chhota harf dono use karein",
                "Number aur nishan (!@#) shamil karein",
                "Har account ke liye alag password rakhein"
            )
        )
    }

    var points = 0
    if (password.length >= 12) {
        points += 2
    } else if (password.length >= 8) {
        points += 1
    }
    if (password.any { it.isUpperCase() }) points += 1
    if (password.any { it.isLowerCase() }) points += 1
    if (password.any { it.isDigit() }) points += 1
    if (password.any { !it.isLetterOrDigit() }) points += 1

    val score = when (points) {
        0, 1 -> 0
        2 -> 1
        3 -> 2
        4, 5 -> 3
        else -> 4
    }

    val label = when (score) {
        0 -> "Bohat Kamzor"
        1 -> "Kamzor"
        2 -> "Theek Hai"
        3 -> "Mazboot"
        else -> "Bohat Mazboot"
    }

    val suggestions = mutableListOf<String>()
    if (password.length < 12) {
        suggestions.add("Password lamba rakhein — kam az kam 12 harf")
    }
    if (!password.any { it.isUpperCase() } || !password.any { it.isLowerCase() }) {
        suggestions.add("Bara aur chhota harf dono use karein")
    }
    if (!password.any { it.isDigit() }) {
        suggestions.add("Number shamil karein")
    }
    if (!password.any { !it.isLetterOrDigit() }) {
        suggestions.add("Number aur nishan (!@#) shamil karein")
    }
    suggestions.add("Har account ke liye alag password rakhein")
    if (score == 4) {
        suggestions.clear()
        suggestions.add("Bohat acha password hai — ise kisi se share na karein")
        suggestions.add("Har account ke liye alag password rakhein")
    }

    return PasswordResult(score = score, label = label, suggestions = suggestions)
}

// ---------- URL checker (offline heuristics only) ----------

data class UrlCheckResult(val verdict: String, val reasons: List<String>)

private val knownShorteners = setOf(
    "bit.ly", "tinyurl.com", "goo.gl", "t.co", "ow.ly", "is.gd", "cutt.ly", "shorturl.at"
)

private val suspiciousWords = listOf(
    "verify", "secure-login", "account-update", "free-prize",
    "claim-now", "suspended", "confirm-password", "login-secure"
)

private val lookalikeDomains = listOf(
    "paypa1", "goggle", "faceb00k", "amaz0n", "micros0ft", "appl3", "netf1ix"
)

fun checkUrl(raw: String): UrlCheckResult {
    val input = raw.trim()
    if (input.isEmpty()) {
        return UrlCheckResult(
            verdict = "suspicious",
            reasons = listOf("Link khali hai")
        )
    }

    val reasons = mutableListOf<String>()
    var verdict = "safe"

    val withoutScheme = input
        .removePrefix("https://")
        .removePrefix("http://")
        .removePrefix("www.")
    val host = withoutScheme.substringBefore("/").substringBefore("?").lowercase()
    val lowerInput = input.lowercase()

    val isIpv4 = host.split(".").size == 4 &&
        host.split(".").all { part -> part.toIntOrNull() != null && part.toInt() in 0..255 }
    if (isIpv4) {
        return UrlCheckResult(
            verdict = "dangerous",
            reasons = listOf("Link mein website ka naam nahi, sirf IP address hai — ye aksar dhokay ke liye hota hai")
        )
    }

    if (lookalikeDomains.any { host.contains(it) }) {
        return UrlCheckResult(
            verdict = "dangerous",
            reasons = listOf("Ye mashhoor website jaisa dikhne wala nakli naam lagta hai — is par click na karein")
        )
    }

    if (knownShorteners.any { host == it || host.endsWith(".$it") }) {
        verdict = "suspicious"
        reasons.add("Ye chhota kiya hua link hai — asal website chhupi hui hai")
    }

    if (suspiciousWords.any { lowerInput.contains(it) }) {
        verdict = "suspicious"
        reasons.add("Link mein mashkook lafz hain (jaise verify, free-prize, suspended)")
    }

    if (lowerInput.contains("xn--")) {
        verdict = "suspicious"
        reasons.add("Link mein punycode (xn--) hai — nakli naam chhupaya ja sakta hai")
    }

    if (input.startsWith("http://")) {
        verdict = "suspicious"
        reasons.add("HTTPS nahi hai — ye connection mehfooz nahi")
    }

    val subdomainCount = host.split(".").size - 2
    if (subdomainCount > 3) {
        verdict = "suspicious"
        reasons.add("Bohat zyada subdomains hain — ye mashkook hai")
    }

    if (verdict == "safe") {
        reasons.add("Koi mashkook nishani nahi mili — phir bhi hoshiyar rahein")
    }

    return UrlCheckResult(verdict = verdict, reasons = reasons)
}

// ---------- Simulated terminal (nothing real executes) ----------

val fakeTerminalHelp: String = """
Aap ye commands likh sakte hain:
  help     - madad dikhayen
  ls       - files ki list
  pwd      - maujooda jagah
  whoami   - aap kaun hain
  hostname - computer ka naam
  date     - aaj ki tareekh
  uname    - system ki maloomat
  echo <text> - text dikhayen
  cat readme.txt - file parhein
  ip a     - network ki maloomat (nakli)
  clear    - screen saaf karein
  exit     - terminal band karein
""".trimIndent()

fun runFakeCommand(input: String): String {
    val trimmed = input.trim()
    if (trimmed.isEmpty()) return ""
    val parts = trimmed.split(Regex("\\s+"))
    val cmd = parts[0].lowercase()
    val rest = if (parts.size > 1) trimmed.substringAfter(parts[0]).trim() else ""

    return when (cmd) {
        "help" -> fakeTerminalHelp
        "ls" -> "readme.txt  seekho  tools  notes.txt"
        "pwd" -> "/home/seekhne-wala/hackseekho"
        "whoami" -> "seekhne-wala"
        "hostname" -> "hackseekho-phone"
        "date" -> "Aaj seekhne ka din hai — tareekh ke liye phone ki ghadi dekhein."
        "uname" -> "HackSeekhoOS (seekhne ke liye nakli system)"
        "echo" -> rest
        "cat" -> if (rest == "readme.txt") {
            "HackSeekho mein khush amdeed!\nEthical hacking seekhein — qanoon ke andar, permission ke saath."
        } else {
            "File nahi mili: '$rest'"
        }
        "ip" -> if (rest == "a") {
            "192.168.1.5 — ye sirf seekhne ke liye nakli hai"
        } else {
            "Command nahi mili: '$cmd' — 'help' likh kar dekhein."
        }
        "clear" -> "CLEAR"
        "exit" -> "Terminal band karne ke liye back dabayen."
        else -> "Command nahi mili: '$cmd' — 'help' likh kar dekhein."
    }
}
