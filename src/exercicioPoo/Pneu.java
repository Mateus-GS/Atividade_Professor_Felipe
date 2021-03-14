package exercicioPoo;

public class Pneu {
	protected double pressao;
	
	public Pneu(double pressao) {
		super();
		this.pressao = pressao;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	public double calibrar(double regular) {
		
		return this.pressao = this.pressao + regular;
	}
}
