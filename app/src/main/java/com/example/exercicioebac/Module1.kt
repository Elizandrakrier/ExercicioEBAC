package com.example.exercicioebac

class Module1 {
}

fun main() {
//    Exercicio 1
    var exerciseOne = 6
    exerciseOne = 5
    println(exerciseOne)

//   Exercicio 2
    val exerciseTwo = 6
//    não é possível alterar

//    Exercicio 3
    var numeroPar = 8
    if(numeroPar % 2 == 0){
        println("O número é par")
    } else{
        println("O número é impar")
    }

//    Exercicio 4
    var numeroPares = 10
    when{
        numeroPares % 2 == 0 -> println("O numero é par")
        else -> println("O numero é impar")
    }

//    Exercicio 5
    var collectionExercise : Array<Int> = Array(40){0}
    var i = 0

    for (i in 0..41){
        println(i)
    }

//    Exercicio 6
    var mutaList : MutableList<Int> = mutableListOf()
    var j = 1

    for (j in 1..99){
        println(j)
    }

    var soma = 0
    for(j in 1..mutaList.size){
        soma = mutaList[j] + 1
        println(soma)
    }
}
