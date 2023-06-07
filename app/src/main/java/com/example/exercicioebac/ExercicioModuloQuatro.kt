package com.example.exercicioebac

class ExercicioModuloQuatro {
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

    var velocity: Long
    var acceleration: Long
    var model: String

    init {
        this.velocity = 0
        this.acceleration = 10
        this.model = ""
    }

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