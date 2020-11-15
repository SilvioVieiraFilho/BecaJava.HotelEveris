package br.app.HotelEveris.response;

import java.util.List;
import java.util.Optional;

import br.app.HotelEveris.model.Quarto;
import br.app.HotelEveris.model.TipoQuarto;

public class QuartoResponse extends BaseResponse {

	private Long id;
	private int andar;
	private int nquarto;
	
	private String situacao;
	private TipoQuarto tipoquarto;
	Optional<Quarto> lista;
	Optional<Quarto> listaa;
	
	
	

	// TODO Auto-generated constructor
public QuartoResponse() {
		}
	

	public void setLista(Optional<Quarto> lista) {
		this.lista = lista;
	}

	public Long getId() {
		return id;
	}
	
	

	public QuartoResponse(Long id, int andar, int nquarto, String situacao, TipoQuarto tipoquarto,
			Optional<Quarto> lista) {
		super();
		this.andar = andar;
		this.nquarto = nquarto;
		this.situacao = situacao;
		this.tipoquarto = tipoquarto;
		this.listaa = lista;
	}
	
	public QuartoResponse( Long id ,int andar, int nquarto, String situacao, TipoQuarto tipoquarto) {
		super();
	
		this.andar = andar;
		this.nquarto = nquarto;
		this.situacao = situacao;
		this.tipoquarto = tipoquarto;
       this.id = id;
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

	public int getNquarto() {
		return nquarto;
	}

	public void setNquarto(int nquarto) {
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
