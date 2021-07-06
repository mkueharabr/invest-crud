package br.com.fiap.investimento.dao;

public interface GenericDAO {

	public void cadastrar();
	
	public void excluir();
	
	public void alterar();
	
	public void consultarPorId();
	
	public void buscarTodos();
	
}
