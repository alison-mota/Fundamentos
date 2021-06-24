package cursoJavaUdemy.collections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneo {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add(1);

        System.out.println("O Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste")); //Não existe um objeto com "t" minúsculo

        System.out.println("O Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));

        System.out.println(conjunto);


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);


        conjunto.addAll(nums); //Fazendo união de conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); //Fazendo intersecção de conjuntos
        System.out.println(conjunto);

        conjunto.clear(); //Limpando conjunto
        System.out.println(conjunto);
    }
}
