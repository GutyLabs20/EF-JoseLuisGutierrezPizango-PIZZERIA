package com.idat.EFJoseLuisGutierrezPizangoPIZZERIA.Service;

import java.util.List;

import com.idat.EFJoseLuisGutierrezPizangoPIZZERIA.Model.Pizzeria;

public interface PizzeriaService {
	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
}
