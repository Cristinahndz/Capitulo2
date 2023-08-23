package com.sistema.trailers.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genero {

	public Genero(Integer id) {
		super();
		this.id = id;
	}

	public Genero(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(Integer id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	@Id
	@Column(name = "id_genero")
	private Integer id;

	private String titulo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
