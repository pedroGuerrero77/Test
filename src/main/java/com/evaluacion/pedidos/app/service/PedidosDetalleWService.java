package com.evaluacion.pedidos.app.service;

import java.util.List;

import com.evaluacion.pedidos.app.models.entity.PedidosDetalleW;

public interface PedidosDetalleWService {

	public List<PedidosDetalleW> findAll();
	
	public PedidosDetalleW save(PedidosDetalleW pedidosDetalleW);
}
