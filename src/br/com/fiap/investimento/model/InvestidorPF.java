package br.com.fiap.investimento.model;

public class InvestidorPF extends Investidor {

	private String cpf;

	
	public InvestidorPF() {
		super();
	}
	
	public InvestidorPF(int id, String cpf, String nomeInvestidor) {
		super.setInvestidorId(id);
		super.setNomeInvestidor(nomeInvestidor);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "InvestidorPF [getCpf()=" + getCpf() + ", getInvestidorId()=" + getInvestidorId()
				+ ", getNomeInvestidor()=" + getNomeInvestidor() + "]";
	}
	
	//equal
	
	//compareTo
	
	//hashCode
}
