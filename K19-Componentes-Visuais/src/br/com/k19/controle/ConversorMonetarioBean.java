package br.com.k19.controle;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorMonetarioBean {

	private String de;
	private String para;
	private Double valor;
	private Double resultado;

	private Map<String, Double> taxas = new LinkedHashMap<String, Double>();

	public Map<String, Double> getTaxas() {
		return taxas;
	}

	public void setTaxas(Map<String, Double> taxas) {
		this.taxas = taxas;
	}

	public ConversorMonetarioBean() {
		this.taxas.put("Real", 1.0);
		this.taxas.put("Euro", 2.33);
		this.taxas.put("Peso Argentino", 0.42);
		this.taxas.put("Dolar americano", 1.84);
	}

	public void converte() {
		this.setResultado(this.valor * this.taxas.get(this.de) / this.taxas.get(this.para));
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

}
