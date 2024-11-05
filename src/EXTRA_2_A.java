/**
 *  @version 2.0
 *  @autor Sofía Otero
 *  Una vez introducidos el precio del producto y el valor a descontar imprime el porcentaje que el valor a decontar implica
 *  en la compra.
 *  ORDINOGRAMA__________________________________________________________
 * EXERCICIO
 * 		IIMORTAMOS SCANNER
 * 		INICIO
 * 		CREAMOS SCANNER
 * 				PREGUNTA VALOR DE LA COMPRA  SIN TARIFA(PRINTLN)
 * 				DOUBLE VALOR_COMPRA
 *
 * 		PREGUNTA DESCUENTO EN EUROS (PRINTLN)
 * 				DOUBE VALOR_DESCUENTOEU
 *
 * 		DEFINIMOS DOUBLE PORDENTAJE DESCUENTO
 * 		IMPRIMIMOS PORCENTAJE DECUENTO + %7
 *
 * @version 2.0
 * @autor Sofía Otero
 */


import java.util.Scanner;
public class EXTRA_2_A {
    public static void main(String[] args) {
        Scanner compras = new Scanner(System.in);
        System.out.println("Ingrese el precio en euros total");
        double precio = compras.nextDouble();
        System.out.println("Ingrese el precio en euros del descuento");
        double precio_eu_descuento = compras.nextDouble();
        double precio_imprimir = (precio_eu_descuento/precio*100);
        System.out.println("El porcentaje de descuento es: " + precio_imprimir +"%");
    }
}
