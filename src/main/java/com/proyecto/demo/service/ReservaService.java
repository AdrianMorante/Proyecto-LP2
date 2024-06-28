package com.proyecto.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.interfaceService.IReservaService;
import com.proyecto.demo.interfaces.IReserva;
import com.proyecto.demo.modelo.Reserva;

@Service
public class ReservaService implements IReservaService{
	
	@Autowired
	private IReserva data;

	@Override
	public List<Reserva> listar() {	
		return (List<Reserva>) data.findAll();
	}

	@Override
	public Optional<Reserva> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Reserva p) {
		int res=0;
        Reserva reserva = data.save(p);
        if(!reserva.equals(null)) {
            res = 1;
        }
        return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
}
