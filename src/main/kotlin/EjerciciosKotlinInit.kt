import java.util.*

class EjerciciosKotlinInit {
    fun main(args: Array<String>) {
        /*Crea un when con rangos de diez números del 0 al 100. Cada intervalo te mostrará por pantalla que nota has sacado (0 al 10, suspenso, 11 al 20 suspenso...).*/

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

    }
}