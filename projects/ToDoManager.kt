fun main() {

    val tasks = mutableListOf<String>()

    while (true) {

        println("\n==== To-Do Manager ====")
        println("1. Add Task")
        println("2. View Tasks")
        println("3. Remove Task")
        println("4. Exit")

        print("Choose option: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {

            1 -> {
                print("Enter task: ")
                val task = readLine()
                if (!task.isNullOrBlank()) {
                    tasks.add(task)
                    println("Task added.")
                }
            }

            2 -> {
                println("\nYour Tasks:")
                if (tasks.isEmpty()) {
                    println("No tasks available.")
                } else {
                    tasks.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                }
            }

            3 -> {
                print("Enter task number to remove: ")
                val index = readLine()?.toIntOrNull()

                if (index != null && index in 1..tasks.size) {
                    tasks.removeAt(index - 1)
                    println("Task removed.")
                } else {
                    println("Invalid task number.")
                }
            }

            4 -> {
                println("Goodbye!")
                break
            }

            else -> println("Invalid option.")
        }
    }
}