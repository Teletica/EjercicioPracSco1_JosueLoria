/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Clientes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nombre", nullable = false)
    private String nombre;
    
    @Column(name="email", nullable = false)
    private String email;
    
    @Column(name="mensaje")
    private String mensaje;
    
    @Column(name="activo")
    private boolean activo;
    
    
    public Clientes() {
    }

    public Clientes(String nombre, String email, String mensaje,boolean activo) {
        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;
    }
}