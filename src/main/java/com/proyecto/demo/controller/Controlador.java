package com.proyecto.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.demo.interfaceService.IReservaService;
import com.proyecto.demo.modelo.Reserva;
import com.proyecto.demo.interfaceService.IAlumnoService;
import com.proyecto.demo.modelo.Alumno;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IReservaService service;
	
	@Autowired
    private IAlumnoService alumnoService;
	
	//Listar
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Reserva> reservas = service.listar();
        model.addAttribute("reserva",reservas);
        return "index";
    }

    //Agregar - Nuevo
    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("reserva",new Reserva());
        return "form";
    }

    //guardar actualizacion(editar)
    @PostMapping("/save")
    public String save(@Validated Reserva p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }

    //editar
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Reserva>reserva=service.listarId(id);
        model.addAttribute("reserva",reserva);
        return "Form";
    }

    //eliminar
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id) {
        service.delete(id);
        return "redirect:/listar";

   }
    // Buscar alumno por código
    @GetMapping("/buscar/{cod_alu}")
    public String buscar(@PathVariable int cod_alu, Model model) {
        Optional<Alumno> alumno = alumnoService.findByCod_alu(cod_alu);
        if (alumno.isPresent()) {
            model.addAttribute("alumno", alumno.get());
        } else {
            model.addAttribute("error", "Alumno no encontrado");
        }
        return "Busqueda";
    }
    
}