package cursoJavaUdemy.fundamentos;

public class TipoString {

    public static void main(String[] args) {
        var nome = "Alison";
        var idade = 32;
        var profissao = "PO";
        var salario = 4500;

        String frase = String.format("O profissional %s que trabalha como %s tem %d anos e recebe R$%s reais de salário.", nome, profissao, idade, salario);
        System.out.println(frase);

    }

}
