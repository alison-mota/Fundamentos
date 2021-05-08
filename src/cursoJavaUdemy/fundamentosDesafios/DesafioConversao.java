package cursoJavaUdemy.fundamentosDesafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário dos ultimos 3 mêses: ");
        String salario1 = entrada.nextLine().replace(",", ".");
        String salario2 = entrada.nextLine().replace(",", ".");
        String salario3 = entrada.nextLine().replace(",", ".");

        entrada.close();

        Double valor1 = Double.parseDouble(salario1);
        Double valor2 = Double.parseDouble(salario2);
        Double valor3 = Double.parseDouble(salario3);

        Double mediaDouble = (valor1 + valor2 + valor3)/3;
        String mediaString = String.format("%.2f", mediaDouble).replace(",", ".");
        Double media = Double.parseDouble(mediaString);

        System.out.println("A média dos salários dos 3 meses é de R$" + media);

    }
}
