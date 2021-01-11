package functions

fun main(){
    extensionFunctions()
}

fun extensionFunctions(){
    class Calculator{
        fun add(a:Int, b:Int) = a+b
        fun subtract(a:Int, b:Int) = a-b
    }
    val a:Int = 10
    val b:Int = 20
    val c:Int = 3
    var calc = Calculator()
    println("Sum of $a and $b is ${calc.add(a,b)}")
    println("Difference of $a and $b is ${calc.subtract(a,b)}")

//    What if I want to multiply numbers using Calculator class

    fun Calculator.multiply(a:Int, b:Int):Int = a*b

    println("Product of $a and $b is ${calc.multiply(a,b)}")

//    we can add extension function to built in class as well

//    if I make a.add(b) this wouldn't work be cause Int class has no <add> function or method
//    fortunately we can make one using extensions function
    fun Int.add3Nums(num2:Int, num3:Int):Int = this+num2+num3 // this will add 3 numbers and it is in Int class
    println("sum of $a $b and $c is ${a.add3Nums(b,c)}")
}