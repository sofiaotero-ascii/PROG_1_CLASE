import java.util.Scanner;
public class boletin_3_C {
    public static void main(String[] args) {
        Scanner mais_menos = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        short numero_a_valorar = mais_menos.nextShort();
        if (numero_a_valorar > 0) {
            System.out.print("+");
            mais_menos.close();
        } else if (numero_a_valorar < 0) {
            System.out.print("-");
        } else {
            System.out.print("0");
        }
        mais_menos.close();
    }


}
