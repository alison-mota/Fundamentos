package cursoJavaUdemy.araysCollectionsDesafios;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de notas que irá lançar: ");
        int infoQtddNotas = entrada.nextInt();

        double[] notas = new double[infoQtddNotas];

        for (int i = 0; i < infoQtddNotas; i++) {
            System.out.print("Informe a nota " + (i +1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double somaNotas = 0;

        for(double j: notas) {
            somaNotas += j;
        }

        System.out.print("A média das notas desse aluno é " + (somaNotas / infoQtddNotas));

    }
}
