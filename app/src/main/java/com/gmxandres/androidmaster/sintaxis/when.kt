package com.gmxandres.androidmaster.sintaxis
val month:Int=1

fun main(){
    getMonth(month)
    getSemestre(month)
    val result = getTrimestrer(month)
    println(result)
    result(1)
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3-> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubtre")
        11 -> {println("Noviembre")
        println("Noviembre")
        println("Noviembre")
        println("Noviembre")
        }
        12 -> println("Diciembre")
        else  ->  println("No es un mes valido")
    }
}

fun getTrimestrer(month:Int)= when(month){
        1,2,3 ->  "Primer Trimestre"
        4,5,6 ->  "Segundo Trimestre"
        7,8,9 ->  "Tercer Trimestre"
        10,11,12 ->  "Cuarto Trimestre"
        else ->  "Trimestre no valido" }


fun getSemestre(month:Int){
    when(month){
       in  1..6 ->println("Primer semestre")
       in 7..12 ->println("Segundo semestre")
       !in 1..12 ->println("Semestre no valido")
    }
}

fun result(value:Any){
    when(value){
        is Int -> value+value
        is String->println(value)
        is Boolean->if(value) println("Es verdadero")
    }
}