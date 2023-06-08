package com.example.exercicioebac.modulo.sete

class ExercicioDois {
}

fun main() {

    var segunda : DayOfWeek = DayOfWeek.SEGUNDA
    segunda = DayOfWeek.SEGUNDA
    println(segunda)
}

enum class DayOfWeek(val relacao: String){
    SEGUNDA ("segunda"),
    TERCA ("terça"),
    QUARTA("quarta"),
    QUINTA ("quinta"),
    SEXTA ("sexta"),
    SABADO ("sábado"),
    DOMINGO ("domingo")
}
