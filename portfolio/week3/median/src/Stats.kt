fun median(floatList: List<Float>): Float {
    if (floatList.size < 1) {
        throw IllegalArgumentException("Must have at least 1 argument")
    }
    if (floatList.size % 2 != 0) {
        val medianIndex = floatList.size / 2
        val medianNum = floatList[medianIndex]
        return medianNum
    }
    
    else {
        val upperMed = floatList.size / 2
        val lowerMed = upperMed - 1
        val medianNum = (floatList[upperMed] + floatList[lowerMed]) / 2
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