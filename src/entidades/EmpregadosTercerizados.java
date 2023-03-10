package entidades;

public class EmpregadosTercerizados extends Empregado{
	Double bonus;
	
	public EmpregadosTercerizados() {
		super();
	}

	public EmpregadosTercerizados(String nome, Integer horas, Double valorHora, Double bonus) {
		super(nome, horas, valorHora);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + bonus * 1.1;
	}
}
