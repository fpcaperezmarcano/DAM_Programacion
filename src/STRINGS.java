public class STRINGS {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.

        System.out.println("Hola "+ "Mundo");

// 2. Muestra la longitud de una cadena de texto.
        String cadena = "Cadena de texto";
        System.out.println(cadena.length());

// 3. Muestra el primer y último carácter de un string.
        String cadena2 = "Hola";
        System.out.println(cadena2.charAt(0));
        System.out.println(cadena2.charAt(cadena2.length()-1));

// 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("mayusculas".toUpperCase());
        System.out.println("MINUSCULAS".toLowerCase());

// 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String otrascadenas = "  contiene una palabra concreta   ";
        System.out.println(otrascadenas.contains("contiene"));

// 6. Formatea un string con un entero.
        int edad = 25;
        System.out.printf("Tienes %d años", edad);
        System.out.println("");

// 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(otrascadenas.trim());

// 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(otrascadenas.replace(" ","-"));

// 9. Comprueba si dos strings son iguales.
        System.out.println(otrascadenas.equals(cadena));

// 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(otrascadenas.compareTo(cadena));

    }
}
