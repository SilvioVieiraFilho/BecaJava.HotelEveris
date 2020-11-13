package br.app.HotelEveris.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Quarto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int andar;
	private String nquarto;
	private String situacao;
	
	@ManyToOne
	@JoinColumn(name = "Idtipoquarto")
	private TipoQuarto tipoquarto;
	
	
	
    @ManyToMany(mappedBy = "como")
	Set<Comodidade> comodidade;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoQuarto getTipoquarto() {
		return tipoquarto;
	}

	public void setTipoquarto(TipoQuarto tipoquarto) {
		this.tipoquarto = tipoquarto;
	}

	public Set<Comodidade> getComodidade() {
		return comodidade;
	}

	public void setComodidade(Set<Comodidade> comodidade) {
		this.comodidade = comodidade;
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
