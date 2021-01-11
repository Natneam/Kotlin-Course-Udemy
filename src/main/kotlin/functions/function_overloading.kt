package functions
// function over loading is the concept of having many methods(functions) with different parameter number or type
fun main(){
    println(display(10))
    println(display(10, 49))
    println(display(10.0))
    println(display(10, 49.0))

}

fun display(a:Int):String = "1: Int a = $a"
fun display(a:Int, b:Int):String = "2: Int a = $a Int b = $b"
fun display(a:Double):String = "1: Double a = $a"
fun display(a:Int, b:Double):String = "1: Int a = $a Double b: $b"
