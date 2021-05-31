package excontacorrente;

public class contaCorrente1{
    private double saldo;
    
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void Depositar(double num1) {
		saldo += num1;
		System.out.println("Deposito efetuado com sucesso! Saldo Disponivel: " + saldo);
	}
	
	public void Sacar(double num){
		
		if( saldo<num) {
			 System.out.println("Impossível efetuar saque... " + "Valor disponivel: " + saldo);
		}else{
			saldo -= num;
			System.out.println("Saque efetuado com Sucesso! " + "Saldo Disponível: " + saldo);
		}
	}		
}