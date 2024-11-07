
/**
 * @version 2.0
 * @autor Sofía Otero
 * Utilizando Scanner y for creamos un progrma que pregunte en un bucle
 * de 10 repeticiones por numeros enteros, los cuales se alamcenan luego en un
 * String para después con un if, else if, else clasificar cuales de ellos
 * son negativos o contienen un cero, mostrándolo por pantalla tras ser
 * introducidos estos.Con los números que nos cumplan ninguna de estas condiciones
 * no se mostrará información extra.
 */
import java.util.Scanner;//importamos un scanner para poder trabajar con datos externos
public class boletin_5_A {
    public static void main(String[] args) {
        System.out.println("Introduce numeros enteros hasta que se te pida");
        Scanner numeros_pantalla = new Scanner(System.in);//creamos un scanner para poder interactuar con los datos introducidos
       for (int i = 1; i<=10; i++){//pide numeros enteros hasta obtener 10
                   System.out.println("LLevas" + (i-1) + "números enteros de 10, introduce otro más:");//Indica cuantis numeros enteros llevabmos y cuantos faltan por introducir
                    int numeros=numeros_pantalla.nextInt();//alojamos los numeros dados


       String numeros_para_casos= String.valueOf(numeros);//
       if (numeros<0) {
           System.out.println("Numero negativo:" + numeros);
       }else if (numeros==0) {
           System.out.println("El numero es cero");
       }else{//Si es positivo
           if(numeros_para_casos.contains("0")){
               System.out.println("Tu numero "+numeros+" contiene 0");
           }

       }
       }
    }
}