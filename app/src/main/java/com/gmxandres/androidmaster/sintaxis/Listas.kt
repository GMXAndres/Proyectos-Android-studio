package com.gmxandres.androidmaster.sintaxis

fun main(){
    inmutableList()
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(weekDays)
    weekDays.add("LoL")//añade al final de la lista
    println(weekDays)
    weekDays.removeAt(2)//remueve el elemento en el indice 2
    println(weekDays)
    weekDays.remove("LoL")//remueve por String
    println(weekDays)
    weekDays.add(2,"Miercoles")//Añade con posicion y String
    println(weekDays)

    if (weekDays.isEmpty()){//pintamos los elementos dela lista .isEmpty verifica si esta vacia
        //no hace nada
    }else {
        weekDays.forEach{println(it)}
    }

    if (weekDays.isNotEmpty()){//pintamos los elementos dela lista .isNotEmpty verifica si no esta vacia
        weekDays.forEach{ println(it)}
    }else{
        println("La lista esta vacia")
    }

}



fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])//muesstra posicion 0
    println(readOnly.last())//muestra ultimo
    println(readOnly.first())//muestra el primero
//filtrar
    val example = readOnly.filter {it.contains("n") }
    println(example)
//Iterar
    readOnly.forEach{weekDay -> println("dia es $weekDay")}//Muestra todos los datos de la lista con un comentario inicial

}