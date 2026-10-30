fun median(floatList: List<Float>): Float {

    if (floatList.size < 1) {
        throw IllegalArgumentException("Must have at least 1 argument")
    }
    val sortedList = floatList.sorted()

    if (sortedList.size % 2 != 0) {
        val medianIndex = sortedList.size / 2
        val medianNum = sortedList[medianIndex]
        return medianNum
    }
    
    else {
        val upperMed = sortedList.size / 2
        val lowerMed = upperMed - 1
        val medianNum = (sortedList[upperMed] + sortedList[lowerMed]) / 2
        return medianNum
    }

}

fun displayStats(floatList: List<Float>) {
    val min = floatList.min()
    val max = floatList.max()
    val mean = floatList.average()
    val median = median(floatList)
    println("Min=$min, Max=$max, Mean=$mean, Median=$median")
}