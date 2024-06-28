package com.proyecto.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.modelo.Reserva;

public interface IReservaService {
	public List<Reserva> listar();
	public Optional<Reserva> listarId(int id);
	public int save(Reserva p);
	public void delete(int id);

}
