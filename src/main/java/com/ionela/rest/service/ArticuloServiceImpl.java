package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IArticuloDAO;
import com.ionela.rest.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	// Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulos() {

		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo cliente) {

		return iArticuloDAO.save(cliente);
	}

	@Override
	public Articulo articuloXID(Long id) {

		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {

		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {

		iArticuloDAO.deleteById(id);

	}

}