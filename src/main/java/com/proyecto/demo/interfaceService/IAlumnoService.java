package com.proyecto.demo.interfaceService;

import java.util.Optional;
import com.proyecto.demo.modelo.Alumno;

public interface IAlumnoService {
    Optional<Alumno> findByCod_alu(int cod_alu);
}