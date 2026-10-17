import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDie()
    }
    else {
    val diceSides = args[0].toInt()
    rollDie(diceSides)
    }
    
}