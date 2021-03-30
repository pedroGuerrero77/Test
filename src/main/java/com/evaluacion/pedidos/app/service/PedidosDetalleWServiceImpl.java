package com.evaluacion.pedidos.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.pedidos.app.dao.PedidosDetallesWDao;
import com.evaluacion.pedidos.app.models.entity.PedidosDetalleW;

@Service
public class PedidosDetalleWServiceImpl implements PedidosDetalleWService{

	@Autowired
	private PedidosDetallesWDao pedidosDetallesDao;
	
	@Override
	public List<PedidosDetalleW> findAll() {
		return (List<PedidosDetalleW>) pedidosDetallesDao.findAll();
	}

	@Override
	public PedidosDetalleW save(PedidosDetalleW pedidosDetalleW) {
		return pedidosDetallesDao.save(pedidosDetalleW);
	}
}
