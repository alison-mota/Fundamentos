package cursoJavaUdemy.araysCollectionsDesafios;

import java.util.Scanner;

public class DesafioMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos da turma: ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Informe a quantidade de notas de cada aluno: ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDosAlunos = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (j + 1), (i + 1));
                notasDosAlunos[i][j] = entrada.nextDouble();
                total += notasDosAlunos[i][j];
            }
        }

        System.out.println("A média das notas da turma é " + (total / (quantidadeAlunos * quantidadeNotas)));

        entrada.close();
    }
}
