package com.example.exercicioebac.modulo.sete

class ExercicioUm {
}

fun main() {

//    exercício 1
    var primeiraA = "A"
    println(primeiraA.myString())

    var terceiraB = "B"
    println(terceiraB.myString())

    var quartaC = "C"
    println(quartaC.myString())
}

fun String.myString() : String{
    return "primeira letra " + this
}

data class Lista ( var primeira: String, var segunda: String, var terceira: String){}
