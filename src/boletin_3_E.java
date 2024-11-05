/**
 * @version 1.0
 * @autor Sofía Otero
 * Compardor de números, que gracias a la función scanner permite guardar unos valores introducidos
 * por teclado de los que luego con Math.max elige el mayor; imprimiendo después este resultado.
 */
import java.util.Scanner;
public class boletin_3_E {
    public static void main(String[] args) {
        Scanner variables = new Scanner(System.in);
        System.out.print("Ingrese un numero 1: ");
        double num1 = variables.nextInt();
        System.out.print("Ingrese un numero 2: ");
        double num2 = variables.nextInt();
        System.out.print("Ingrese un numero 3: ");
        double num3 = variables.nextInt();
        double mayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("el mayor es " + mayor);
        variables.close();
    }
}
