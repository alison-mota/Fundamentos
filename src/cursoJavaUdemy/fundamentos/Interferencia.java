package cursoJavaUdemy.fundamentos;

public class Interferencia {

    public static void main(String[] args) {

        double a = 4;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        var fc = "texto";
        System.out.println(fc);

        var b = 4;
        System.out.println(b);

       // b = "teste";

        double d; // variável foi declarada
        d = 123.5; // variável foi inicializada
        System.out.println(d); // variável foi usada

    }
}
