fun main(args: Array<String>) {
    println("Hello World!")
    var y = 'a';
    var c:Char = 'a'; // MANERA DE ESPECIFICAR UNA VARIABLE ":"

    println(y);
    println(c);

    var apells = "calzadilla";
    println(apells.get(3));

    //ARRAYS

    var listaEstudiantes = arrayOf("lu", "esther", "fer");
    println(listaEstudiantes[2]);

    // CONSTANTES

    val estudiante = "frans";

    println(estudiante);

    // CONDICIONALES

    var edad:Int = 10;
    var votar:Boolean = false;
    if( edad < 18) votar = true else votar;

    println(votar);

    // RANGOS DESDE LA 'A' A LA 'Z'
    val abecedario = 'a'..'z';

    val valores = 1 .. 9;
    println(abecedario);
    println(valores);

    for(num in valores){
        println(num);
    }

    for(letra in abecedario){
        println(letra);
    }

    // arrays

    val array = arrayListOf<String>("peter", "perez", "astro", "dolan");

    for(arr in array){
        println(arr)
    }
    println(array[2]);

    // ADICIÓN DE NUEVO ELEMENTO
    array.add("jordi");

    // VERIFICACION
    for(arr in array){
        println(arr)
    }

    // FUNCIONES

    fun saludar(){
        println("buenos días");
        var saludo:String = "Buenos días por la mañana";
    }

    fun despedir(): String {
        println("buenas noches");
        var adios:String = "Adiós por la noche";
        return adios;
        //
        //return adios;
    }

    saludar();
    println(despedir());

    fun saludame(name : String): String{
        var nombre = name;
        return nombre;
    }

    println(saludame("Jorge"));

    /// SOBRECARGA DE FUNCIONES

    fun saludar(dia:Int, mes: Int,nombre: String, trabajas: Boolean): Unit {
        println("Buenos días, hoy es $dia, del mes $mes, saludos a ti $nombre, estas trabajando $trabajas");
    }

    saludar(11, 2, "luis", true);


    // FUNCIONES ABREVIADAS
    fun square(n:Int, m:Int) = n * m

    println(square(5,5));

    //VARARGS : VAR (VARIABLE) + ARGS (ARGUMENTOS)

    fun saluditos(vararg saluditos : String) {
        for(item in saluditos) {
            println(item);
        }
    }

    var name:String = "Ayad";
    // LA FUNCIÓN RECIBE UNA SERIE DE PARÁMEROS Y VARIABLES QUE PUEDE IMPRIMIR
    saluditos(name, "Buenos dias", "Buenas noches");
}