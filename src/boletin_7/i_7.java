package boletin_7;

public class i_7 {
    /**
     * @version 2.0
     * @autor Sofía Otero
     * Este programa define dos funciones simples que borran un elemento de un array:
     * 1. Para una tabla desordenada: Busca el elemento de forma secuencial y, si lo encuentra,
     *    crea un nuevo array sin ese elemento.
     * 2. Para una tabla ordenada: Usa búsqueda binaria para encontrar el elemento, y si existe,
     *    crea un nuevo array sin él.
     */


        // Función para borrar un elemento en una tabla desordenada
        public static int[] borrarElementoDesordenado(int[] tabla, int valor) {
            // Primero buscamos el valor en la tabla de forma secuencial
            int posicion = -1;
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] == valor) {
                    posicion = i;
                    break; // Si lo encontramos, guardamos la posición y salimos del bucle
                }
            }

            // Si no se encontró el valor, devolvemos la misma tabla sin cambios
            if (posicion == -1) {
                return tabla;
            }

            // Creamos una nueva tabla con un tamaño de uno menos
            int[] nuevaTabla = new int[tabla.length - 1];

            // Copiamos todos los elementos excepto el que queremos borrar
            int indiceNuevo = 0;
            for (int i = 0; i < tabla.length; i++) {
                if (i != posicion) {
                    nuevaTabla[indiceNuevo++] = tabla[i];
                }
            }

            return nuevaTabla;
        }

        // Función para borrar un elemento en una tabla ordenada
        // Usaremos una búsqueda binaria para encontrar el elemento
        public static int[] borrarElementoOrdenado(int[] tabla, int valor) {
            // Búsqueda binaria para encontrar el índice
            int inicio = 0;
            int fin = tabla.length - 1;
            int posicion = -1;

            while (inicio <= fin) {
                int medio = (inicio + fin) / 2;
                if (tabla[medio] == valor) {
                    posicion = medio;
                    break;
                } else if (tabla[medio] < valor) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }

            // Si no se encontró, devolvemos la tabla original
            if (posicion == -1) {
                return tabla;
            }

            // Creamos una nueva tabla con un tamaño de uno menos
            int[] nuevaTabla = new int[tabla.length - 1];

            // Copiamos todos los elementos excepto el que queremos borrar
            int indiceNuevo = 0;
            for (int i = 0; i < tabla.length; i++) {
                if (i != posicion) {
                    nuevaTabla[indiceNuevo++] = tabla[i];
                }
            }

            return nuevaTabla;
        }

        // Ejemplo simple de uso
        public static void main(String[] args) {
            int[] arrayDesordenado = {4, 2, 7, 3, 2, 9};
            int[] arrayOrdenado = {1, 2, 3, 4, 5, 6, 7};

            // Borrado en tabla desordenada
            int[] resultadoDes = borrarElementoDesordenado(arrayDesordenado, 2);
            System.out.print("Desordenado sin el 2: ");
            for (int n : resultadoDes) {
                System.out.print(n + " ");
            }

            // Borrado en tabla ordenada
            int[] resultadoOrd = borrarElementoOrdenado(arrayOrdenado, 4);
            System.out.print("\nOrdenado sin el 4: ");
            for (int n : resultadoOrd) {
                System.out.print(n + " ");
            }
        }
    }

