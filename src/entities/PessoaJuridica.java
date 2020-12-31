package entities;

public final class PessoaJuridica extends Contribuinte {


	private Integer num_func;

	
	public PessoaJuridica() {
		
		super();
	}
	
	public PessoaJuridica(String nome, Double renda_Anual,Integer num_func) {
		
		super(nome,renda_Anual);
		
		this.num_func = num_func;
		
	}

	public Integer getNum_func() {
		
		return num_func;
	
	}

	public void setNum_func(Integer num_func) {
		
		this.num_func = num_func;
	
	}
	
	
	
	@Override
	public Double calc_Imposto() {
	
		double res = 0;
		
		if (this.getNum_func() > 10) {

			res = this.getRenda_Anual() * 0.14;  

		} else {
			
			res = this.getRenda_Anual() * 0.16;
		}

		return res;

	}

	@Override
	public String toString() {
		
		return this.getNome() +": $" + String.format("%.2f",this.calc_Imposto()) + "\n";  
	}
}
