// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid Num Of Args")
        exitProcess(1)
    }

    val mod1 = args[0].toFloat()
    val mod2 = args[1].toFloat()
    val mod3 = args[2].toFloat()

    val overallMark = (mod1+mod2+mod3) / 3

    when {
        overallMark >= 0 && overallMark <= 40.0 -> println("Fail")
        overallMark >= 0 && overallMark <= 70.0 -> println("Pass")
        overallMark >= 0 && overallMark <= 100 -> println("Distinction")
        else -> println("Invalid")
    }
    exitProcess(0)
}