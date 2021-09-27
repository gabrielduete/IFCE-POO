package expessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("100", "Gabriel");
        Pessoa p2 = new Pessoa("100", "Gabriel");

        System.out.println(p1.equals(p2));
    }
}
