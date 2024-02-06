package com.ipartek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ipartek.model.Vivienda;

@Repository
public interface ViviendaRepository extends JpaRepository <Vivienda, Integer> {
	
	
	@Query(value = "SELECT * FROM viviendas where categoria_id=valor", nativeQuery= true)
	List<Vivienda> obtenerViviendasPorCateg(@Param("valor") int valor);

}
