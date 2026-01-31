fun main(){
    var numbers = arrayOf(1,2,3,4,5)
    print("Array Elements: ")
    for (num in numbers) {
        print("$num ")
    }

    var fruits = listOf("Apple","Mango","Banana")
    print("\nList Elements: ")
    fruits.forEach(){
        print("$it ")
    }

    var languages = mutableListOf("Kotlin","Java")
    languages.add("Python")
    print("\nMutable List Elements: ")
    print(languages)

    languages.remove("Python")
    print("\nAfter removing language: ")
    print(languages)

    print("\nKotlin Exists: ")
    print(languages.contains("Kotlin"))
}