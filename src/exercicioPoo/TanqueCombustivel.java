package exercicioPoo;

public class TanqueCombustivel {
	private double capacidadeMaxima, quantidadeAtualCombustivel;
	
	
	public TanqueCombustivel(double capacidadeMaxima, double quantidadeAtualCombustivel) {
		super();
		this.capacidadeMaxima = capacidadeMaxima;
		this.quantidadeAtualCombustivel = quantidadeAtualCombustivel;
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(double capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public double getQuantidadeAtualCombustivel() {
		return quantidadeAtualCombustivel;
	}

	public void setQuantidadeAtualCombustivel(double quantidadeAtualCombustivel) {
		this.quantidadeAtualCombustivel = quantidadeAtualCombustivel;
	}
	
	public double Abastecer(double encher) {
		if (((this.quantidadeAtualCombustivel + encher) < this.capacidadeMaxima) || (this.quantidadeAtualCombustivel + encher) == this.capacidadeMaxima) {
			return this.quantidadeAtualCombustivel + encher;
		} else {
			System.out.print("Você acedeu a cabacidade máxima a quantidade de litros restante é: ");
			return ((this.quantidadeAtualCombustivel + encher) - this.capacidadeMaxima);
		}
	}
	
	
	
}
