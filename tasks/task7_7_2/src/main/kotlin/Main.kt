// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    db.load(CSV_FILENAME)
    print("Enter name: ")
    val name = readln()

    if (db[name] == null) {
        print("Name Not Found. Enter Phone Number: ")
        val newEntry = readln()
        db[name] = newEntry
    }
    else {
        print(db[name])
    }

    db.save(CSV_FILENAME)
}
