package com.proyecto.demo.modelo;

import java.sql.Time;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "alumno_id", referencedColumnName = "cod_alu")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "aula_id", referencedColumnName = "id")
    private Aula aula;

    private Time inicio_reserva;
    private Time fin_reserva;
	
	public Reserva() {
		super();
	}

	public Reserva(int id, Alumno alumno, Aula aula, Time inicio_reserva, Time fin_reserva) {
		super();
		this.id = id;
		this.alumno = alumno;
		this.aula = aula;
		this.inicio_reserva = inicio_reserva;
		this.fin_reserva = fin_reserva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Time getInicio_reserva() {
		return inicio_reserva;
	}

	public void setInicio_reserva(Time inicio_reserva) {
		this.inicio_reserva = inicio_reserva;
	}

	public Time getFin_reserva() {
		return fin_reserva;
	}

	public void setFin_reserva(Time fin_reserva) {
		this.fin_reserva = fin_reserva;
	}

}
