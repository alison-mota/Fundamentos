package cursoJavaUdemy.arraysCollections;

import java.util.Arrays;

public class PrimeiroArray {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 6.7;
        notasAlunoA[1] = 9;
        notasAlunoA[2] = 4.9;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        double[] notasAlunoB = {5.3, 8.9, 9.8, 10, 8.5};

        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
