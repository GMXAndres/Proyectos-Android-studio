package com.gmxandres.androidmaster.exercises

/**
Por lo general, el teléfono te proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código,
escribe un programa que imprima el mensaje de resumen según la cantidad de
notificaciones que recibiste. El mensaje debe incluir lo siguiente:

La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más

RESULTADO:
- You have 51 notifications.
- Your phone is blowing up! You have 99+ notifications.
 */

fun main(){
    val notificManana=51
    val notificTarde=135

    printNotificSummary(notificManana)

    printNotificSummary(notificTarde)
}
fun printNotificSummary(numberOfMessages:Int){

    if(numberOfMessages >=100){
        println("Your phone is blowing up! You have 99+ notifications")
    }else {
        println("You have $numberOfMessages notifications")
    }
}
