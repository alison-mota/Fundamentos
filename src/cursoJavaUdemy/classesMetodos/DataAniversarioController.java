package cursoJavaUdemy.classesMetodos;

import java.util.Scanner;

public class DataAniversarioController {

    public static void main(String[] args) {

        DataAniversario aniversarioAlison = new DataAniversario();
        aniversarioAlison.dia = 17;
        aniversarioAlison.mes = 04;
        aniversarioAlison.ano = 1989;

        DataAniversario aniversarioJk = new DataAniversario();
        aniversarioJk.dia = 17;
        aniversarioJk.mes = 03;
        aniversarioJk.ano = 1993;

        Scanner entrada = new Scanner(System.in);
        String aniversario = "";

        while (!"sair".equalsIgnoreCase(aniversario)) {
            System.out.print("Você quer saber a data de aniversário de quem? (para parar, digite 'sair') ");
            aniversario = entrada.nextLine();

            switch (aniversario) {

                case "alison": case "alisu":
                    System.out.printf("A data de aniversário do Alisu é %d/%d/%d.\n",
                            aniversarioAlison.dia, aniversarioAlison.mes, aniversarioAlison.ano);
                    break;
                case "jk":
                    System.out.printf("A data de aniversário do Jacons é %d/%d/%d.\n",
                            aniversarioJk.dia, aniversarioJk.mes, aniversarioJk.ano);
                    break;
                case "sair":
                    System.out.println("Valeu é nóis\n");
                    break;
                default:
                    System.out.printf("Ainda não temos os dados do %s. =(\n", aniversario);

            }
        }
        entrada.close();
    }
}
