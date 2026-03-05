fun add(a: Double, b: Double) = a + b
fun subtract(a: Double, b: Double) = a - b
fun multiply(a: Double, b: Double) = a * b
fun divide(a: Double, b: Double) = a / b

fun main() {

    println("=== Kotlin CLI Calculator ===")

    while (true) {

        println("\nChoose operation:")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide")
        println("5. Exit")

        print("Enter choice: ")
        val choice = readLine()?.toIntOrNull()

        if (choice == 5) {
            println("Exiting calculator.")
            break
        }

        print("Enter first number: ")
        val num1 = readLine()?.toDoubleOrNull()

        print("Enter second number: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input!")
            continue
        }

        val result = when (choice) {
            1 -> add(num1, num2)
            2 -> subtract(num1, num2)
            3 -> multiply(num1, num2)
            4 -> if (num2 != 0.0) divide(num1, num2) else {
                println("Cannot divide by zero!")
                continue
            }
            else -> {
                println("Invalid choice")
                continue
            }
        }

        println("Result: $result")
    }
}