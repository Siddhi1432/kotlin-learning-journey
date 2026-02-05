data class User(val id:Int, val name:String)

fun main() {
    val user1 = User(1, "Siddhi")
    val user2 = User(1, "Siddhi")

    println(user1)
    println("is user equal?: ${user1 == user2}")

    checkStatus(Status.SUCCESS)

    handleResult(Result.Success("Data Loaded"))
}

enum class Status{
    SUCCESS,
    ERROR,
    LOADING,
}

fun checkStatus(status : Status){
    when(status){
        Status.SUCCESS -> println("operation successful")
        Status.ERROR -> println("Something went wrong")
        Status.LOADING -> println("loading")
    }
}

sealed class Result{
    data class Success(val data:String):Result()
    data class Failure(val error:String):Result()
}

fun handleResult(result:Result){
    when(result){
        is Result.Success -> println("Success: ${result.data}")
        is Result.Failure -> println("Failure: ${result.error}")
    }
}