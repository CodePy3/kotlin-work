// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer
import kotlin.io.path.readLines
import kotlin.io.path.appendText

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map
    val path = Path(filename)
    val fileContents = path.readLines()
    for (line in fileContents) {
        val parts = line.split(',')
        this[parts[0]] = parts[1]
    }
}


fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    val path = Path(filename)
    path.writer().use { writer ->
        for ((key,value) in this) {
            writer.write("$key,$value\n")
        }
    }
}
