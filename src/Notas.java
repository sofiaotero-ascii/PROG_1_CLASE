/**
 * @version 2.0
 * @autor Sofía Otero
 * Solicita al usuario una nota numérica y utiliza una estructura `switch` para clasificarla.
 * Dependiendo del valor ingresado (0-10), imprime la calificación correspondiente (Suspenso, Suficiente, Ben, Notable, Sobresaliente)
 *Si la nota no está en el rango, muestra "nota inválida".
 */


import java.util.Scanner; //importamos nuestro scanner
public class Notas {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in); //creamos nuestro nuevo scanner llamado teclado
        int nota;//creamos variable para alojar el valor nota
        System.out.println("Introduce la nota (número entero) del alumno");//imprimimos pregunta
        nota=teclado.nextInt();
        switch (nota) { //ceamos los diferentes casos segun el valor de la nota
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("Ben");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("nota invalida");
                break;
        }
        teclado.close();//cerrramos nuestro scanner para optimizar recursos
    }
}


