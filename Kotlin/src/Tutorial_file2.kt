// This file contains notes from part 8 to

fun main(){
    // Part 8 : logical and comparison operators they return boolean
    val x = 4
    val y = 5
    println("Is x equal to y : ${x == y}") // this is like if (x == y) return true else false
    println("Is x less than y : ${x<y}")

    // use of logical operators too
    val a = 9
    val b = 9
    println("Is x not equal to y or a not equal to b : ${(x != y)||(a != b)}")

    // Home work:-
    // evaluate the given expression first in your mind and then see whether ans is what you expected or not
    println(3>4||4>3&&4<=4)

    // second question
    val bool = true
    val num1 = 9
    val num2 = 3
    val num3 = 9
    println(!(num1 != num3) && bool || num3 > (num1 + num2) && (!bool || num2 < num3))

    // PART 9 : IF CONDITIONS
    // all basic operations are just the same as what learnt before; something new:-
    
}

