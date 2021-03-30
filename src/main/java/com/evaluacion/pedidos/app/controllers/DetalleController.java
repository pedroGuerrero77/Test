package com.evaluacion.pedidos.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.pedidos.app.models.entity.PedidosDetalleW;
import com.evaluacion.pedidos.app.service.PedidosDetalleWService;

@RestController
public class DetalleController {

	@Autowired
	private PedidosDetalleWService detallesservice;
	
	@GetMapping("/listarPedidosDetalleW")
	public List<PedidosDetalleW> listar(){
		return detallesservice.findAll();
	}

	@PostMapping("/crearPedidoDetalle")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PedidosDetalleW crear(@RequestBody PedidosDetalleW pedidosW) {
		return detallesservice.save(pedidosW);
	}
}
