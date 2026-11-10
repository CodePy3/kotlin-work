// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0) {"Euros cannot be less than 0"}
        require(cents >= 0) {"Euros cannot be less than 0"}
        require(cents < 100) {"Euros cannot be less than 0"}
    }

    operator fun plus(other: Money): Money {
        val totCents = this.cents + other.cents
        if (totCents >= 100) {
            val additionalEuros = totCents / 100
            val finalCents = totCents % 100
            val finalEuros = this.euros + other.euros + additionalEuros
            return Money(finalEuros, finalCents)
        } else {
            val finalEuros = this.euros + other.euros
            val finalCents = totCents
            return Money(finalEuros,totCents)
        }
    }

}