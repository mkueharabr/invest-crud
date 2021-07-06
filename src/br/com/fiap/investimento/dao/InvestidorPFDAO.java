package br.com.fiap.investimento.dao;

public class InvestidorPFDAO implements GenericDAO {

	public void cadastrar() {
		System.out.println("INSERT INTO investidor ...;");
	}
	
	public void excluir() {
		System.out.println("DELETE investidor WHERE investidorId = 3;");
	}
	
	public void alterar() {
		System.out.println("UPDATE investidor ...;");
	}
	
	public void consultarPorId() {
		System.out.println("SELECT * FROM investidor WHERE ...;");
	}
	
	public void buscarTodos() {
		System.out.println("SELECT * FROM ...;");
	}
	
}
