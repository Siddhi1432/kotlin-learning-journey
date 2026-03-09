import java.io.File

fun main() {

    val file = File("notes.txt")
    val notes = mutableListOf<String>()

    if (file.exists()) {
        notes.addAll(file.readLines())
    }

    while (true) {

        println("\n=== Notes Manager ===")
        println("1. Add Note")
        println("2. View Notes")
        println("3. Save Notes")
        println("4. Exit")

        print("Choose option: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {

            1 -> {
                print("Enter note: ")
                val note = readLine()
                if (!note.isNullOrBlank()) {
                    notes.add(note)
                    println("Note added.")
                }
            }

            2 -> {
                println("\nYour Notes:")
                if (notes.isEmpty()) {
                    println("No notes available.")
                } else {
                    notes.forEachIndexed { index, note ->
                        println("${index + 1}. $note")
                    }
                }
            }

            3 -> {
                file.writeText(notes.joinToString("\n"))
                println("Notes saved to file.")
            }

            4 -> {
                println("Exiting Notes Manager.")
                break
            }

            else -> println("Invalid option.")
        }
    }
}