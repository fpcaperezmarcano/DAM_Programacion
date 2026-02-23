import java.util.Scanner;

public class SCANNER2 {
    public static void main(String[] args) {
        System.out.println("Dime tu edad Actual: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        int añoNacimiento = 2025 - edad; //Aproximadamente

        System.out.println("Naciste en el año "+añoNacimiento);

    }
}
