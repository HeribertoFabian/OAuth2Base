package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.MovimientoBancario;

public interface IMovimientoBancarioDao extends CrudRepository<MovimientoBancario, Long> {
	public List<MovimientoBancario>  findByUserId(Long id);

}
