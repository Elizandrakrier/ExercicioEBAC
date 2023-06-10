package com.example.exercicioebac

class ExercicioModuloSeis {
}

fun main() {

//    Exercise 1 e Exercise 3
    val veiculos = Moto(velocity = 0, acceleration = 5, model = "CG")
    veiculos.accelera = 5
    println(veiculos)

    val factory = VeiculosFactory()
    val veiculosList:  MutableList<Veiculos> = mutableListOf()

    for (i in 1..5){
        val motors = factory.criandoUmVeiculo(i % 2)
        veiculosList.add(motors)
    }

    veiculosList.forEach{
            motors ->
        println(motors)
        if (motors is Moto){
            motors.accelera
        }
        println(veiculos)
    }

//        Exercise 2
//    val veiculos = Moto(velocity = 0, acceleration = 5, model = "CG")
//    veiculos.accelera = 5
//    println(veiculos.print())
}

// Exercise 1
//abstract class Veiculos{
//
//    abstract var velocity: Long
//    abstract var acceleration: Long
//    abstract var model: String
//
//    fun print () {
//        println("velocity: $velocity, accelaration: $acceleration")
//    }
//}
//
//class Carro(
//    override var velocity: Long,
//    override var acceleration: Long,
//    override var model: String
//) : Veiculos() {
//
//    var nomeModelo = "Fusca"
//}
//
//class Moto(
//    override var velocity: Long,
//    override var acceleration: Long,
//    override var model: String) : Veiculos(){
//
//    var accelera = 0
//}


// Exercise 2
//interface Veiculos{
//
//    val velocity: Long
//    val acceleration: Long
//    val model: String
//
//    fun print () {
//        println("velocity: $velocity, accelaration: $acceleration")
//    }
//}
//
//class Carro(
//    override var velocity: Long,
//    override var acceleration: Long,
//    override var model: String
//) : Veiculos {
//
//    var nomeModelo = "Fusca"
//}
//
//class Moto(
//    override var velocity: Long,
//    override var acceleration: Long,
//    override var model: String) : Veiculos{
//
//    var accelera = 0
//}

// Exercise 3

class VeiculosFactory{
    fun criandoUmVeiculo (type: Int) : Veiculos{
        return when(type){
            1 -> Carro(velocity = 0, acceleration = 7, model = "Ka")
            else -> Moto(velocity = 5, acceleration = 5, model = "CG")
        }
    }
}

abstract class Veiculos{

    abstract var velocity: Long
    abstract var acceleration: Long
    abstract var model: String

    override fun toString() = ("velocity: $velocity accelaration: $acceleration model: $model" )

}

class Carro(
    override var velocity: Long,
    override var acceleration: Long,
    override var model: String
) : Veiculos() {

    var nomeModelo = "Fusca"
}

class Moto(
    override var velocity: Long,
    override var acceleration: Long,
    override var model: String) : Veiculos(){

    var accelera = 0
}