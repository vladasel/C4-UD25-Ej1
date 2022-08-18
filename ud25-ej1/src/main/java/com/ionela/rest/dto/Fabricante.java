package com.ionela.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fabricantes") // en caso que la tabala sea diferente
public class Fabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	public Fabricante() {
	}

	public Fabricante(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Fabricante(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + "]";
	}

}