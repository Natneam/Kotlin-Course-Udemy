package functions

import java.math.BigInteger

fun main(){
//    print(factorial(BigInteger.valueOf(100000))) //this will throw StackOverflowError
    print(tailrecFactorial(BigInteger.valueOf(100000))) //this won't
}

// let's experiment recursion function first

fun factorial(number:BigInteger):BigInteger{
//    if(a == BigInteger.ONE){
//        return BigInteger.ONE
//    }else{
//        return a * factorial(a-BigInteger.ONE)
//    }
    return when(number){
        BigInteger.ONE -> BigInteger.ONE
        else-> number * factorial(number-BigInteger.ONE)
    }
}

tailrec fun tailrecFactorial(number:BigInteger, result:BigInteger=BigInteger.ONE):BigInteger{
    return when(number){
        BigInteger.ONE -> result
        else -> tailrecFactorial(number-BigInteger.ONE, number*result)
    }
}