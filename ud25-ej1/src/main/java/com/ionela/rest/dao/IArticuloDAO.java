package com.ionela.rest.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}