package com.gmxandres.androidmaster.sintaxis

//variables globales
val floatExample: Float = 3.14159F
val age = 28

//variables
fun main() {
    showMyName("Andres")
    showMyAge(28)
    add(2,2)
    val myResta= resta(15,5)
    println(myResta)
    println(restaCool(3,3))
}

fun showMyName(name:String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int=18) {
    println("tengo $currentAge años")
}
fun add(num1: Int,num2: Int){
    val suma=num1+num2
    println("La suma da: $suma")
}
fun resta(num1:Int,num2:Int):Int{
    return num1-num2
}

fun restaCool(num1:Int,num2:Int)=num1-num2

fun variablesNumericas() {
    //-2,147.483.647 - 2,147.483.647
    var age2: Int = 31
    age2 += age
    println(age2)
    val long: Long = 4589382//'9,223,372,036,854,775,807
    val doubleExample: Double = 3241.2345
    println(long)
}

fun variablesBooleanas() {
    val siONo: Boolean = true
}

fun variablesAlfanumericas() {
    //val es constant y var es variable
    //alphanumerics
    val charExample: Char = 'A'
    val charExample2: Char = '@'
    val charExample3: Char = '*'
    val name: String = "Andres"
    println(age + floatExample.toInt())//convertimos float a entero .toInt()
    var saludo: String = "Hola me llamo $name y tengo $age años"
    println(saludo)
}

class variables {
}