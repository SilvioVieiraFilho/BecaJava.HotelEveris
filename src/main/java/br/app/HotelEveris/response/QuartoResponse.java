package br.app.HotelEveris.response;

import br.app.HotelEveris.model.TipoQuarto;

public class QuartoResponse extends BaseResponse {
	
	private Long id;
	private int andar;
	private String nquarto;
	private String situacao;
	private TipoQuarto tipoquarto;

	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public TipoQuarto getTipoquarto() {
		return tipoquarto;
	}
	public void setTipoquarto(TipoQuarto tipoquarto) {
		this.tipoquarto = tipoquarto;
	}

	
	
	
	
	
	
	

}
