package cursoJavaUdemy.estruturasControleDesafios;

import java.util.Scanner;

public class DesafioWhile2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        double notas = 0;
        double notaDigitada = 0;

        while (notaDigitada != -1) {
            System.out.print("Insira uma nota de 0 a 10 (ou -1 para calcular a média): ");
            notaDigitada = entrada.nextDouble();

            if(notaDigitada >= 0 && notaDigitada <= 10) {
                notas += notaDigitada;
                cont++;

            } else if (notaDigitada != -1) {
                System.out.println("Nota inválida.");
            }

        }

        double media = notas / cont;
        System.out.println("A média das notas é " + media);

        entrada.close();
    }
}
