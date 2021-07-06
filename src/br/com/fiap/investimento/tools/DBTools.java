package br.com.fiap.investimento.tools;

public class DBTools {

	
	public static void obterConexao() throws Exception {
		
		if ( Math.random() < 0.5 ) {
			throw new Exception("Erro ao acessar o banco de dados");
		}
		
	}
	
	
}
