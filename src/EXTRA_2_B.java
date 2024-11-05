/**
 * EJERCICIO
 *    IMPORTAMOS SCANNER
 *    INICIO
 *    CREAMOS SCANNER
 *        PREGUNTAMOS POR EL VALOR EN CELSIUS (PRINT)
 *            DOUBLE CELSIUS
 *
 *        CALCULAMOS EL VALOR EN KELVIN
 *            DOUBLE KELVIN = CELSIUS + 273.15
 *
 *        CALCULAMOS EL VALOR EN FAHRENHEIT
 *            DOUBLE FAHRENHEIT = (CELSIUS * 9/5) + 32
 *
 *        IMPRIMIMOS RESULTADO EN KELVIN
 *        IMPRIMIMOS RESULTADO EN FAHRENHEIT
 *    FIN
 */
import java.util.Scanner;
public class EXTRA_2_B {
    public static void main(String[] args) {
        Scanner valor_kelvin = new Scanner(System.in);
        System.out.print("Ingrese un valor en celsius sin el símbolo: ");
        double celsius = valor_kelvin.nextDouble();

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Su valor en Kº es :" + kelvin);
        System.out.println("Su valor en Fº es :" + fahrenheit);
    }
}
