// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun readData(filename: String) = buildList {

        try {
            Path(filename).forEachLine {
            add(it.toDouble())
            }
        }
    catch (error: IllegalArgumentException){
        println("Not all numbers could be converted to Double")
        exitProcess(1)

    }
    catch (error: Exception) {
        println("File doesn't exist")
    }


    
}
