fun main(){
    greetings()
    maths()
    miracles()
    info()
    miaka()
}
//first example(Hello world)
fun greetings(){
println("1.Hello Daniel...")
}
//second example aithmetics operations
fun maths(){
    println(5 + 15)//addition
    println(15 - 5)//substraction
    println(50 / 2)//division
    println(5 * 15)//multiplication
    println(19 % 3)//modulus
}
//third example problem statements
fun miracles(){
    //val is a constant in kotlin hence we use var mostly
    var fish= 2*500
    var loaf= 5*1
    println(fish * loaf)//prints 5
}
//fourth example types of variables
fun info(){
var name = "Ambrose"//string variable
var name2='M'//Char variable
var age=24//int variable
var total=309.89//double variable
var isEasy=true//boolean variable
println(name + name2 + age + total + isEasy)
}
//fifth example control statements
fun miaka(){
var age=20
if(age!==20 || age<10){
    println("Age is below average ")}
    else{
        println("Age is above average")

    }
}

