package com.gmxandres.androidmaster.exercises

/**
Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular. Tiene una plantilla de cadenas, que se basa en la variable
discountPercentage para el porcentaje de descuento y la variable item para el artículo en oferta. Sin embargo, existen errores de compilación en el código.

 Resultado
Sale - Up to 20% discount on Google Chromecast! Hurry up!
 */

fun main() {
    var discountPercentage = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
