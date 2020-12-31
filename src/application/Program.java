package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<Contribuinte>();

		System.out.println("--------------------------------------");
		System.out.println("            IMPOSTOMETRO              ");
		System.out.println("--------------------------------------");
		
		System.out.print("Entre com o numero de Contribuintes: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Dados do contribuinte #" + i + ":\n");
			System.out.print("Pessoa Fisica ou Pessoa Juridica: (P/F): ");
			char opcao = input.next().charAt(0);
			System.out.print("Nome: ");
			String nome = input.next();
			System.out.print("Renda Anual: ");
			double renda_Anual = input.nextDouble();
		
			if (opcao == 'F') {
				
				System.out.print("Gastos com saude: ");
				double gasto_Saude = input.nextDouble();
				list.add(new PessoaFisica(nome, renda_Anual, gasto_Saude));

			}else {
				
				
				System.out.print("Numero de Funcionarios: ");
				int num_func = input.nextInt();
				list.add(new PessoaJuridica(nome,renda_Anual,num_func));
				
			}

		}
		
		
		System.out.println("--------------------------------------\n\nTaxas padas: ");
		double sum = 0;
		for(Contribuinte c : list) {
			 
			System.out.print(c);
			sum += c.calc_Imposto();
		
		}
		
		System.out.print("TOTAL DE IMPOSTOS PAGOS: "+ String.format("%.2f",sum));
		
		
		
		
		
		input.close();
		
	}

}
