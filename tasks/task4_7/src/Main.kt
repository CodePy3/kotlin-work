// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>) {
    val filePath = if (args.size == 1) {Path(args[0]) } else {Path("testFile.txt")}
    val fileLines = filePath.readLines()
    var maxSize = 0
    var lineNum = 1
    var maxLine = 0
    for (line in fileLines) {
        if (line.length > maxSize) {
            maxSize = line.length
            maxLine = lineNum
            lineNum += 1
        }
        else {
            lineNum += 1
        }
    }
    println("Line %d is the longest - length = %d".format(maxLine, maxSize))

}
