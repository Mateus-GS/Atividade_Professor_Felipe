package exercicioPoo;

public class Motor {
	private double potencia;
	protected double taxaDeConsumo;
	
	
	public Motor(double potencia, double taxaDeConsumo) {
		super();
		this.potencia = potencia;
		this.taxaDeConsumo = taxaDeConsumo;
	}
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getTaxaDeConsumo() {
		return taxaDeConsumo;
	}
	public void setTaxaDeConsumo(double taxaDeConsumo) {
		this.taxaDeConsumo = taxaDeConsumo;
	}
	

}