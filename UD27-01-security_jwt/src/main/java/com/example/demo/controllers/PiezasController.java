package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Piezas;
import com.example.demo.dto.Proveedores;
import com.example.demo.services.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {
	@Autowired
	PiezasServiceImpl piezasServiceImpl;
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return piezasServiceImpl.listarPiezas();
	}
	@PostMapping("/piezas")
	public Piezas salvarPiezas(@RequestBody Piezas piezas) {
		
		return piezasServiceImpl.guardarPiezas(piezas);
	}
	@GetMapping("/piezas/{id}")
	public Piezas piezasXID(@PathVariable(name="id")int id) {
		Piezas Piezas_xid = new Piezas();
		Piezas_xid = piezasServiceImpl.piezasXID(id);
		System.out.println("Piezas XID: "+Piezas_xid);
		return Piezas_xid;
	}
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable(name="id")int id, @RequestBody Piezas piezas) {
		Piezas Piezas_seleccionado= new Piezas();
		Piezas Piezas_actualizado= new Piezas();

		Piezas_seleccionado= piezasServiceImpl.piezasXID(id);

		Piezas_seleccionado.setNombre(piezas.getNombre());

		Piezas_actualizado = piezasServiceImpl.actualizarPiezas(Piezas_seleccionado);

		System.out.println("La pieza actualizada es: "+ Piezas_actualizado);

		return Piezas_actualizado;
	}
	@DeleteMapping("/piezas/{id}")
	public void eliminarCurso(@PathVariable(name="id")int id) {
		piezasServiceImpl.eliminarPiezas(id);
	}
}
