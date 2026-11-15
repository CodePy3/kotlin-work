// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer
import kotlin.io.path.readLines

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.filter {it.status == ItemStatus.NotStarted}.size // compute no. of items with NotStarted status
    val inProgress get() = items.filter {it.status == ItemStatus.InProgress}.size   // compute no. of items with InProgress status
    val done get() = items.filter {it.status == ItemStatus.Done}.size         // compute no. of items with Done status
    val overdue get() = items.filter { it.isOverdue() == true }.size      // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        val path = Path(filename)
        val filelines = path.readLines()
        for (line in filelines) {
            val task = line.split(":").map {it.trim() } // I could have also just done ": " as the seperator but this seems nicer :)
            val date = LocalDate.parse(task[0])
            val status = ItemStatus.valueOf(task[1])
            val description = task[2]
            val taskObject = ToDoItem(date, status, description)
            add(taskObject)
        }


    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        val changed = items.removeAll {it.status == ItemStatus.Done}
        return changed
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        if (status == null) {
            return items
        }
        val statusList = items.filter {it.status == status}
        return statusList
        
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        val dueToday = items.filter {it.dueDate == date}
        return dueToday
    }
}
