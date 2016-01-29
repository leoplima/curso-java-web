package br.com.k19.controle;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumeroAleatorioBeam {

	private int maximo;
	private int numeroAleatorio;

	public String geraNumeroAleatorio() {
		this.numeroAleatorio = (int) (Math.random() * this.maximo);
		return "resposta";
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

}
