import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Bucles {
    public static void main(String[] args) {
        //1. Imprime los numeros del 1 al 10 usando while
        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
        //2. Usa do-while para mostrar todos los valores de un arraylist

        List <String> names = new ArrayList<>(List.of("Nombre1", "Nombre2", "Nombre3", "Nombre4", "Nombre5"));

        int n2 = 0;
        do {
            System.out.println(names.get(n2));
            n2++;
        }while (n2 < names.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 0; i < 50; i++) {
            System.out.println(5*i);

        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
            int [] numeros = {10,10,10,10,10};
            int suma =0;
            for(int i = 0; i < 5; i++) {
                System.out.println(numeros[i]);
                suma = suma+numeros[i];

            }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] names1 = {"Nombre1", "Nombre2", "Nombre3", "Nombre4", "Nombre5"};
        for(int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> nombres = new HashSet<String>(List.of("dato5", "dato4", "dato3", "dato2", "dato1"));
        for(String i :nombres){
            System.out.println(i);
        }
        HashMap<String,String> departamentos = new HashMap<String,String>();
        departamentos.put("1A","SONIA");
        departamentos.put("2A","ALBERTO");
        departamentos.put("3A","ROBERTO");
        departamentos.put("4A","MARTA");

        for(String i :departamentos.values()){
            System.out.println(i);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("");
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 0; i <= 10; i++) {
          //  if(i >=){}
            System.out.println(3*i);

        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] arraynum = {5, 8, 12, 3, -4, 9, 10};

        for (int i = 0; i < arraynum.length; i++) {
            if (arraynum[i] < 0) {
                System.out.println("negativo encontrado: " + arraynum[i]);
                break; // detiene el bucle
            }
            System.out.println("Numero positivo: " + arraynum[i]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 5;
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}
