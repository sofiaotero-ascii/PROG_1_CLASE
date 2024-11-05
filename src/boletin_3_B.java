import java.util.Scanner;//importamos scanner
public class boletin_3_B {
    public static void main(String[] args) {
        Scanner suma_resta = new Scanner(System.in);//creamos el scanner
        System.out.print("Ingrese el primer valor: ");//ceramos pregunta
        short valor_1 = suma_resta.nextShort();//creamos espacio para ese valor
        System.out.print("Ingrese el segundo valor: ");//segunda pregunta
        short valor_2 = suma_resta.nextShort();//creamos espacio para valor dos
        if (valor_1 >= valor_2) {//indicamos que hacer en caso de valor 1 ser mayor o igual que 2
            short resta = (short) (valor_1 - valor_2);
            System.out.println("La resta es: " + resta);
        }else {
            short resta = (short) (valor_1 - valor_2);
            System.out.println("La resta es: " + resta);

        }

    }
}