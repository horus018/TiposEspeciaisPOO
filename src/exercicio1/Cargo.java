package exercicio1;

public enum Cargo {
	MED("medico, trabalha no maximo 8 horas"),
	TRAD("tecnico em radiologia, trabalha no maximo 4 horas"),
	DEV("programador de sistemas, trabalha no maximo 8 horas"),
	PA("piloto de aviao, trabalha no maximo 5 horas");
	
	private String cargo;
	
	private Cargo(String cargo) {
		this.cargo = cargo;
	}

	//em enums eu so preciso do get pois o valor sera setado na classe trabalhador
	public String getCargo() {
		return cargo;
	}
	
}
