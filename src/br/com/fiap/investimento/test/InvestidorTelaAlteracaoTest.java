package br.com.fiap.investimento.test;

import javax.swing.JOptionPane;

import br.com.fiap.investimento.business.InvestidorBusiness;
import br.com.fiap.investimento.exceptions.DadoInexistenteException;
import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorTelaAlteracaoTest {

	public static void main(String[] args) {

		try {
			//Dados digitados pelo usuário
			int id = 2;
			String cpf = "999.999.999-99";
			String nome = "Alvaro Morata";
			
			// Instanciar o objeto
			InvestidorPF invPf = new InvestidorPF();
			invPf.setInvestidorId(id);
			invPf.setCpf(cpf);
			invPf.setNomeInvestidor(nome);
			
			// Executar o m�todo do business para efeuar o Alteracao
			InvestidorBusiness business = new InvestidorBusiness();
			business.alterarInvestidor(invPf);
			
			// Exibir mensagem para o usu�rio
			JOptionPane.showMessageDialog(null, "Investidor alterado com sucesso!");
			
		} catch (DadoInexistenteException  e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Dados informados não existem. Por favor verifique os dados digitados.");
		
		} catch(DadoNaoAlteradoException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível efetuar a alteração. Por favor verifique os dados digitados.");
		}
		
	}

}
