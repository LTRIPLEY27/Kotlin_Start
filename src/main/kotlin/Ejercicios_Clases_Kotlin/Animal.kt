package Ejercicios_Clases_Kotlin

open class Animal {

    private var nombre:String = "";
    private var especie:String = "";
    private var tipo:String = "";
    private var descripcion:String = "";
    private var edadPromedio:Int = 0;

    //CONSTRUCTOR PADRE

    constructor(nombre:String, especie:String, tipo:String, descripcion:String, edadPromedio : Int ) {
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.edadPromedio = edadPromedio;
    }

    override fun toString(): String{
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nTipo: " + tipo + "\nDescripción : " + descripcion + "\nEdad promedio : " + edadPromedio;
    }
}