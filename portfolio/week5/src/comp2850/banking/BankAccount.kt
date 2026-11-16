// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int)
}

class StudentAccount(holder: String) : BankAccount(holder) {

    var overdraft = 0
        set(value) {
            require(value in 0..100) {"Invalid Overdraft Amount!"}
            field = value
        }
    

    override fun withdraw(amount: Int) {
        require(amount > 0) {"Withdrawal amount must be greater than 0"}
        require(balance + overdraft >= amount) {"Insufficient funds for withdrawal"}
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        if (balance > (0-overdraft)) {
            return true
        } else {
            return false
        }
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}