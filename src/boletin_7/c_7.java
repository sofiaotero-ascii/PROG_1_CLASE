package boletin_7; // Declaramos el paquete al que pertenece esta clase

import java.util.Scanner; // Importamos la clase Scanner para leer datos desde el teclado

public class c_7 { // Definición de la clase c_7
    public static void main(String[] args) { // Método principal, punto de entrada del programa

        // Definimos un array de enteros "matriz_notas_dam" que contiene las notas de diferentes alumnos
        int [] matriz_notas_dam={
                1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,2,2,10
        };

        // Definimos un array de cadenas "nomes_notas_dam" con los nombres de los alumnos correspondientes a cada nota en la misma posición
        String[] nomes_notas_dam={
                "Juan","Pedro","Maria","Jose","Ana","Marta","Isabel","Luisa","Carlos","Juan","Pedro","Maria","Jose","Ana","Marta","Isabel","Luisa","Carlos","Juan","Pedro","Maria","Jose","Ana","Marta","Isabel","Luisa","Carlos","Juan","Pedro","Maria"
        };

        // Inicializamos variables para llevar el conteo de aprobados, suspensos, la suma total de notas y la nota máxima
        int aprobados=0;
        int suspensos=0;
        int suma_notas=0;
        int nota_max=0;

        // Recorremos cada nota del array "matriz_notas_dam" usando un bucle for mejorado
        for (int nota:matriz_notas_dam){
            // Acumulamos la nota en la variable suma_notas para luego calcular la media
            suma_notas+=nota;

            // Si la nota es mayor o igual que 5 consideramos que el alumno ha aprobado
            if (nota>=5){
                aprobados++;
            }else{
                // Si la nota es menor que 5 consideramos que el alumno ha suspendido
                suspensos++;
            }

            // Actualizamos la nota máxima si la nota actual es mayor que la que teníamos anteriormente
            nota_max=Math.max(nota_max,nota);
        }

        // Calculamos la media convirtiendo suma_notas a double para evitar división entera
        double media=(double) suma_notas/matriz_notas_dam.length;

        // Mostramos por pantalla la media, el número de aprobados, el de suspensos y la nota más alta
        System.out.println("La media de las notas es: "+media);
        System.out.println("El número de aprobados es: "+aprobados);
        System.out.println("El número de suspensos es: "+suspensos);
        System.out.println("La nota más alta es: "+nota_max);

        // Creamos un objeto Scanner para poder leer la entrada del usuario desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el nombre de un alumno para buscar su nota
        System.out.println("\nIntroduce el nombre del alumno para consultar su nota:");

        // Guardamos el nombre introducido por el usuario en la variable alumnoBuscado
        String alumnoBuscado = scanner.nextLine();

        // Creamos una variable booleana para saber si encontramos el alumno o no
        boolean encontrado = false;

        // Recorremos el array de nombres para buscar el que coincide con alumnoBuscado
        for (int i = 0; i < nomes_notas_dam.length; i++) {
            // Utilizamos equalsIgnoreCase para comparar ignorando mayúsculas o minúsculas
            if (nomes_notas_dam[i].equalsIgnoreCase(alumnoBuscado)) {
                // Si encontramos el alumno, mostramos su nota por pantalla
                System.out.println("La nota de " + alumnoBuscado + " es: " + matriz_notas_dam[i]);
                encontrado = true; // Marcamos que lo hemos encontrado
                break; // Salimos del bucle una vez encontrado
            }
        }

        // Si después de recorrer todo el array no encontramos al alumno, mostramos un mensaje indicándolo
        if (!encontrado) {
            System.out.println("Alumno no encontrado: " + alumnoBuscado);
        }

        // Ahora mostramos la lista de alumnos aprobados
        System.out.println("\nLista de alumnos aprobados:");

        // Recorremos el array de notas para comprobar cuáles son aprobados
        for (int i = 0; i < matriz_notas_dam.length; i++) {
            // Si la nota es mayor o igual a 5, se considera aprobado
            if (matriz_notas_dam[i] >= 5) {
                // Mostramos el nombre y la nota del alumno aprobado
                System.out.println(nomes_notas_dam[i] + " - Nota: " + matriz_notas_dam[i]);
            }
        }

        // Ordenamos y mostramos la lista de alumnos por orden creciente de notas
        // En realidad, no estamos ordenando el array, sino que usamos un bucle para mostrar primero las notas más bajas
        System.out.println("\nLista ordenada por orden creciente de notas:");

        // Bucle externo que va desde n=0 hasta n=10 (el rango de notas esperado)
        for (int n = 0; n <= 10; n++) {
            // Bucle interno que recorre todas las notas
            for (int i = 0; i < matriz_notas_dam.length; i++) {
                // Si la nota del alumno coincide con n, se muestra
                if (matriz_notas_dam[i] == n) {
                    System.out.println(nomes_notas_dam[i] + " - Nota: " + matriz_notas_dam[i]);
                }
            }
        }

        // Cerramos el objeto Scanner para liberar recursos
        scanner.close();
    }
}
