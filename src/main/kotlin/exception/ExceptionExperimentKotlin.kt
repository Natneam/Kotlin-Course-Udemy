package exception

import java.sql.SQLException
import kotlin.IllegalArgumentException
import kotlin.jvm.Throws

fun main(args: Array<String>){
    try{
        throwingException(2)
        throwingException(1)
        throwingException(3)
    }catch (e: Exception){
        println("$e occurred")
    }finally {
        println("Finally block!!")
    }
}
@Throws (SQLException::class, NullPointerException::class, IllegalArgumentException::class)
fun throwingException(a:Int){
    when(a){
        1 -> throw SQLException()
        2 -> throw NullPointerException()
        3 -> throw IllegalArgumentException()
        4 -> throw CustomException("Hello I'm Custom Exception")
    }
}

class CustomException(a:String): Exception(a)