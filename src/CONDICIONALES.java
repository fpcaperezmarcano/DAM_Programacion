import java.util.Scanner;

public class CONDICIONALES {
    public static void main(String[] args) {


        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        Scanner sc = new Scanner(System.in);

       System.out.print("Dime tu edad: ");

        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("PUEDES VOTAR");
        }else{
            System.out.println("NO PUEDES VOTAR");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
       System.out.print("Dime un Numero: ");
        int n1  =sc.nextInt();

        System.out.print("Dime otro Numero:");
        int n2  =sc.nextInt();

        if (n1 > n2){
            System.out.println(n1+" Es mayor que: "+n2);


        }else if(n1 < n2){
            System.out.println(n2+" Es mayor que: "+n1);
        }else {
            System.out.println("Los numeros son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        System.out.print("Dime un numero: ");
        int n3  =sc.nextInt();

        if(n3 >0){
            System.out.println("TU NUMERO ES UN NÚMERO POSITIVO");
        }else if(n3 <0){
            System.out.println("ES UN NUMERO NEGATIVO");
        }else {
            System.out.println("EL CERO NO ES NI POSITIVO NI NEGATIVOs");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        System.out.print("Dime un numero: ");
        int n4 = sc.nextInt();

        if(n4 %2==0){
            System.out.println("Par");

        }else {
            System.out.println("Impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        System.out.println("Dime un numero: ");
        int n5 = sc.nextInt();

        if(n5 >= 1 && n5 <= 100){
            System.out.println("ESTA DENTRO DEL RANGO");

        }else  {
            System.out.println("ESTA FUERA DEL RANGO");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        System.out.print("Dime el dia de la semana 1-7: ");
        int numdia = sc.nextInt();

        switch(numdia){
            case 1:
                System.out.println("DIA LUNES");
                break;
            case 2:
                System.out.println("DIA MARTES");
                break;
            case 3:
                System.out.println("DIA MIERCOLES");
                break;
            case 4:
                System.out.println("DIA JUEVES");
                break;
            case 5:
                System.out.println("DIA VIERNES");
                break;
            case 6:
                System.out.println("DIA SABADO");
                break;
            case 7:
                System.out.println("DIA DOMINGO");
                break;
            default:
                System.out.println("NO EXISTE ESE DIA DE SEMANA");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" "Suspenso" según la nota (0-100).
        System.out.print("Dime tu nota de programacion: ");
        int nota = sc.nextInt();
        if (nota >= 0 && nota <= 50){
            System.out.println("Has Suspenso programacion");
        } else if (nota >= 50 && nota <= 85) {
            System.out.println("Has Aprobado Programacion");

        }else if (nota >= 85 && nota <= 90) {
            System.out.println("Nota Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debe tener al menos 15 años o ir acompañado.
        System.out.println("Cuantos Años tienes?: ");
        int edad2 = sc.nextInt();
        System.out.println("Estas Acompañado? (SI O NO): ");
        String respuesta = sc.next();

        if (edad2 >= 15) {
            System.out.println("Puedes Entrar al Cine");

        }else if (edad2 < 15 && respuesta.equalsIgnoreCase("SI")) {
            System.out.println("Puedes Entrar al Cine");
        }else{
            System.out.println("No Puedes Entrar al Cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        System.out.println("Dime una Letra");
        char letra = sc.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'  || letra == 'U') {
            System.out.println("Es una Vocal");
        }else{
            System.out.println("Es una Consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

            int a = 10, b = 9, c = 80; //No voy a hacer 3 Scanners xd
        if (a >b && a > c) {
            System.out.println("La variable A es Mayor");
        }else if (b > a && b > c) {
            System.out.println("La variable B es Mayor");
        }else {
            System.out.println("La variable C es Mayor");
        }
    }
}
