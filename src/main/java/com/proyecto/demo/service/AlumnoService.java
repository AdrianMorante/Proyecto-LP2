package com.proyecto.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.demo.interfaceService.IAlumnoService;
import com.proyecto.demo.modelo.Alumno;
import com.proyecto.demo.interfaces.IAlumno;

@Service
public class AlumnoService implements IAlumnoService {
	
	@Autowired
	private IAlumno data;
	
	@Override
	public Optional<Alumno> findByCod_alu(int cod_alu) {
		return data.findById(cod_alu);
	}

	 

   
}