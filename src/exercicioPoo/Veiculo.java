package exercicioPoo;

public class Veiculo {
	
	private Motor motor;
	private TanqueCombustivel tanque;
	protected Pneu pneus;
	private int quilometragem;
	
	
	public Veiculo(Motor motor, TanqueCombustivel tanque, Pneu pneus, int quilometragem) {
		super();
		this.motor = motor;
		this.tanque = tanque;
		this.pneus = pneus;
		this.quilometragem = quilometragem;
	}

	Pneu p1 = new Pneu(5.5);
	Motor m1 = new Motor(5,5);

	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public TanqueCombustivel getTanque() {
		return tanque;
	}


	public void setTanque(TanqueCombustivel tanque) {
		this.tanque = tanque;
	}


	public Pneu getPneus() {
		return pneus;
	}


	public void setPneus(Pneu pneus) {
		this.pneus = pneus;
	}


	public int getQuilometragem() {
		return quilometragem;
	}


	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double atualizarConsumo() {
		if (p1.getPressao() < 20) {
			m1.taxaDeConsumo = m1.taxaDeConsumo * (0.02);
		}
		return p1.getPressao();
	}
	

	
	
}
