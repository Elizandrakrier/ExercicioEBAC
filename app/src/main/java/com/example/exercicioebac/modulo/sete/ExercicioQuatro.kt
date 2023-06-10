package com.example.exercicioebac.modulo.sete

class ExercicioQuatro {
}

fun main() {

    var falsoRetorno: Week = Week.SEGUNDAS

    when{
        Week.SEGUNDAS == Week.TERCAS -> println("correto")
        else -> println("falso")
    }

    var weekends: UtilHelper = UtilHelper
    weekends.weekend()
}

enum class Week (val relacoes: String) {
    SEGUNDAS("segundas"),
    TERCAS("terça"),
    QUARTAS("quarta"),
    QUINTAS("quinta"),
    SEXTAS("sexta"),
    SABADOS("sábado"),
    DOMINGOS("domingo");

}

object UtilHelper {
    private var current: Week = Week.DOMINGOS

    fun setCurrent(noPadrao: Week){
        this.current = noPadrao
    }

    fun weekend() = println(current)
}