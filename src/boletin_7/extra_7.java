package boletin_7;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos desde el teclado
import java.util.Scanner;
public class extra_7 {






        public static void main(String[] args) {
            // Creamos un objeto Scanner para leer la entrada desde la consola
            Scanner sc = new Scanner(System.in);

            // Definimos un array unidimensional con los días de la semana que vamos a usar como filas
            String[] dias = {"Luns", "Martes", "Mércores", "Xoves", "Venres"};
            // Definimos la cantidad de horas. Este número representará las columnas de la matriz
            int horas = 5;

            // Creamos la matriz (axenda) de tamaño [número de días][número de horas].
            // Cada elemento almacenará una actividad (String).
            String[][] axenda = new String[dias.length][horas];

            // Inicializamos la matriz con algunas actividades por defecto.
            // Este bucle anidado recorre cada fila (días) y cada columna (horas)
            for (int i = 0; i < dias.length; i++) {          // i: índice para las filas (días)
                for (int j = 0; j < horas; j++) {            // j: índice para las columnas (horas)
                    // Asignamos actividades. Como ejemplo:
                    // Hora 0: "Matemáticas"
                    // Hora 1: "Historia"
                    // Hora 2: "Deporte"
                    // Hora 3 y 4: actividades vacías (cadenas vacías)
                    if (j == 0) axenda[i][j] = "Matemáticas";
                    else if (j == 1) axenda[i][j] = "Historia";
                    else if (j == 2) axenda[i][j] = "Deporte";
                    else axenda[i][j] = ""; // Cadena vacía representa hueco sin actividad
                }
            }

            // Llamamos a la función mostrarAxenda para enseñar el horario inicial
            mostrarAxenda(axenda, dias);

            // Variable booleana para controlar el bucle mientras el usuario no quiera salir
            boolean continuar = true;

            // Bucle principal del programa
            while (continuar) {
                // Mostramos un menú de opciones al usuario
                System.out.println("\n¿Qué quieres hacer?");
                System.out.println("1 - Cambiar unha actividade existente");
                System.out.println("2 - Engadir unha actividade nunha posición baleira");
                System.out.println("3 - Saír");
                System.out.print("Opción: ");

                // Leemos la opción elegida por el usuario
                int opcion = sc.nextInt();
                // Consumimos el salto de línea que queda en el búfer
                sc.nextLine();

                // Dependiendo de la opción elegida, realizamos diferentes acciones
                switch (opcion) {
                    case 1:
                        // Opción 1: Cambiar una actividad existente por otra
                        // Primero preguntamos por la posición (día y hora)
                        System.out.println("Introducir o día (0-" + (dias.length-1) + "):");
                        int diaCambio = sc.nextInt();  // Leemos el índice de la fila (día)
                        System.out.println("Introducir a hora (0-" + (horas-1) + "):");
                        int horaCambio = sc.nextInt(); // Leemos el índice de la columna (hora)
                        sc.nextLine(); // limpiamos el buffer

                        // Comprobamos que la posición es válida
                        if (diaCambio >= 0 && diaCambio < dias.length && horaCambio >= 0 && horaCambio < horas) {
                            // Mostramos la actividad actual
                            System.out.println("Actividad actual: " + axenda[diaCambio][horaCambio]);
                            // Pedimos la nueva actividad
                            System.out.print("Nova actividade: ");
                            String nuevaAct = sc.nextLine();
                            // Actualizamos la matriz con la nueva actividad
                            axenda[diaCambio][horaCambio] = nuevaAct;
                            System.out.println("Actividade actualizada!");
                        } else {
                            // Si la posición no es válida, lo indicamos
                            System.out.println("Posición non válida!");
                        }
                        // Mostramos el horario tras la modificación
                        mostrarAxenda(axenda, dias);
                        break; // Salimos del case

                    case 2:
                        // Opción 2: Agregar una actividad nueva en un hueco vacío
                        System.out.println("Introducir o día (0-" + (dias.length-1) + "):");
                        int diaNuevo = sc.nextInt();  // Leemos el índice del día
                        System.out.println("Introducir a hora (0-" + (horas-1) + "):");
                        int horaNueva = sc.nextInt(); // Leemos el índice de la hora
                        sc.nextLine(); // limpiamos el buffer

                        // Comprobamos que la posición es válida
                        if (diaNuevo >= 0 && diaNuevo < dias.length && horaNueva >= 0 && horaNueva < horas) {
                            // Comprobamos que en esa posición no haya ya una actividad (que esté vacía)
                            if (axenda[diaNuevo][horaNueva].isEmpty()) {
                                // Pedimos la nueva actividad
                                System.out.print("Nova actividade: ");
                                String nuevaAct = sc.nextLine();
                                // Asignamos la nueva actividad
                                axenda[diaNuevo][horaNueva] = nuevaAct;
                                System.out.println("Actividade engadida!");
                            } else {
                                // Si no está vacía, no podemos agregar aquí
                                System.out.println("Esa posición non está baleira!");
                            }
                        } else {
                            // Posición no válida
                            System.out.println("Posición non válida!");
                        }
                        // Mostramos el horario tras la modificación
                        mostrarAxenda(axenda, dias);
                        break; // Salimos del case

                    case 3:
                        // Opción 3: Salir del programa
                        continuar = false;
                        break; // Salimos del case

                    default:
                        // Si el usuario elige una opción no válida
                        System.out.println("Opción non válida!");
                        break; // Salimos del case
                }
            }

            // Cerramos el Scanner
            sc.close();
        }

        // Función para mostrar la agenda
        // Recibe la matriz de actividades y el array de días
        public static void mostrarAxenda(String[][] axenda, String[] dias) {
            System.out.println("\nHorario:");
            // Mostramos un encabezado para las horas
            System.out.print("       ");
            for (int h = 0; h < axenda[0].length; h++) {
                // Mostramos "Hora0", "Hora1", etc.
                System.out.printf("Hora%d  ", h);
            }
            System.out.println();

            // Recorremos la matriz para mostrar día a día
            for (int i = 0; i < axenda.length; i++) {
                // Mostramos el nombre del día con formato
                System.out.printf("%-7s", dias[i] + ": ");
                for (int j = 0; j < axenda[i].length; j++) {
                    // Si está vacío mostramos [ ] como indicador de hueco libre
                    if (axenda[i][j].isEmpty()) System.out.printf("%-8s", "[ ]");
                    else System.out.printf("%-8s", axenda[i][j]);
                }
                System.out.println(); // Salto de línea tras cada día
            }
        }
    }



