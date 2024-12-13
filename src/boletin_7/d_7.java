package boletin_7;

/**
 * @version 2.0
 * @autor Sofía Otero
 * Este programa solicita un número de DNI (sin la letra) y calcula la letra correspondiente
 * del NIF a partir del resto de dividir ese número entre 23.
 * Muestra la letra final del NIF usando una tabla de equivalencias.
 */

import java.util.Scanner; // Importamos Scanner para leer datos del teclado

public class d_7 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada por teclado
        Scanner entradaPorTeclado = new Scanner(System.in); // 'entradaPorTeclado' es un nombre descriptivo

        // Mostramos un mensaje para pedir el número del DNI sin letra
        System.out.println("Introduce el número de tu DNI (sin la letra):");

        // Leemos el número del DNI que el usuario escriba
        int numeroDNI = entradaPorTeclado.nextInt(); // 'numeroDNI' almacena el DNI introducido por el usuario

        // Cerramos el Scanner para no dejarlo abierto
        entradaPorTeclado.close();

        // Creamos un array con las letras que corresponden a cada posible resto (0 a 22)
        // Estas letras van asociadas al resto de dividir el DNI entre 23, en el orden que indica la tabla
        char[] tablaLetras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'
        };

        // Calculamos el resto de la división del DNI entre 23
        int resto = numeroDNI % 23; // 'resto' guarda el resultado de la operación modulo 23

        // Obtenemos la letra correspondiente al resto usando el array 'tablaLetras'
        char letraNIF = tablaLetras[resto]; // 'letraNIF' es la letra final del NIF

        // Mostramos el resultado al usuario
        System.out.println("La letra de tu NIF es: " + letraNIF);
    }
}


