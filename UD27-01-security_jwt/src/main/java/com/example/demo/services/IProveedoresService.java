package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Proveedores;

public interface IProveedoresService {
	//Métodos del CRUD
	
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda 
	
	public Proveedores proveedoresXID(int id); //Leer datos 
	
	public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos 
	
	public void eliminarProveedores(int id);// Elimina datos
}
