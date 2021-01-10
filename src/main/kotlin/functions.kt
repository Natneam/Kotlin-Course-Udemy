fun main(){
    println(returnFormattedName("Natneam", "Mesele"))
    println(simpleInterest(190, 3, 5.0))
    println(simpleInterest(principal=100, rate=5.0, year=7))
    println(simpleInterest(principal=100, year=7))
}

fun returnFormattedName(firstName:String, lastName:String)="$firstName $lastName"

fun simpleInterest(principal:Int, year:Int, rate:Double = 0.0):Double {
    return principal*(year*12)*rate/100
}