package polimorfismo2;

public class teste5 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        c1.contar();
        
        System.out.println("----------------------------------------");

        c1 = new ContarPares();
        c1.contar();
    }
}
