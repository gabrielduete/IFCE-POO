package excontacorrente;

public class contaCorrente2 {
    public static void main(String[] args) {
        contaCorrente1 x = new contaCorrente1();

		x.setSaldo(2000);
		
		x.Sacar(1500.50);
		
		x.Depositar(2000.540);
    }
}
