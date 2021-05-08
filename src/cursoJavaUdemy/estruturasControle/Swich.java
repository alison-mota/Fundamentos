package cursoJavaUdemy.estruturasControle;

import java.util.Scanner;

public class Swich {

    public static void main(String[] args) {

        String valor = "";

        while (!"sair".equals(valor)){

            double salVendedor = 1800;
            double salSuporte = 1500;
            double salCs = 1500;
            double salDev = 3200;
            double salQa = 2300;
            double salPo = 5500;

            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira setor para saber o salário, ou digite 'Sair' para finalizar: ");
            valor = entrada.nextLine();

            switch (valor){
                case "vendedor":
                    System.out.println("O salário de um vendedor é R$" + salVendedor);
                    break;
                case "suporte":
                    System.out.println("O salário de um suporter é R$" + salSuporte);
                    break;
                case "cs":
                    System.out.println("O salário de um CSer é R$" + salCs);
                    break;
                case "dev":
                    System.out.println("O salário de um Dev é R$" + salDev);
                    break;
                case "qa":
                    System.out.println("O salário de um QA é R$" + salQa);
                    break;
                case "po":
                    System.out.println("O salário de um PO é R$" + salPo);
                    break;
                case "sair":
                    System.out.println("Obrigado por consultar!");
                    break;
                default:
                    System.out.println("Entrada inválida.");
                    break;

            }
        }
    }
}
