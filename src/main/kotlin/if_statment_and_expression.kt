fun main(args: Array<String>) {
    var a:Int = 25
    var b:Int = 250
    println(max1(a,b))
    println(max2(a,b))
}

fun max1(a:Int, b:Int):Int{
    var max:Int
    // common way of writing if statement 
    if (a >= b) {
        max = a
    }else{
        max = b
    }
    return max
}

fun max2(a:Int, b:Int):Int{
    // writing if statements as expression
    var max:Int = if(a >= b){
        a
    }else{
        b
    }
    return max
}