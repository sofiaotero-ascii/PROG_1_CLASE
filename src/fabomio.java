import java.util.Scanner;
public class fabomio {
    public static void main(String[] args) {
        Scanner colector = new Scanner (System.in);
        System.out.println("Cuantas iteraciones deseas obtener de esta serie ?");
        int numero_1= 0;
        int numero_2= 1;
        int veces_repetir= colector.nextInt();

        for (int i = 1; i<veces_repetir;i++) {
            int numero_fabonacci = numero_1 + numero_2;
            System.out.println(numero_fabonacci);
            numero_1 = numero_2;
            numero_2=numero_fabonacci;

        }

    }
}
