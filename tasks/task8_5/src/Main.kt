// Task 8.5: example of using a higher-order function

fun main() {
    val string1 = "Hello World!"
    val wordCount = string1.howMany {it == 'l'}
    val usingCount = string1.count {it == 'l'}
    println("$string1 contains 'l' $wordCount times using .howMany")
    println("$string1 contains 'l' $wordCount times using Count")
}
