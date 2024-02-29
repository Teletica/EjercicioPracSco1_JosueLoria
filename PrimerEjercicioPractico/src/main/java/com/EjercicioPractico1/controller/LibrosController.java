/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;


import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibroService;
import com.EjercicioPractico1.service.ClientesService;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/libros")
public class LibrosController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/listado")
    public String listadoLibros(Model model) {
        var libros = libroService.getLibros(true);
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libros/listado";
    }
}