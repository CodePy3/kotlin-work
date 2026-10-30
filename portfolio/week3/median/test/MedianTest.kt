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
        median(listOf(5.0f)) shouldBe 5.0f
    }
    "when size = 2" { 
        median(listOf(5.0f, 10.0f)) shouldBe 7.5f // checks that median is correct when its not itself or an int
        median(listOf(5.0f, 5.0f)) shouldBe 5.0f // checks that median returns itself if list has repeated values
    }
    "when size = 3" {
        median(listOf(5.0f, 10.0f, 15.0f)) shouldBe 10.0f // checks median is calculated correctly
        median(listOf(5.0f, 5.0f, 50.f)) shouldBe 5.0f // checks that median returns itself if list has repeated values
    }
    "when size = 3" {
        median(listOf(5.0f, 10.0f, 15.0f)) shouldBe 10.0f
    }
    "when size = 4" {
        median(listOf(5.0f, 10.0f, 15.0f, 20.0f)) shouldBe 12.5f
    }

})
