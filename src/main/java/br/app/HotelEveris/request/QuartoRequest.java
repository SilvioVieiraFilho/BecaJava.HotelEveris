package br.app.HotelEveris.request;

import java.util.Set;

import br.app.HotelEveris.model.Comodidade;
import br.app.HotelEveris.model.TipoQuarto;

public class QuartoRequest {

	private int andar;
	private String nquarto;
	private String situacao;
	private TipoQuarto tipoquarto;
//	private Set<Comodidade> comododidade;
//
//	public Set<Comodidade> getComododidade() {
//		return comododidade;
//	}
//
//	public void setComododidade(Set<Comodidade> comododidade) {
//		this.comododidade = comododidade;
//	}

	public TipoQuarto getTipoquarto() {
		return tipoquarto;
	}

	public void setTipoquarto(TipoQuarto tipoquarto) {
		this.tipoquarto = tipoquarto;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getNquarto() {
		return nquarto;
	}

	public void setNquarto(String nquarto) {
		this.nquarto = nquarto;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
