package entities;

public final class PessoaFisica extends Contribuinte {

	private Double gastos_Saude;

	public PessoaFisica() {

		super();
	}

	public PessoaFisica(String nome, Double renda_Anual, Double gastos_Saude) {

		super(nome,renda_Anual);
		this.gastos_Saude = gastos_Saude;

	}

	public Double getGastos_Saude() {

		return gastos_Saude;

	}

	public void setGastos_Saude(Double gastos_Saude) {

		this.gastos_Saude = gastos_Saude;

	}

	@Override
	public Double calc_Imposto() {
	
		Double res = null;
		
		if (this.getRenda_Anual() < 20000) {

			res = ((this.getRenda_Anual() * 0.15) - (this.gastos_Saude * 0.50));

		} else if (this.getRenda_Anual() >= 20000.00) {

			res = ((this.getRenda_Anual() * 0.25) - (this.gastos_Saude * 0.50));

		}

		return res;

	}





	@Override
	public String toString() {
		
		return this.getNome() +": $" + String.format("%.2f",this.calc_Imposto()) + "\n";  
	}
	
	
	
	
}
