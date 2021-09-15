package dio.primeiro_projeto;

import dio.atalho.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		//System.out.println("Hello World! \nMy name is Fernanda and you'll know me! :)");
		
		Gato g1 = new Gato("Fernanda", "Branco", 22);
		Gato g2 = new Gato("William", "Amarelo", 28);
						
		g1.status();
		g2.status();

	}

}
