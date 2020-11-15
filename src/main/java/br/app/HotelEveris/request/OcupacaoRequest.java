package br.app.HotelEveris.request;

import java.util.Date;

import br.app.HotelEveris.model.Cliente;
import br.app.HotelEveris.model.Quarto;

public class OcupacaoRequest {

	private Long idquarto;
	private Date data;
	private int qtdiarias;
	private Long idcliente;
	private String situacao;
	
	
	
	
	

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}

	public Long getIdquarto() {
		return idquarto;
	}

	public void setIdquarto(Long idquarto) {
		this.idquarto = idquarto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getQtdiarias() {
		return qtdiarias;
	}

	public void setQtdiarias(int qtdiarias) {
		this.qtdiarias = qtdiarias;
	}

}
