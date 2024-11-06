public class boletin_6_fibonacci {
    public static void main(String[] args) {


            int n1 = 0;
            int n2 = 1;
            int ns = 0;

            int nele = 10;
            int j = 0;
            recursiva("Hola");

            for (int i = 0; i < nele; i++){

                ns = fibonacci(n1, n2);
                n1 = n2;
                n2 = ns;

            }

        }
        static void recursiva (String msg){

            System.out.println(msg);
            if (msg.length()<10) recursiva(msg+".");

        }

        static int fibonacci(int a, int b){
            int suma = a + b;
            System.out.println(suma);
            return suma;
        }
    }