/**
 * @version 1.0
 * @autor Sofía Otero
 * ENUNCIADO: Realiza un programa que calcule a suma e o produto
 * dos números comprendidos entre 10 e 90.
 *Este programa calcula y muestra la suma y el producto acumulados de todos
 *  los números enteros entre 10 y 90. En el bucle `for`, se suman y multiplican
 *  los números consecutivamente, almacenando el resultado en las variables `sumado` y
 *  `multiplicado`. Luego, se imprime el progreso de la suma y el producto en cada iteración,
 *  mostrando el cálculo acumulado hasta el momento.
*/
public class boletin_5_B {
    public static void main (String[] args) {
        int sumado = 0;
        double multiplicado=1.0;
        for (int i=10; i<=90; i++){
            sumado= sumado+i;
            multiplicado=multiplicado*i;
            System.out.println("Tu suma da "+sumado);
            System.out.println("Tu multiplicación da "+multiplicado);

        }


    }
}
