/**
 * @version 1.0
 * @autor Sofía Otero
 *solicita al usuario que ingrese su nombre y lo saluda varias veces en diferentes idiomas:
 *  inglés, gallego y español. Utiliza métodos para obtener el nombre del usuario y para imprimir
 *  los saludos según el idioma y la cantidad especificada. Es un ejemplo básico de interacción en
 *  la consola y uso de funciones.
 */


// Importamos la clase Scanner para leer la entrada del usuario desde la consola
import java.util.Scanner;

// Definimos la clase principal llamada EjemploFunciones1
public class EjemploFunciones1 {
    /**
     *
     * @param args
     */

    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) {

        // Llama al método obterNome() para obtener el nombre del usuario y lo guarda en la variable nomeEstudante
        String nomeEstudante = obterNome();


        // Llama a la función saudos para saludar 3 veces en inglés
        saudos(3, "en");


        // Imprime un mensaje de bienvenida en inglés incluyendo el nombre del usuario
        System.out.println("Welcome Mr, Mss: " + nomeEstudante);

        // Llama a la función saudos para saludar 5 veces en gallego
        saudos(5, "gl");
        // Imprime un mensaje en español como indicador de una sección en el programa
        System.out.println("Otras tareas en medio");

        // Llama a la función saudos para saludar 2 veces en español
        saudos(2, "es");

    }

    // Método obterNome que solicita el nombre del usuario
    static String obterNome() {


        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario que escriba su nombre en gallego
        System.out.println("Escribe o teu nome: ");

        // Lee el nombre ingresado por el usuario y lo guarda en la variable nome
        String nome = sc.next();

        // Cierra el Scanner para liberar el recurso (buena práctica)
        sc.close();

        // Devuelve el nombre del usuario
        return nome;

    }
    /**
     *
     * @param veces
     * @param idioma
     */

    // Método saudos que imprime saludos repetidos en diferentes idiomas
    static void saudos(int veces, String idioma) {
        // Bucle que imprime un saludo según el número de veces especificado
        for (int i = 0; i < veces; i++) {
            // Condicional para imprimir el saludo en el idioma deseado

            if (idioma.equals("en")) {
                System.out.println("Hello!");
            } else if (idioma.equals("gl")) {
                System.out.println("Ola!");
            } else if (idioma.equals("es")) {
                System.out.println("¡Hola!");
            } else {
                System.out.println("Idioma no soportado");
            }
        }
    }
}

