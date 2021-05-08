package cursoJavaUdemy.fundamentosDesafios;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        double parenteses1 = 3 + 2;
        double chaves1 = 6 * parenteses1;
        double chaves1Pot = Math.pow(chaves1, 2);
        double fracao1 = chaves1Pot / (3*2);

        double parenteses2 = 1 - 5;
        double parenteses3 = 2 - 7;
        double par2x3 = parenteses2 * parenteses3;
        double divParenteses23 = par2x3 / 2;
        double fracao2 = Math.pow(divParenteses23, 2);

        double parenteses4 = fracao1 - fracao2;
        double potParenteses4 = Math.pow(parenteses4, 3);
        double potDivisorGeral = Math.pow(10, 3);

        double resultado = potParenteses4 / potDivisorGeral;

        System.out.println("O resultado é " + resultado);


        // Math.pow
    }

}
