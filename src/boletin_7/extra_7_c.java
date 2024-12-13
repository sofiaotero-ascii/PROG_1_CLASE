import java.util.Scanner; // Importamos Scanner

public class extra_7_c {
    public static void main(String[] args) {
        // Creamos el Scanner para leer desde consola
        Scanner sc = new Scanner(System.in);

        // Arrays con los platos
        String[] primeros = {"Ensalada", "Sopa", "Empanada"};
        String[] segundos = {"Carne asada", "Pescado ao forno", "Lasagna"};
        String[] postres = {"Flan", "Tarta de queixo", "Froita"};

        // Mostramos el menú llamando a la función mostrarMenu
        mostrarMenu(primeros, segundos, postres);

        // Llamamos a la función pedirPlato para que el usuario seleccione
        String[] pedido = pedirPlato(sc, primeros, segundos, postres);

        // Mostramos el pedido final
        System.out.println("O teu pedido é:");
        System.out.println("Primeiro: " + pedido[0]);
        System.out.println("Segundo: " + pedido[1]);
        System.out.println("Postre: " + pedido[2]);

        // Cerramos Scanner
        sc.close();
    }

    // Función para mostrar el menú
    public static void mostrarMenu(String[] primeros, String[] segundos, String[] postres) {
        System.out.println("Menú do día:");
        System.out.println("Primeiros:");
        for (int i = 0; i < primeros.length; i++) {
            // Mostramos índice y nombre del plato
            System.out.println(i + ". " + primeros[i]);
        }

        System.out.println("\nSegundos:");
        for (int i = 0; i < segundos.length; i++) {
            System.out.println(i + ". " + segundos[i]);
        }

        System.out.println("\nPostres:");
        for (int i = 0; i < postres.length; i++) {
            System.out.println(i + ". " + postres[i]);
        }
    }

    // Función para pedir el plato. Devuelve un array con [primer, segundo, postre]
    public static String[] pedirPlato(Scanner sc, String[] primeros, String[] segundos, String[] postres) {
        // Pedimos el primer plato
        System.out.println("Elixe o primeiro prato (número): ");
        int p = sc.nextInt();
        // Pedimos el segundo plato
        System.out.println("Elixe o segundo prato (número): ");
        int s = sc.nextInt();
        // Pedimos el postre
        System.out.println("Elixe o postre (número): ");
        int d = sc.nextInt();

        // Verificamos que las elecciones son válidas. Si no, se asigna "Non válido"
        String primerElegido = (p >= 0 && p < primeros.length) ? primeros[p] : "Non válido";
        String segundoElegido = (s >= 0 && s < segundos.length) ? segundos[s] : "Non válido";
        String postreElegido = (d >= 0 && d < postres.length) ? postres[d] : "Non válido";

        // Devolvemos el array con las elecciones
        return new String[]{primerElegido, segundoElegido, postreElegido};
    }
}
