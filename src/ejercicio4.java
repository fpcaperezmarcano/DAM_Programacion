import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Dime tu edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        System.out.print("Cuanto dinero tienes?: ");
        double dinero = sc.nextDouble();

        boolean entra = edad >= 18;
        boolean entra2 = dinero > 20;

        boolean entrada = entra && entra2;

        System.out.println("Tienes "+edad+" Y tienes "+dinero+" Puedes entrar?: "+entrada);
    }
}
