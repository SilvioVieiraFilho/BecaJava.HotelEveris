package br.app.HotelEveris.request;

import java.util.Date;

import br.app.HotelEveris.model.Cliente;
import br.app.HotelEveris.model.Quarto;

public class OcupacaoRequest {

	private Cliente idcliente;
	private Quarto idquarto;
	private Date data;
	private int qtdiarias;
	private long idclientee;
	private long idquartooo;
	

	
	
	
	

	public long getIdclientee() {
		return idclientee;
	}

	public void setIdclientee(long idclientee) {
		this.idclientee = idclientee;
	}

	public long getIdquartooo() {
		return idquartooo;
	}

	public void setIdquartooo(long idquartooo) {
		this.idquartooo = idquartooo;
	}

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

	public Quarto getIdquarto() {
		return idquarto;
	}

	public void setIdquarto(Quarto idquarto) {
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
