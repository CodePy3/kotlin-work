// Task 15.2.3: SavingsAccount class
class SavingsAccount(val rate: Double, holder:String) : BankAccount(holder) {
    init {
        require(rate > 0) {"Interest rate must be greater than 0"}
    }
    fun applyInterest() {
        val newBalance = (1.0+(rate/100))*balance
        val interestAmount = (newBalance - balance)
        deposit(interestAmount)
    }
}