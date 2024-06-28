package com.proyecto.demo.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Time;

import jakarta.persistence.Entity;

@Entity
public class Aula {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tipo_aula;
    private Time hora_inicio;
    private Time hora_fin;
    private String estado;
	
	public Aula() {
		super();
	}

	public Aula(int id, String tipo_aula, Time hora_inicio, Time hora_fin, String estado) {
		super();
		this.id = id;
		this.tipo_aula = tipo_aula;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_aula() {
		return tipo_aula;
	}

	public void setTipo_aula(String tipo_aula) {
		this.tipo_aula = tipo_aula;
	}

	public Time getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Time getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", tipo_aula='" + tipo_aula + '\'' +
                ", hora_inicio=" + hora_inicio +
                ", hora_fin=" + hora_fin +
                ", estado='" + estado + '\''+
                '}';
    }

}
