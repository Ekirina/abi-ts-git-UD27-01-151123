package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Piezas;

public interface IPiezasService {
	//Métodos del CRUD
	public List<Piezas> listarPiezas(); //Listar All 
	
	public Piezas guardarPiezas(Piezas piezas);	//Guarda 
	
	public Piezas piezasXID(int id); //Leer datos 
	
	public Piezas actualizarPiezas(Piezas piezas); //Actualiza datos 
	
	public void eliminarPiezas(int id);// Elimina datos
}
