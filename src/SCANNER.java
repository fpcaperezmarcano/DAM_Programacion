import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) {

        System.out.print("Dime tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.print("Dime tu apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        System.out.println("El usuario "+nombre+" "+apellido+ " tiene "+edad+" años");

    }
}
