package cursoJavaUdemy.fundamentosDesafios;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        // Se VV, compra TV de 50' + sorvete em familia
        // Se 1V, compra TV de 32' + sorvete em familia
        // Se FF, não compra TV e não toma sorvete

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if (!trabalho1 && !trabalho2) {
            System.out.println("Que pena! Você errou feio errou rude! Estude mais!");
            return;
        } else if (trabalho1 ^ trabalho2) {
            System.out.println("Você acertou somente um dos trabalhos. Poderá comprar uma TV de 32' e ir tomar sorvete com a família");
            return;
        }
        System.out.println("Parabéns, comprará a TV de 50 polegadas e a família irá tomar sorvete no shopping!!");
    }
}
