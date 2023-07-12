package exercicio1;

import java.math.BigDecimal;

public class Trabalhador {
	private BigDecimal salario;
	private String nome;
	private Cargo cargo;

	public Trabalhador() {
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Trabalhador [salario=" + salario + ", nome=" + nome + ", cargo=" + cargo.getCargo() + "]";
	}
	
}
