package Ejercicios_Clases_Kotlin
import javax.swing.*;

fun main(args: Array<String>) {

    System.out.println("Ingrese Nombre tiburón");
    val nombre = readLine().toString() as String;

    System.out.println("Ingrese especie tiburón");
    val especie = readLine().toString() as String;

    System.out.println("Ingrese tipo tiburón");
    val tipo = readLine().toString() as String;

    System.out.println("Ingrese descripcion tiburón");
    val descripcion = readLine().toString() as String;

    System.out.println("Ingrese familia tiburón");
    val familia = readLine().toString() as String;

    System.out.println("Ingrese ubicación tiburón");
    val ubicacion = readLine().toString() as String;

    val tiburonsin = Tiburon(nombre, especie, tipo, descripcion,  familia, ubicacion, 14);

    val tibu = Tiburon("blanco", "white shark", "carnivoro", "gran blanco", "cetaceos", "mar", 15);
/*
    JOptionPane.showInputDialog("Ingrese valor");
    val respuesta = readLine().toString() as String;

    JOptionPane.showMessageDialog(null, respuesta);
*/
    println(tibu.toString());
    println(tiburonsin.toString());
    println(tiburonsin.obtieneAlimento());
}