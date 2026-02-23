public class Recursividad {
    public static void main(String[] args) {

     //   2. Calcular la sucesión de fibonacci con recursividad a partir de un número que se le pase por parámetro
     //   3. Dado un número, invertir el número. Si el número introducido es 1234, tiene que devolver 4321
     //   4. Contar los dígitos pares de un número entero
     //   5. Comprobar que una cadena es palindroma
        System.out.println("Tu numero tiene: "+digitos(2000)+ " Digitos");

        System.out.println(fibo(3));


    }
    //   1. Obtener el número de dígitos de un número N que se introduzca por teclado
    public static int digitos (int n) {

        if (n < 10) {

            return 1;

        } else {


            return 1 + digitos(n / 10);

        }

    }
    //   2. Calcular la sucesión de fibonacci con recursividad a partir de un número que se le pase por parámetro
    public static  int fibo(int n) {
       if (n < 2) {
           return n;
       } else  {

           return fibo(n - 1) + fibo(n - 2);
       }

    }



}
