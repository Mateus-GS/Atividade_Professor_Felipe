package exercicioPoo;

public class exercicioPoo {

	public static void main(String[] args) {
		Pneu p1 = new Pneu(5.5);
		TanqueCombustivel tc1 = new TanqueCombustivel(10.0 , 5.0);
		Motor m1 = new Motor(5,5);	
		Veiculo v1 = new Veiculo(m1,tc1,p1,100);
		
		System.out.println(v1.atualizarConsumo());
	}

}
