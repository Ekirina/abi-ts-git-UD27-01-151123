package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Piezas;
import com.example.demo.dto.Suministra;

public interface ISuministraService {
	//Métodos del CRUD

	public List<Suministra> listarSuministra(); //Listar All 

	public Suministra guardarSuministra(Suministra suministra);	//Guarda 

	public Suministra suministraXID(int id); //Leer datos 

	public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos 

	public void eliminarSuministra(int id);// Elimina datos
}
