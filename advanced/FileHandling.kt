import java.io.File

fun main() {

    val file = File("sample.txt")

    // Writing to file
    file.writeText("Hello from Kotlin File Handling!")

    println("Data written to file.")

    // Reading from file
    val content = file.readText()
    println("File Content:")
    println(content)

    file.appendText("\nLearning Kotlin is fun!")
    println(file.readText())
}