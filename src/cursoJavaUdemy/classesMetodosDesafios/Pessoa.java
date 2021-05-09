package cursoJavaUdemy.classesMetodosDesafios;

public class Pessoa {

    String nome;
    double peso;


    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double comer(double peso) {
        return this.peso + peso;
    }
}
