/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;


import com.EjercicioPractico1.dao.LibrosDao;
import com.EjercicioPractico1.domain.Libros;
import java.util.List;
import com.EjercicioPractico1.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LibrosImpl implements LibroService {

    @Autowired
    private LibrosDao librosdao;

    @Transactional(readOnly = true)
  

    @Override
    public List<Libros> getLibros(boolean activos) {
        var lista = librosdao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo()); // Asegúrate de tener un método isActivo() en la entidad Libro
        }
        return lista;
       
    }

  
}