//this file contains notes from part 1 to part 7

fun main(){
    // printing hello world
    println("Hello guys")
    println("What's up?")

    // declaring a variable
    var myVariable: Int = 5
    println(myVariable)

    // also we dont need to specify the data type too. Kotlin compiler can automatically detect the date type of the entered value
    var myVariable2 = 10
    myVariable2 = 10
    println("The value of my Variable : $myVariable2")

    // use of val keyword
    val variable = 8
    println("The value is : $variable")

    // Boolean data type representation
    var flag1: Boolean = true
    println(flag1)
    flag1 = false
    println(flag1)

    // Arithemetic Operators
    val x = 5
    val y = 10
    var result = x + y //adding variables
    println("The result of x + y is : ${x + y}")
    println(result)
    result = 22 + 23
    println(result) // adding numbers directly
    println(15+7) // directly inside print

    // the same rules go with all operators - "+,-,*,/"


    // HOME WORK
    var a = 5
    var b = 23
    var c = 2
    println("a : $a")
    println("a + b : ${a + b}")
    println("a + b + c : ${a + b + c}")

    // printing a sentence
    var age = 19
    var favNumber = 7
    println("My age is $age and my favorite number is $favNumber")

    // Decimal numbers
    var newVariable = 20F
    var newVariable2 = 8F
    println("The result of division of two numbers is ${20F/8F}")

    // to be more accurate we will put in more numbers after the decimal but there is also
    // a limit as to how many decimals we can put, for more decimals we need to use double
    // data type which is more accurate than float data type

    var p: Float = 20.3455343545454354F
    var q: Float = 3.24343434341453F
    println("The value p/q is : ${p/q}")

    // float takes only limited significant figures, for double we just need to remove the F
    // part and rest everything remains same ex. var a = 23.3414333534545 we dont need to add D


    // Homework 2 - Volume of the sphere
    val pi = 3.14159265
    var r = 5
    var volume: Double = 0.75*pi*(5*5*5)
    println(volume)

    // STRINGS
    val string = "this is a sample text"
    println(string)
    println("My string is : $string")
    // use of dot operator
    println("My string in uppercase is : ${string.toUpperCase()}")


    //Homework 3 - print your name in uppercase and reverse
    var name = "Poorva"
    name = name.toUpperCase()
    println("My name in Upper Case is : $name")
    println("Reverse of string : ${name.reversed()}")
}
