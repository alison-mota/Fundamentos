package cursoJavaUdemy.classesMetodosDesafios;

public class Jantar {

    public static void main(String[] args) {

        Comida arroz = new Comida("arroz", 0.5);
        Comida feijao = new Comida("feijao", 0.35);
        Comida carne = new Comida("carne", 0.65);

        Pessoa alison = new Pessoa("Alison", 68);
        double pesoIni = alison.peso;

        double novoPeso = alison.comer(arroz.peso);

        System.out.println("O peso do Alisu era " + pesoIni + ", mas comeu uma porção de arroz. Agora o peso dele é " + novoPeso);

    }
}
