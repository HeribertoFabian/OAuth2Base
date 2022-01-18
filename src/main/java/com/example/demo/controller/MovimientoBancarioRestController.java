package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MovimientoBancario;
import com.example.demo.entity.User;
import com.example.demo.service.IMovimientoBancarioService;

@RestController
@RequestMapping("/api/secure")
public class MovimientoBancarioRestController {

	@Autowired
	private IMovimientoBancarioService movimientoBancario;

	@GetMapping("movimiento_bancario")
	public ResponseEntity<?> movimientos() {
		List<MovimientoBancario> movimientos = movimientoBancario.findAll();
		if (movimientos != null) {
			return new ResponseEntity<>(movimientos, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/movimiento_bancario_user")
	public ResponseEntity<?> movimientoUSer(@RequestBody User user) {
		List<MovimientoBancario> movimientos = movimientoBancario.getMovimientoUser(user.getId());
		if (movimientos != null) {
			return new ResponseEntity<>(movimientos, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
