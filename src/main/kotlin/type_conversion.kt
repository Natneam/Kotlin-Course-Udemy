fun main(args: Array<String>) {
    var a:Int = 20
    // var b: Long = a //wouldn't work, we have to explicitly convert between types 
    var b: Long = a.toLong()
    println(b)
}