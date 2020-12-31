package entities;

public abstract class Contribuinte {
	
	private String nome;
	private Double renda_Anual;
	

	public Contribuinte() {

	}

	public Contribuinte(String nome, Double renda_Anual) {

		this.nome = nome;
		this.renda_Anual = renda_Anual;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public Double getRenda_Anual() {

		return this.renda_Anual;

	}

	public void setRenda_Anual(Double renda_Anual) {

		this.renda_Anual = renda_Anual;

	}

	
	
	public Double calc_Imposto() {
		
		return this.renda_Anual * 0.15;
		
	}
	
	
	public String toString() {
		
		return  this.nome +": $" + this.calc_Imposto() + "\n";  
	}
}
