package com.ionela.rest.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ionela.rest.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

}