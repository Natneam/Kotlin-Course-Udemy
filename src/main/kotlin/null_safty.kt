fun main(args: Array<String>) {
    var a:String = "hi"
    // a = null // this will raise an error at compile time be cause of null safety
    println(a)

    var b:String ?= "Hello"
    b = null
    println(b?.length) // but this one will print null because it applies null safety syntax

    // methods to prevent our code from null pointer exception
    // accessing variables using null safety <?.> operator and using elvis operator we can give default value when the value is null
    println("The word length in variable b is ${b?.length ?: -1}")
    // using let scope function (higher order function)
    b?.let{
        println("length : ${it}")
    }
    // a way to raise error on null safety variables
//    println(b!!.length)
}