package Ejercicios_Clases_Kotlin

open class Animal {

    private var nombre:String = "";
    private var especie:String = "";
    private var tipo:String = "";
    private var descripcion:String = "";

    //CONSTRUCTOR PADRE

    constructor(nombre:String, especie:String, tipo:String, descripcion:String ) {
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    override fun toString(): String{
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nTipo: " + tipo + "\nDescripción : " + descripcion;
    }
}