// Task 12.8.2: class to represent playing cards
class Card(val rank: Rank, val suit: Suit) {
    val FullName get() = "$rank of $suit"

    override fun toString() = "$rank$suit"
}