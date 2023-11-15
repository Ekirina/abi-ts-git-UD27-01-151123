package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="suministra")
public class Suministra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name="codigo_pieza")
	Piezas piezas;
	
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	Proveedores proveedores;
	
	@Column(name ="precio")
	private int precio;
	
	//Constructores
	public Suministra() {
		
	}

	public Suministra(int id, Piezas piezas, Proveedores proveedores, int precio) {
		//super();
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.precio = precio;
	}
	//Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piezas getPiezas() {
		return piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	//Método String
	@Override
	public String toString() {
		return "Suministra [id=" + id + ", piezas=" + piezas + ", proveedores=" + proveedores + ", precio=" + precio
				+ "]";
	}
}
