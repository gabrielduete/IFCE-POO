package exbalde;

public class Balde1 {
    private double qtdLitrosAgua;
	
	public void Encher() {
		if (qtdLitrosAgua <= 8) {
			qtdLitrosAgua += 2;
		}
	}
	
	public void Esvaziar() {
		if (qtdLitrosAgua >= 2) {
			qtdLitrosAgua -= 2;
		}
	}
	
	public double Checar() {
		return qtdLitrosAgua; 
	}	
}
