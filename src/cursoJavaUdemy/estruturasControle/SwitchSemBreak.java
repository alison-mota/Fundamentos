package cursoJavaUdemy.estruturasControle;

import java.util.Scanner;

public class SwitchSemBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a idade da criança para saber o que ela faz: ");
        int idade = entrada.nextInt();

        switch (idade){
            case 5:
                System.out.println("Sabe fazer birra.");
            case 4:
                System.out.println("Sabe comer só e correr.");
            case 3:
                System.out.println("Sabe falar.");
            case 2:
                System.out.println("Sabe andar.");
            case 1:
                System.out.println("Sabe só chorar.");
        }

        entrada.close();
    }
}
