public class IniciacionOperadores {

public static void main(String[] args) {
    //samuel.martin@salesianosdosa.com
    String name = "Carlos";
    int  age = 19;
    double altura = 1.70;
    boolean megustaprogramar = true;
    final String email = "calepermar@gmail.com";
    char inicial = 'C';


    String localidad = "La Elipa";
    System.out.println(localidad);
    localidad = "Gran via";
    System.out.println(localidad);

    Integer a = 12, b = 10;
    System.out.println(a+b);

    System.out.println(a.getClass().getSimpleName());
    System.out.println(b.getClass().getSimpleName());
    System.out.println();

    String dtmf;
    dtmf = "Debí tirar más fotos de cuando te tuve\n" +
            "Debí darte más besos y abrazo' las veces que pude\n" +
            "Ojalá que los mío' nunca se muden\n" +
            "Y que tú me envíe' más nude'\n" +
            "Y si hoy me emborracho, que Beno me ayude";

    System.out.println(dtmf);


    //OPERADORES

    int n1 = 5,n2=5;

    int suma = n1+n2;
    int resta = n1 - n2;
    int division = n1/n2;
    int resto = n1%n2;

    int asignacion = n1 = 4;
    int sumaasigna = n1 += n2;
    int restaasigna = n1 -= n2;
    int divideasigna = n1 /=n2;
    int multiasigna = n1 *=n2;
    int moduloasigna = n1 %=n2;

    int asignasuma = n1 =+ n2;
    int asignaresta = n1 =-n2;


    System.out.println(6>5);
    System.out.println(5!=6);
    System.out.println(4<1);

    System.out.println(10 >=20);
    System.out.println(10 <=9);
    System.out.println(10 == 100);

    System.out.println(10 == 10 && 5 == 5);
    System.out.println(10 == 10 || 1 >10);

    System.out.println(10 == 10 && 5 == 5 || 10 == 10 && 5 ==5);

    System.out.println(!(10 == 10 && 5 == 5 || 10 == 10 && 5 ==5));


    int n3 = 5;
    System.out.println(n3++);
    System.out.println(n3--);
    System.out.println(++n3);

    int n4 = 5, n5 = 10;

    System.out.println(!(n4 >= 10 && n5 <= 8 || (n4++ + 9) < n5 && n5 == 9));




    }
}