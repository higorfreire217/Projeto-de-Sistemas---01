package br.senai.sc.controler;

import java.util.Date;
import br.senai.sc.entidade.*;


public class OperacaoVenda {

	private Historico historico;
	
	public OperacaoVenda(Historico historico) {
		this.historico = historico;
	}
	
	public void vender(Cliente cliente, Atendente atendente, double valor){
		Date hoje = new Date();
		Lancamento lancamento = new Lancamento(hoje, atendente, cliente, valor, atendente.valorComissao(valor), cliente.getDesconto(valor));
				historico.setLancamento(lancamento);
				cliente.acumulaCompras(valor);
				atendente.acumulaComissao(valor);
	}
}
