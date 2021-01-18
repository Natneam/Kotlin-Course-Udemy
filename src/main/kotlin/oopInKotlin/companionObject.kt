package oopInKotlin

fun main(){
    // Companion objects
    var a = Letters()
    for (l in Letters.letters){
        print("$l ")
    }
    println()
}

class Letters(){
    companion object{
        val letters = arrayOf('A','B','C','D','E','F','G','H','I','J','K','L','M'
            ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
    }
    var l = 'h'
}
