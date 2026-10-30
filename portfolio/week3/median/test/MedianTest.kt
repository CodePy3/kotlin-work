// COMP2850 Portfolio: Week 3
// Tests for median() 

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused") 
class MedianTest : FreeSpec({
    "Exception when size=0" { 
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    } 
    "when size = 1" {
        median(listOf(5.0f)) shouldBe 5.0f // checks that median is correct with single whole number in list
        median(listOf(2.4f)) shouldBe 2.4f // checks that the median is correct with single float in list
    }
    "when size = 2" { 
        median(listOf(5.0f, 10.0f)) shouldBe 7.5f // checks that median is correct when it is a float
        median(listOf(5.0f, 5.0f)) shouldBe 5.0f // checks that median is correct when same value is repeated
        median(listOf(2.0f, 6.0f)) shouldBe 4.0f // checks that the median is correct when it is a whole number
    }
    "when size = 3" {
        median(listOf(5.0f, 10.0f, 15.0f)) shouldBe 10.0f // checks median is calculated correctly when it is an whole number
        median(listOf(5.0f, 7.2f, 15.0f)) shouldBe 7.2f // checks that median is correct when it is a float
        median(listOf(10.0f, 1.0f, 2.0f)) shouldBe 2.0f // checks median is correct when list is not in ascending order

    }
    "when size = 4" {
        median(listOf(5.0f, 10.0f, 15.0f, 20.0f)) shouldBe 12.5f // checks that median is correct when it is not in the list
        median(listOf(5.0f, 10.0f, 20.0f, 30.0f)) shouldBe 15.0f // checks median is calculated correctly when it is a whole num
        median(listOf(10.0f, 4.0f, 12.0f, 1.0f)) shouldBe 7.0f // checks median is correct when list is not in ascending order
    }

})
