package cursoJavaUdemy.classesMetodos;

public class Produto {

    String nome;
    double preco;
    final static double desconto = 0.25;

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
