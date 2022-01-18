package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.MovimientoBancario;

public interface IMovimientoBancarioService {

	public List<MovimientoBancario> findAll();
	
	public void save(MovimientoBancario movimientoBancario);
	
	public List<MovimientoBancario> getMovimientoUser(Long id);
	
}
