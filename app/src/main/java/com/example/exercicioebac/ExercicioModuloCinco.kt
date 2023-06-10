package com.example.exercicioebac

class ExercicioModuloCinco {
}

fun main() {

    var veiculo = Veiculo ()
    veiculo.print()
    veiculo.accele(100)
    veiculo.print()
    veiculo.velo(50)
    veiculo.print()
}

class Veiculo{

    var velocity: Long = 0
    var acceleration: Long = 10
    var model: String = ""

    fun accele(aumont: Long){
        acceleration = acceleration + aumont
    }

    fun velo(aumont: Long): Long{
        velocity = velocity - aumont

        if (velocity < 0)
            velocity = 0
        return velocity
    }

    fun print (){
        println("velocity: $velocity, accelaration: $acceleration")
    }
}