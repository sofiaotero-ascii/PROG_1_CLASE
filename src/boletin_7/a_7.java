package boletin_7;

/**
 * @version 2.0
 * @autor Sofía Otero
 * Este programa utiliza un array predefinido para almacenar números enteros
 * y muestra su contenido en orden inverso. Se recorre el array usando un bucle
 * `for` en orden decreciente desde el último elemento hasta el primero.
 */

public class a_7 {
    public static void main(String[] args) {
        // Definir el array con números predefinidos
        int[] matrizNumeros = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10 // Este array contiene los números del 1 al 10
        };

        // Imprimir un mensaje inicial para el usuario
        System.out.println("Números en orden inverso:"); // Indica la intención de mostrar el array al revés

        // Iniciar un bucle para recorrer el array en orden inverso
        // `matrizNumeros.length - 1` representa el último índice del array
        for (int indiceReverso = matrizNumeros.length - 1; indiceReverso >= 0; indiceReverso--) {
            // El bucle comienza en el índice más alto (9 en este caso, porque el array tiene 10 elementos)
            // Se ejecuta mientras `indiceReverso` sea mayor o igual a 0
            // Después de cada iteración, decrementa el valor de `indiceReverso` en 1

            System.out.println(matrizNumeros[indiceReverso]);
            // En cada iteración, accede al elemento correspondiente al índice actual
            // e imprime su valor en la consola
        }
    }
}

