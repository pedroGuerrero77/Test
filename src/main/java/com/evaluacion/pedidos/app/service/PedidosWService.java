package com.evaluacion.pedidos.app.service;

import java.util.List;

import com.evaluacion.pedidos.app.models.entity.PedidosW;

public interface PedidosWService {

	public List<PedidosW> findAll();
	
	public PedidosW save(PedidosW producto);
}
