import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Estructuras {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println(numeros.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Antes: " + numeros[2]);
        numeros[2] = 99;
        System.out.println("Después: " + numeros[2]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> lista = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Marta");
        lista.add("Carlos");
        lista.remove("Luis");
        System.out.println(lista);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("A");
        conjunto.add("B");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        conjunto.add("A");
        conjunto.add("C");
        System.out.println(conjunto);

        // 7. Elimina uno de los elementos del HashSet.
        conjunto.remove("B");
        System.out.println(conjunto);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> contactos = new HashMap<>();
        contactos.put("Ana", "111111111");
        contactos.put("Luis", "222222222");
        contactos.put("Marta", "333333333");
        System.out.println(contactos);

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.put("Ana", "999999999");
        contactos.remove("Luis");
        System.out.println(contactos);

        // 10. Dado un Array, transfórmalo en un ArrayList y a continuación en un HashSet.
        Integer[] arrayOriginal = {1, 2, 3, 4, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arrayOriginal));
        HashSet<Integer> hashSet = new HashSet<>(arrayList);

        System.out.println(arrayList);
        System.out.println(hashSet);
    }
}
