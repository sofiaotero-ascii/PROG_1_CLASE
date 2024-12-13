package boletin_7;

public class b_7 {
    public static void main(String[] args) {
        int [] matriz_notas_dam={
               1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,2,2,10
        };
        int aprobados=0;
        int suspensos=0;
        int suma_notas=0;
        int nota_max=0;
        for (int nota:matriz_notas_dam){
            suma_notas+=nota;
            if (nota>=5){
                aprobados++;
            }else{
                suspensos++;
            }
            nota_max=Math.max(nota_max,nota);
        }
        double media=(double) suma_notas/matriz_notas_dam.length;
        System.out.println("La media de las notas es: "+media);
        System.out.println("El número de aprobados es: "+aprobados);
        System.out.println("El número de suspensos es: "+suspensos);
        System.out.println("La nota más alta es: "+nota_max);
    }
}
