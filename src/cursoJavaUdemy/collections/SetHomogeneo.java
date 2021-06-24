package cursoJavaUdemy.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {

    public static void main(String[] args) {

        //Lista desordenada
        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Alison");
        listaAprovados.add("Jk");
        listaAprovados.add("Luis Pereira");
        listaAprovados.add("Daniel");
        listaAprovados.add("Vitão");

        for(String candidatos: listaAprovados){
            System.out.println(candidatos);
        }

        System.out.println(" ");

        //Lista Ordenada
        SortedSet<String> listaAprovados2 = new TreeSet<>();
        listaAprovados2.add("asdfasdf");
        listaAprovados2.add("Jk");
        listaAprovados2.add("Luis Pereira");
        listaAprovados2.add("Daniel");
        listaAprovados2.add("Vitão");

        for(String candidatos: listaAprovados2){
            System.out.println(candidatos);
        }
    }
}
