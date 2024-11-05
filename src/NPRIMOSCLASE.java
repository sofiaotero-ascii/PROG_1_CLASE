import java.util.Scanner; // Importamos la clase Scanner para poder leer lo que el usuario escribe


public class NPRIMOSCLASE { // Definimos nuestra clase principal, que se llama "TodosLosPrimos"
    public static void main(String[] args) { // Este es el método principal donde empieza a ejecutarse el programa
        Scanner scanner = new Scanner(System.in); // Creamos un objeto scanner para leer datos del teclado

        System.out.print("Introduce un número: "); // Pedimos al usuario que escriba un número
        int introducido = scanner.nextInt(); // Leemos el número que el usuario ha escrito y lo guardamos en la variable 'introducido'

        // Mensaje que informa al usuario sobre qué números se van a mostrar
        System.out.println("Los números primos hasta " + introducido + " son:");

        // Aquí empezamos un bucle que va desde 2 hasta el número que el usuario introdujo
        for (int numero = 2; numero <= introducido; numero++) {
            boolean esPrimo = true; // Suponemos que 'numero' es primo al principio

            // Este bucle verifica si 'numero' tiene algún divisor entre 2 y 'numero - 1'
            for (int divisor = 2; divisor < numero; divisor++) {
                // Aquí comprobamos si 'numero' se puede dividir entre 'divisor' sin dejar resto
                if (numero % divisor == 0) { // Si el resto es 0, significa que 'numero' no es primo
                    esPrimo = false; // Cambiamos esPrimo a falso porque encontramos un divisor
                    break; // Salimos del bucle de divisores porque ya sabemos que no es primo
                }
            }

            // Si esPrimo sigue siendo verdadero, significa que 'numero' es primo
            if (esPrimo) {
                System.out.println(numero); // Imprimimos el número primo
            }
        }

        scanner.close(); // Cerramos el scanner para liberar los recursos que estaba usando
    }
}
