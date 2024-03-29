package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedores {
	@Id
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	/*@OneToMany
	@JoinColumn(name="id")
	private List<Suministra> suministra;*/
	
	//Constructores
	public Proveedores() {
		
	}

	public Proveedores(int id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		//this.suministra = suministra;
	}
	//Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}*/
	//Método String

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
