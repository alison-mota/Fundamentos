package cursoJavaUdemy.estruturasControle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        String nome = "";
        while (!"sair".equalsIgnoreCase(nome)){
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite algo: ");
            nome = entrada.nextLine();

            // Se fechar da problema
            //entrada.close();
        }
    }
}
