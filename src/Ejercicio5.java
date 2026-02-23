    import java.util.Scanner;

    public class Ejercicio5 {
        public static void main(String[] args) {
            System.out.print("Dime un numero: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num%2==0){
                System.out.println("Par");

            }else {
                System.out.println("Impar");
            }

        }
    }
