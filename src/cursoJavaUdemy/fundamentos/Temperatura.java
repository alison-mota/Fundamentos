package cursoJavaUdemy.fundamentos;

public class Temperatura {

    public static void main(String[] args) {
            // (F - 32) x 5/9 = C

        final double ajuste = 32;
        final double divisao = 5.0 / 9;

        int grauFar = 86;
        double celsius = (grauFar-ajuste)*divisao;

        System.out.println(grauFar + " graus Farenhigt é igual a " + (celsius) + " graus celsius.");

    }
}
