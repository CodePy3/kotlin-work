// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(fileContent: String, toRedact: String, redactChar: Char='X'): String {
    val redactSize: Int = toRedact.length
    var redactString = ""
    for (i in 1..redactSize) {
        redactString += redactChar
    }
    val lowerfile = fileContent.lowercase()
    val redactedFile = fileContent.replace(toRedact,redactString)
    return redactedFile
}