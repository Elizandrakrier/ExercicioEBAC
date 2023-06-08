package com.example.exercicioebac.modulo.sete

class ExercicioTres {
}

fun main() {

    UtilityHelper.isWeekend()
    UtilityHelper.setCurrentDay(OfWeek.DOMINGO)
    UtilityHelper.isWeekend()
}

enum class OfWeek(val relacao: String){
    SEGUNDA ("segunda"),
    TERCA ("terça"),
    QUARTA("quarta"),
    QUINTA ("quinta"),
    SEXTA ("sexta"),
    SABADO ("sábado"),
    DOMINGO ("domingo")
}

object UtilityHelper{
    private var currentDay: OfWeek = OfWeek.SABADO

    fun setCurrentDay(novoPadrao: OfWeek){
        this.currentDay = novoPadrao
    }

    fun isWeekend() = println(currentDay)
}