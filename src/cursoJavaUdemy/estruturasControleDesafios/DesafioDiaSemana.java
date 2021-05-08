package cursoJavaUdemy.estruturasControleDesafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        // Domingo -> 1
        // Sábado -> 7

        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String entrada = entrada1.nextLine();
        entrada1.close();

        // equalsIgnoreCasa no lugar do equals = ignora letra maiúscula

        if("1".equals(entrada) ){
            System.out.println("Domingo");
            return;
        } else if ("2".equals(entrada)) {
            System.out.println("Segunda");
            return;
        } else if ("3".equals(entrada)) {
            System.out.println("Terça");
            return;
        } else if ("4".equals(entrada)) {
            System.out.println("Quarta");
            return;
        } else if ("5".equals(entrada)) {
            System.out.println("Quinta");
            return;
        } else if ("6".equals(entrada)) {
            System.out.println("Sexta");
            return;
        } else if ("7".equals(entrada)) {
            System.out.println("Sábado");
            return;
        }
        System.out.println("Entrada inválida, tente novamente.");
    }
}
