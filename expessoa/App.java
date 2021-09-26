package expessoa;

public class App {
    public static void main(String[] args) {        
        Pessoa p1 = new Pessoa("José", "10000000");
        Pessoa p2 = new Pessoa("José", "10000000");

        System.out.println(p1.equals(p2));
   }    
}
