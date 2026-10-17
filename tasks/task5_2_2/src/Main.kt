// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val numOfGrad = args.size
    for (i in 0..numOfGrad-1) {
        val mark = grade(args[i].toInt())
        println(mark)
    }
    exitProcess(0)
}

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

