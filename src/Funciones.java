import java.util.ArrayList;

public class Funciones {
    public static void main(String[] args) {
    bienvenida();

    saludaa("Carlos");

    System.out.println(resta(10,5));

    System.out.println(multi(5));

    parimpar(5);

    System.out.println(esmayordeEdad(17));

    System.out.println(longitudcadena("Holii"));

        int[] numeros = new int[] {4,7,8,4,5,14,7,8,9,10};
        System.out.println(media(numeros));

        System.out.println(factorial(5));

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");
        mostrarLista(nombres);

    }

    // 1. Crea una función que imprima ¡Te doy la bienvenida!.
    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludaa(String nombre){
        System.out.println("Hola como estas? "+nombre);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.

    public static int resta(int a, int b){
    return a-b;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).

    public static int multi(int a){
        return a*a;
    };

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void parimpar(int a){
        if(a%2==0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }

    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean esmayordeEdad(int edad){
        if(edad>=18){
            return true;
        }else  {
            return false;
        }
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static int longitudcadena(String cadena){
        return  cadena.length();
    }

    // 8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double media(int[] array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }

       double m = sum/array.length;

        return m;
    }


    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static long factorial(int n){
        long facto = 1;
        while (n > 1){
            facto *= n;
            n--;
        }
        return facto;
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void mostrarLista(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
