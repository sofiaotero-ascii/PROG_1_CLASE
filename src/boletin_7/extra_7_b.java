import java.util.Scanner; // Importamos Scanner

public class extra_7_b {
    public static void main(String[] args) {
        // Creamos el Scanner para leer entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz 3x3 con descripciones de habitaciones
        String[][] mapa = {
                {"Entrada", "Pasillo", "Trampa"},
                {"Habitación vacía", "Tesouro", "Trampa"},
                {"Pasillo", "Puerta cerrada", "Sala misteriosa"}
        };

        // Variable para saber si el tesoro se ha encontrado
        boolean encontradoTesouro = false;

        // Bucle que se ejecuta mientras no se encuentre el tesoro
        while (!encontradoTesouro) {
            // Pedimos al usuario la fila
            System.out.println("Introduce a fila (0-2): ");
            int fila = sc.nextInt();
            // Pedimos la columna
            System.out.println("Introduce a columna (0-2): ");
            int col = sc.nextInt();

            // Comprobamos si la posición es válida
            if (fila >= 0 && fila < 3 && col >= 0 && col < 3) {
                // Obtenemos el contenido de la habitación
                String contenido = mapa[fila][col];
                // Lo mostramos
                System.out.println("Atopaches: " + contenido);
                // Si es el tesoro, el usuario gana
                if (contenido.equalsIgnoreCase("Tesouro")) {
                    System.out.println("¡Noraboa! Atopaches o Tesouro!");
                    encontradoTesouro = true;
                }
            } else {
                // Posición no válida
                System.out.println("Posición non válida.");
            }
        }

        // Cerramos el Scanner
        sc.close();
    }
}
