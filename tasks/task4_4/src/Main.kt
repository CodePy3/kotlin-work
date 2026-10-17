// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
val t = Terminal()

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of args!")
        exitProcess(1)
    }
    val initTemp = (args[0]).toFloat()
    val maxTemp = (args[1]).toFloat()
    val incTemp = (args[2]).toFloat()
    var currentTemp = initTemp

    t.println(table {
        header {row("Celsius", "Fahrenheit")}
        while (currentTemp <= maxTemp) {
            var fahrenheit = (currentTemp*(9.0/5.0)) + 32
            body {row(("%.1f".format(currentTemp)), ("%.1f".format(fahrenheit)))}
            currentTemp += incTemp
        }
    })
    exitProcess(0)
}
