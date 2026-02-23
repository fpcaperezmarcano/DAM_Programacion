import java.sql.SQLOutput;

public class Recursividad {
    public static void main(String[] args) {

     //   2. Calcular la sucesión de fibonacci con recursividad a partir de un número que se le pase por parámetro
     //   3. Dado un número, invertir el número. Si el número introducido es 1234, tiene que devolver 4321
     //   4. Contar los dígitos pares de un número entero
     //   5. Comprobar que una cadena es palindroma
        System.out.println("Tu numero tiene: "+digitos(2000)+ " Digitos");

        System.out.println(fibo(3));
        System.out.println(invertir(1234,0));
        System.out.println(paresEnteros(88888555));
        System.out.println(esPalidromo("radar"));

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
    // 3. Dado un número, invertir el número. Si el número introducido es 1234, tiene que devolver 4321
    public static int invertir(int n, int param) {
        if (n ==0) {
            return param;
        }else {

           return invertir(n/10, param*10+n%10) ;
        }


    }


    // 4. Contar los dígitos pares de un número entero

    public static int paresEnteros(int n){
        if (n==0) {return 0;}

        if (n%2==0){
            return 1 + paresEnteros(n/10);
        }else {
            return paresEnteros(n/10);
        }


    }


    // 5. Comprobar que una cadena es palindroma
    public static boolean esPalidromo(String palabra) {
        char inicio = palabra.charAt(0);
        char fin = palabra.charAt(palabra.length()-1);
        if(palabra.length()<=1) {
            return true;
        }

        if(inicio == fin){
            return esPalidromo(palabra.substring(1,palabra.length()-1));
        }
        return false;


    }


}
