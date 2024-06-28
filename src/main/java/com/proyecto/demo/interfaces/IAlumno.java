package com.proyecto.demo.interfaces;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.demo.modelo.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer> {
	
}


