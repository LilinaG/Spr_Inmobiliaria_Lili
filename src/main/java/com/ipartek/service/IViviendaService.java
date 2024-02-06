package com.ipartek.service;

import java.util.List;

import com.ipartek.model.Vivienda;


public interface IViviendaService {
	
	public List<Vivienda> obtenerTodasViviendasPorCategoria(int categ); //obtener todas las viviendas por una categoria determinada (alquiler o venta)

	public void insertarVivienda(Vivienda vivienda);
	
}
