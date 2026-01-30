fun main() {
    print("For Loop: ")
    for(k in 1..5){
        print("$k ")
    }

    print("\nwhile loop: ")
    var i =1
    while(i<=5){
        print("$i ")
        i++
    }

    print("\ndo-while loop: ")
    var j = 1
    do{
        print("$j ")
        j++
    }
    while(j<=5)

    print("\nEven numbers: ")
    for(num in 1..20){
        if(num % 2 == 0){
            print("$num ")
        }
    }

    print("\nSum: ")
    var sum = 0
    for(s in 1..10){
        sum += s;
    }
    print(sum)
}