fun main(){
    println("Enter name: ");
    val name = readLine();

    println("Enter age:");
    val age = readLine()?.toInt()

    println("Hello $name");
    println("You are $age years old");
}