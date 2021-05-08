package cursoJavaUdemy.fundamentos;

public class TesteJk {
    public static void main(String[] args) {

        double num = 2.9384934;
        String value = String.format("%.2f", num).replace(",", ".");
        Double temp = Double.parseDouble(value);

        System.out.println("O número é " + temp);
    }
}
