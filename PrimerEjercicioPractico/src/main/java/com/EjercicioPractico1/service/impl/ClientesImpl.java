/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.ClientesDao;
import com.EjercicioPractico1.domain.Clientes;
import com.EjercicioPractico1.service.ClientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClientesImpl implements ClientesService {

    @Autowired
    private ClientesDao clientedao;

    
    @Transactional(readOnly = true)
   

    @Override
    public List<Clientes> getClientes(boolean activos) {
        var lista = clientedao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
       
    }
}