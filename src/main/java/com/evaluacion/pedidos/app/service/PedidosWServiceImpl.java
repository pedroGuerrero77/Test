package com.evaluacion.pedidos.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evaluacion.pedidos.app.dao.PedidosWDao;
import com.evaluacion.pedidos.app.models.entity.PedidosW;

@Service
public class PedidosWServiceImpl implements PedidosWService{

	@Autowired
	private PedidosWDao pedidosDao;

	@Override
	@Transactional(readOnly = true)
	public List<PedidosW> findAll() {
		return (List<PedidosW>) pedidosDao.findAll();
	}

	@Override
	@Transactional
	public PedidosW save(PedidosW producto) {
		return pedidosDao.save(producto);
	}
}
