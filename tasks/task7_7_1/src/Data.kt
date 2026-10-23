// Task 7.7.1: data handling functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList { // you can call this function from other files 
   Path(filename).forEachLine { // the function will return the list
       add(it.toFloat())
   }
}