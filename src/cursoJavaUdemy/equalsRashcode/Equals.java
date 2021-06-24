package cursoJavaUdemy.equalsRashcode;

public class Equals {

    public static void main(String[] args) {

        Usuario us1 = new Usuario();
        us1.nome = "Alison Alves";
        us1.email = "alisonalvesmota@gmail.com";

        Usuario us2 = new Usuario();
        us2.nome = "Alison Alves";
        us2.email = "alisonalvesmota@gmail.com";

        System.out.println(us1==us2);
        System.out.println(us1.equals(us2));
    }

}
