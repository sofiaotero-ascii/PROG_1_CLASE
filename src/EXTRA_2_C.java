/**
 * @version 2.0
 * @autor Sofía Otero
 * Utilizando Scanner creamos un programa que permite hacer el desglose de una cantidad entera en euros mediante el
 * cálculo del porcentaje que cada billete representa del total y el numero de ellos que se pueden obtener
 */
import java.util.Scanner;
public class EXTRA_2_C {
    public static void main(String[] args) {
        Scanner calcula_billetes = new Scanner(System.in);//creamos un scanner
        System.out.println("¿Cúantos euros quiere cambiar? Introduzca solo el número entero en euros");//hace la pregunta al usuario
        long cant_ingresada = calcula_billetes.nextLong();

        long b_100 = cant_ingresada / 100; //guardamos la informacion introducida por el teclaso
        long restante = cant_ingresada % 100;//comprobamos cuantos billetes de 100 podemos obtener, y su importancia en el total
        long b_50 = restante / 50;
        restante = restante % 50;
        long b_20 = restante / 20;
        restante = restante % 20;
        long b_10 = restante / 10;
        restante = restante % 10;
        long b_5 = restante / 5;
        restante = restante % 5;
        long e_1 = restante / 1;
        restante = restante % 1;

        System.out.println("A devolver:");//IMprimimos las variables como un desglose conseguidas tras hacer los calculos
        System.out.println("Billetes de 100€: " + b_100);
        System.out.println("Billetes de 50€: " + b_50);
        System.out.println("Billetes de 20€: " + b_20);
        System.out.println("Billetes de 10€: " + b_10);
        System.out.println("Billetes de 5€: " + b_5);
        System.out.println("Monedas de 1€: " + e_1);

        calcula_billetes.close(); //cerramos nuestro Scanner para obtimizar recursos
    }
}
