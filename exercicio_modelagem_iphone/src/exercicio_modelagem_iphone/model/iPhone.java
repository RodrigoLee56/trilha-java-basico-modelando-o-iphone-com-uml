package exercicio_modelagem_iphone.model;

import exercicio_modelagem_iphone.interfaces.AparelhoTelefonico;
import exercicio_modelagem_iphone.interfaces.NavegadorInternet;
import exercicio_modelagem_iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {

		System.out.println("Selecionando música: " + musica);
	}

}
