package com.ufab.entidade;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ufab.enumerador.TipoCursoEnum;


/**
 * Classe par objetos do tipo Curso, com valores e metodos para os mesmos.
 * 
 * @author Bianca
 *
 */
@Entity(name = "curso")
@Table(name = "curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = 3059184459770169333L;
	@Id
	@GeneratedValue
	@Column(name = "curso_cod")
	private Integer cod;

	@Column
	private String nome;
	
	@Column
	private String area;

	@Enumerated(EnumType.STRING)
	private TipoCursoEnum tipo;

	@Column(unique = true)
	private String tag;

	public TipoCursoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoCursoEnum tipoCurso) {
		this.tipo = tipoCurso;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	


}
