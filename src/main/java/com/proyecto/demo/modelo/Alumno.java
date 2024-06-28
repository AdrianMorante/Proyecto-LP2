package com.proyecto.demo.modelo;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class Alumno {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_alu;

    private String nombre;
    private String apellido;
    private String carrera;
    private String telefono;
	
	public Alumno() {
		super();
	}

	public Alumno(int cod_alu, String nombre, String apellido, String carrera, String telefono) {
		super();
		this.cod_alu = cod_alu;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.telefono = telefono;
	}

	public int getCod_alu() {
		return cod_alu;
	}

	public void setCod_alu(int cod_alu) {
		this.cod_alu = cod_alu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
    public String toString() {
        return "Alumno{" +
                "cod_alu=" + cod_alu +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", carrera='" + carrera + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

	
	
}
