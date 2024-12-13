package boletin_7;

public class f_7 {
    /**
     * @version 2.0
     * @autor Sofía Otero
     * Este programa implementa una función para realizar una búsqueda binaria en un array ordenado.
     * La búsqueda binaria es un algoritmo muy rápido para encontrar un elemento, ya que divide el
     * rango de búsqueda por la mitad en cada paso.
     * Si el elemento existe, devuelve el índice donde se encuentra. Si no existe, devuelve -1.
     *
     */


        /**
         * Esta función busca un número en un array ordenado usando búsqueda binaria.
         * @param arrayOrdenado Un array de enteros ordenados de menor a mayor.
         * @param valorBuscado El número que queremos encontrar en el array.
         * @return El índice donde se encuentra "valorBuscado" o -1 si no está.
         */
        public static int busquedaBinaria(int[] arrayOrdenado, int valorBuscado) {

            // "inicio" es el índice donde comienza la parte del array que estamos buscando.
            int inicio = 0;

            // "fin" es el índice donde termina la parte del array que estamos buscando.
            int fin = arrayOrdenado.length - 1;

            // Mientras haya un rango válido (inicio <= fin), seguimos buscando.
            while (inicio <= fin) {

                // "medio" es el índice que divide el rango por la mitad.
                int medio = (inicio + fin) / 2;

                // Obtenemos el valor que está justo en el medio.
                int valorMedio = arrayOrdenado[medio];

                // Si el valor en medio es justo el que buscamos, lo hemos encontrado.
                if (valorMedio == valorBuscado) {
                    return medio; // Devolvemos el índice y terminamos.
                }

                // Si el valor en medio es mayor que el buscado, entonces debemos buscar en la mitad "izquierda".
                if (valorMedio > valorBuscado) {
                    fin = medio - 1; // Ajustamos "fin" para que la próxima búsqueda sea solo en la mitad izquierda.
                } else {
                    // Si el valor en medio es menor que el buscado, debemos buscar en la mitad "derecha".
                    inicio = medio + 1; // Ajustamos "inicio" para que la próxima búsqueda sea solo en la mitad derecha.
                }
            }

            // Si salimos del bucle es porque no encontramos el valor, así que devolvemos -1.
            return -1;
        }

        // Método principal de prueba.
        public static void main(String[] args) {

            // Creamos un array de enteros ordenados.
            int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

            // Elegimos un valor a buscar.
            int valorQueBusco = 7;

            // Llamamos a la función busquedaBinaria para hallar el índice.
            int indiceEncontrado = busquedaBinaria(numeros, valorQueBusco);

            // Si el índice es -1, no se encontró el valor.
            if (indiceEncontrado == -1) {
                System.out.println("El valor " + valorQueBusco + " no se encontró.");
            } else {
                // Si no es -1, mostramos el índice donde se encontró.
                System.out.println("El valor " + valorQueBusco + " se encontró en el índice: " + indiceEncontrado);
            }
        }
    }

