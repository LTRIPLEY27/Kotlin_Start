package kotlinActividades

open class Persona {

    // ATRIBUTOS

    public var name:String = "";
    var edad:Int = 10;
    var trabajo:Boolean = true;


    init {
        println("Constructor");
        name = "Stewart";
        edad = 30;
    }
    // CONSTRUCTOR
    constructor(name:String, edad:Int, trabajo:Boolean){
        this.name = name;
        this.edad = edad;
    }

}