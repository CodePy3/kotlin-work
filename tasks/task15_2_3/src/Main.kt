// Task 15.2.3: demo program

fun main() {
    val savings1 = SavingsAccount(1.8, "Bob")
    savings1.deposit(1250.0)

    savings1.applyInterest()
    savings1.applyInterest()
    savings1.applyInterest()
    savings1.applyInterest()
    savings1.applyInterest()

    

    savings1.withdraw(50.0)
    println("Balance: %.2f".format(savings1.balance))
}
