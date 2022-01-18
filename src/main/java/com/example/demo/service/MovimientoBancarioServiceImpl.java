package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IMovimientoBancarioDao;
import com.example.demo.entity.MovimientoBancario;

@Service
public class MovimientoBancarioServiceImpl implements IMovimientoBancarioService{

	@Autowired
	private IMovimientoBancarioDao movimientoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<MovimientoBancario> findAll() {
		return (List<MovimientoBancario>) movimientoDao.findAll();
	}

	@Override
	@Transactional
	public void save(MovimientoBancario movimientoBancario) {
		movimientoDao.save(movimientoBancario);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<MovimientoBancario> getMovimientoUser(Long id) {		
		return (List<MovimientoBancario>)movimientoDao.findByUserId(id);
	}
	

}
