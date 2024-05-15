package com.gmxandres.androidmaster.sintaxis

fun main() {

    val weekDays= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(weekDays[2])
    println(weekDays.size)
    //bucles para arrays
    for (position in weekDays.indices){
        println(weekDays[position])
    }
    for ((pos, valu)in weekDays.withIndex()){
        println("La ´posicion es $pos y contiene $valu")
    }

    for (week in weekDays){
        println("El dia es $week")
    }
    println(weekDays)//muiestra direccion en memoria
}