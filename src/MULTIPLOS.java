/**import java.util.Scanner;

 public class MultiploDeSiete {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int numeroMaximo = 10000;

 System.out.println("Número entero del 1 al " + numeroMaximo + ":");
 int numeroIngresado = scanner.nextInt();

 // Verificar si el número ingresado está en el rango
 if (numeroIngresado < 1 || numeroIngresado > numeroMaximo) {
 System.out.println("El número debe estar entre 1 y " + numeroMaximo);
 scanner.close();
 return;
 }

 // Imprimir si el número ingresado es múltiplo de 7
 for (int numero = 1; numero <= numeroMaximo; numero++) {
 if (numero == numeroIngresado) {
 System.out.println("\n" + numeroIngresado + (numeroIngresado % 7 == 0 ? " es múltiplo de 7." : " no es múltiplo de 7."));
 }
 }

 scanner.close();
 }
 }
 */