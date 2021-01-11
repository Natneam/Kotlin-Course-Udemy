package functions

// Rule to create in fix functions
//1: the function should be member function or extension function to some class
//2: the function should have only one parameter
//3: the function shouldn't have default argument for the parameter

// lets add infix function to Int class
infix fun Int.add2Nums(b:Int):Int = this+b // this is valid infix function

fun main(){
    val a:Int = 10
    val b:Int = 20

//we can call infix functions in two ways
    println(a.add2Nums(b)) //1
    println(a add2Nums b) //2 more sophisticated way
}
