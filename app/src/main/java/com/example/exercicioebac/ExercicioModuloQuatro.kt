package com.example.exercicioebac

class ExercicioModuloQuatro {
}

fun main() {
//    Exercicio 1 - Função simples
    val somatoria = somaUm(5,10)
    println(somatoria)

//    Exercicio 2 - Função compacta
    val somatoriaDois = somaDois(5,2)
    println(somatoriaDois)

//    Exercicio 3
    calculadora(5,7, ::calculaSoma)
    calculadora(5, 10, ::calculaMulti)

//    Exercicio 4
    val numeroList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)
    val filtrandoList = numeroList.filter {it % 2 == 0 }
    println(filtrandoList)

//    Exercicio 5
    val nomeList = listOf<String>("Eli", "Bia", "José", "Maria")
    val fraseList = nomeList.map { "Olá, $it. Tudo bem?" }
    println(fraseList)

    fraseList.forEach{
        println(it)
    }
}

//    Exercicio 1
fun somaUm (numeroUm: Int, numeroDois: Int) : Int {
    var resultadoSoma = numeroUm+numeroDois
    return resultadoSoma
}

//    Exercicio 2
fun somaDois(numeroTres: Int, numeroQuatro: Int) = numeroTres * numeroQuatro

//    Exercicio 3
fun calculaMulti(numeroNove: Int, numeroDez: Int) = println(numeroNove * numeroDez)

fun calculaSoma(numeroSete: Int, numeroOito: Int) = println(numeroSete+numeroOito)

fun calculadora(numeroCinco: Int, numeroSeis: Int, operacao: (Int, Int) -> Unit){
    operacao(numeroCinco, numeroSeis)
}