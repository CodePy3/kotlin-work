// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    "can create an instance of Money" {
        val m = Money(1,50)
        withClue("euros") {m.euros shouldBe 1}
        withClue("cents") {m.cents shouldBe 50}
    }

    "can create a different instance of Money" {
        val m = Money(2,99)
        withClue("euros") {m.euros shouldBe 2}
        withClue("cents") {m.cents shouldBe 99}
    }

    "Money doesn't accept negative value for euro" {
        val exception = shouldThrow<IllegalArgumentException> {
            Money(-1,5)
        }
    }
    
    "Money doesn't accept negative value for cents" {
        val exception = shouldThrow<IllegalArgumentException> {
            Money(1,-5)
        }
    }

    "Money doesn't accept negative values for cents and euros" {
        val exception = shouldThrow<IllegalArgumentException> {
            Money(-1,-5)
        }
    }

    "Money doesn't accept values over 100 for cents" {
        val exception = shouldThrow<IllegalArgumentException> {
            Money(1,101)
        }
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
    }   

    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50) 
    }   

    "€1.50 + €0.01 is €1.51" {
    Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "€2.99 + €0.01 is €3.00" {
    Money(2, 99) + Money(0, 1) shouldBe Money(3,0)
    }

    "€4.20 + €2.90 is €7.10" {
        Money(4,20) + Money(2,90) shouldBe Money(7, 10)
    }


})
