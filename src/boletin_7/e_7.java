package boletin_7;

/**
 * @version 2.0
 * @autor Sofía Otero
 * Este programa solicita un número de DNI (sin la letra) y calcula la letra correspondiente
 * del NIF a partir del resto de dividir ese número entre 23.
 * Muestra la letra final del NIF usando una tabla de equivalencias.
 */

public class e_7{

    // Definimos una función genérica que busca un elemento en una matriz (array) de cualquier tipo
    // y devuelve el índice donde se encuentra. Si no lo encuentra, devuelve -1.

    /**
     * Esta función genérica busca un elemento dentro de un array.
     * @param matrizArray Array en el que se buscará el elemento.
     * @param valorBuscado Elemento que se quiere encontrar en el array.
     * @return Devuelve el índice del elemento si se encuentra, o -1 si no se encuentra.
     */
    public static <Tipo> int buscarElementoEnArray(Tipo[] matrizArray, Tipo valorBuscado) {

        // Empezamos un bucle que recorrerá todos los elementos del array uno a uno.
        // "indiceActual" es una variable descriptiva que indica la posición actual en el recorrido.
        for (int indiceActual = 0; indiceActual < matrizArray.length; indiceActual++) {

            // Comprobamos si el elemento en la posición actual es igual al valor que buscamos.
            // Para comparar dos objetos de tipo genérico usamos el método equals().
            if (matrizArray[indiceActual].equals(valorBuscado)) {

                // Si encontramos el elemento, devolvemos su posición (índice) y salimos de la función.
                return indiceActual;
            }
        }

        // Si el bucle termina sin haber encontrado el elemento, devolvemos -1 indicando que no se encontró.
        return -1;
    }

    // A modo de ejemplo, podríamos probar la función en el método main.
    public static void main(String[] args) {

        // Creamos un array de cadenas de texto para la prueba.
        String[] matrizPrueba = {"manzana", "pera", "naranja", "sandia"};

        // Definimos el valor que queremos buscar.
        String valorABuscar = "naranja";

        // Llamamos a la función de búsqueda con el array y el valor a encontrar.
        // Guardamos el resultado en una variable descriptiva.
        int indiceEncontrado = buscarElementoEnArray(matrizPrueba, valorABuscar);

        // Mostramos el resultado por pantalla.
        // Si el índice es -1, significa que no se encontró, si no, mostramos el índice encontrado.
        if (indiceEncontrado == -1) {
            System.out.println("El elemento \"" + valorABuscar + "\" no se encontró en el array.");
        } else {
            System.out.println("El elemento \"" + valorABuscar + "\" se encontró en el índice: " + indiceEncontrado);
        }
    }
}
