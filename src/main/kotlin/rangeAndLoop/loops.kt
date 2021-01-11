package rangeAndLoop

fun main(){
    var arr = arrayOf("Ethiopia", "Kenya", "UAE", "Eritrea")
//    rangeAndLoop.testForLoop(arr)
//    rangeAndLoop.testDoWhileLoop(arr)
//    rangeAndLoop.testRange()
    testBreakContinueAndLabel()
}


fun testForLoop(arr: Array<String>){
//    for (i in arr){
//        println(i)
//    }
    for (i in arr.indices){
        println(arr[i])
    }
}

fun testWhileLoop(arr: Array<String>){
    var i = 0
    while (i < arr.size){
        println(arr[i])
        i++
    }
}

fun testDoWhileLoop(arr: Array<String>){
    var i = 0
    do{
        println(arr[i])
        i++
    }while(i < arr.size)
}

fun testRange(){
    for (i in 97..123) print("$i ")
    println()
    for (i in 97..123 step 2) print("$i ")
    println()
    for (i in 123 downTo 70) print("$i ")
    println()
    for (i in 123 downTo 70 step 10) print("$i ")
}

fun testBreakContinueAndLabel(){
    outerLoop@for (i in 0..9){
        for (j in 0..9 ){
            print("$i:$j ")
            if (i==j){
//                println()
//                continue@outerLoop
                print('-')
                continue
            }
        }
        println()
    }
}