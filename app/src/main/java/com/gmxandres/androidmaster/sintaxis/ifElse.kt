package com.gmxandres.androidmaster.sintaxis

fun main(){
    ifBasico()
    ifAnidado()
    multiplesIf()
    multiplesOr()
}

fun ifBasico(){
    val name="lucas"

    if (name =="Andres"){
        println("La variable es Andres")
    } else{
        println("la variable es $name")
    }
}

fun ifAnidado(){
    val animal="rino"
    if (animal=="dog"){
        println("El animal es un perro")
    }else if(animal=="gato"){
        println("El animal no es un perro")
    }else if(animal=="bird"){
        println("El animal es un pajaro")
    }else{
        println("El animal no esta registrado")
    }
}

fun multiplesIf(){
    var edad=18
    var permiso = true
    var feliz=true

    if (edad==18 && permiso && feliz){
        println("vamo' a Beber")
    }else{
        println("No vamo a' Beber")
    }

}

fun multiplesOr(){
    var animal="gato"
    var feliz=true
    if (animal=="gato" || (animal=="perro" && feliz)){
        println("El animal es un gato o un perro y eso me hace feliz!")
    }

}