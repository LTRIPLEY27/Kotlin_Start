package Ejercicios_Clases_Kotlin

// REDUCCIÓN DE SINTÁXIS PARA GERENCIA E IMPLEMENTS DE INTERFACES
class Tiburon : Animal,  Alimentacion{

    private var familia : String = "";
    private var ubicacion : String = "";
    //llamado al constructor heredado con ésta sintáxis
    constructor(nombre: String, especie: String, tipo: String, descripcion: String, familia :String, ubicacion : String) : super(nombre, especie, tipo, descripcion) {
        this.familia = familia;
        this.ubicacion = ubicacion;
    }

    override fun obtieneAlimento() {
        println("Se alimenta de otros peces y especies");
    }

    override fun toString(): String {
        return "Tiburon(familia='$familia', ubicacion='$ubicacion')" + super.toString();
    }
}