import kotlin.random.Random

fun generatePassword(length: Int): String {

    val characters =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"

    val password = StringBuilder()

    for (i in 1..length) {
        val randomIndex = Random.nextInt(characters.length)
        password.append(characters[randomIndex])
    }

    return password.toString()
}

fun main() {

    println("=== Password Generator ===")

    print("Enter password length: ")
    val length = readLine()?.toIntOrNull()

    if (length == null || length <= 0) {
        println("Invalid length.")
        return
    }

    val password = generatePassword(length)

    println("Generated Password: $password")
}