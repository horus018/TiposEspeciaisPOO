package exercicio1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		BigDecimal soma = new BigDecimal("0");
		Trabalhador[] trabalhadores = new Trabalhador[3];
		
		//fazer um array de trabalhadores no lugar do 3 no for
		for (int i = 0; i < trabalhadores.length; i++) {
			System.out.println("informe o nome do trabalhador");
			String nome = entrada.nextLine();
			System.out.println("informe o salario do trabalhador");
			BigDecimal salario = new BigDecimal(entrada.nextLine());
			System.out.println("informe o cargo do trabalhador (MED, TRAD, PA, DEV)");
			String cargo = entrada.nextLine();

			Trabalhador trabalhador = new Trabalhador();
			
			trabalhador.setNome(nome);
			trabalhador.setSalario(salario);
			trabalhador.setCargo(Cargo.valueOf(cargo));
			trabalhadores[i] = trabalhador;

			soma = soma.add(salario);

		}
		entrada.close();
		
		for (int i = 0; i < trabalhadores.length; i++) {
			System.out.println(trabalhadores[i]);
		}
		
		BigDecimal resultado = soma.divide(new BigDecimal("3"), BigDecimal.ROUND_HALF_UP);
		System.out.println("media salarial dos trabalhadores R$"+resultado);

	}

}