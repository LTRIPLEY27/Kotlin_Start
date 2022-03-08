import kotlin.system.exitProcess

fun main(args: Array<String>) {
    /*Crea un when con rangos de diez números del 0 al 100. Cada intervalo te mostrará por pantalla que nota has sacado (0 al 10, suspenso, 11 al 20 suspenso...).*/

    // ES UN TIPO VOID CUANDO SE DEFINE DE ESTA MANERA PUES SOLO IMPRIME Y NO RETORNA VALOR
    fun nota (note : Int) {
        when(note) {
            in 0..10 -> println("Reproved");
            in 11..20 -> println("Reproved");
            in 21..30 -> println("Reproved");
            in 31..40 -> println("Reproved");
            in 41..50 -> println("Reproved");
            in 51..60 -> println("aproved");
            in 61..70-> println("good");
            in 71..80 -> println("notable");
            in 81..90 -> println("Bastante bien");
            in 91..100 -> println("Excelente");
        }
    }

    System.out.println("Indique nota");
    var note = readLine()?.toInt() as Int;
    nota(note);

    /*2.Crea cuatro funciones: a.Una sumará dos númerosy los mostrará por pantalla.b.Otra multiplicará tres números y los mostrará por pantalla.c.Otra dividirá cuatro números y los mostrará por pantalla.d.Otra te dará la media de tres números introducidosy los mostrará por pantalla.*/

    val opciones = arrayOf("Suma", "multiplica", "divide", "media");
    System.out.println("Indica opcion \n 1. Suma \n 2. multiplica \n 3. divide \n 4. media \n 5. Salir");
    var eleccion = readLine()?.toInt() as Int;

    do {
        System.out.println("Indica opcion \n 1. Suma \n 2. multiplica \n 3. divide \n 4. media \n 5. Salir");
        var eleccion = readLine()?.toInt() as Int;
        when(eleccion) {
            1 -> suma();
            2 -> multiplica();
            3 -> divide();
            4 -> media();
        }
    }while (eleccion != 5);

}

// FUNCIONES QUE LLAMA EL WHEN PARA CADA CASO

    fun suma(){
        println("Indique valor 1");
        var num1 = readLine()?.toInt() as Int;
        println("Indique valor 2");
        var num2 = readLine()?.toInt() as Int;
        println("la suma es igual a  " + (num1 + num2));
    }

    fun multiplica(){
        println("Indique valor 1");
        var num1 = readLine()?.toInt() as Int;
        println("Indique valor 2");
        var num2 = readLine()?.toInt() as Int;
        println("Indique valor 3");
        var num3 = readLine()?.toInt() as Int;
        println("la multiplicación es igual a " + (num1 * num2 * num3) );
    }

    fun divide(){
        println("Indique valor 1");
        var num1 = readLine()?.toInt() as Int;
        println("Indique valor 2");
        var num2 = readLine()?.toInt() as Int;
        println("Indique valor 3");
        var num3 = readLine()?.toInt() as Int;
        println("Indique valor 4");
        var num4 = readLine()?.toInt() as Int;
        println("la división es igual a " + (num1 / num2 / num3 / num4) );
    }

    fun media(){
        println("Indique valor 1");
        var num1 = readLine()?.toInt() as Int;
        println("Indique valor 2");
        var num2 = readLine()?.toInt() as Int;
        println("Indique valor 3");
        var num3 = readLine()?.toInt() as Int;
        println("la media es igual a " + ((num1 + num2 + num3) / 3) );
    }