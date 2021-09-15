package dio.atalho;

public class Gato {
	
	//identação -> Ctrl + Shift + f;
	
	private String nome;
	private String cor;
	private int idade;
	
	public Gato(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	public void status() {
		System.out.println("\nNome: " + getNome() +
					       "\nCor: " + getCor() +
					       "\nIdade: " + getIdade() +
					       "\n\n-----------------------");
	}

}
