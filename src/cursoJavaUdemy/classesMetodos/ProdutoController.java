package cursoJavaUdemy.classesMetodos;

public class ProdutoController {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Rapé Paricá";
        p1.preco = 32.50;
        p1.desconto = 0.15;
        double p1Atualizado = p1.precoComDesconto();

        Produto p2 = new Produto();
        p2.nome = "Rapé Samaúma";
        p2.preco = 27.50;
        p2.desconto = 0.1;

        System.out.printf("O valor do rapé paricá é R$%.2f", p1Atualizado);
    }
}
