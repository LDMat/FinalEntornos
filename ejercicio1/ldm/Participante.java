/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1.ldm;

import java.util.Date;

/**
 *
 * @author londo
 * Clase que representa a un participante en un concierto.
 */
public abstract class Participante {
    protected String codigo;
    protected String nombre;
    protected String dni;
    protected Date fechaNacimiento;
 
//Constructor
/**
     * Constructor para la clase Participante
     * @param codigo Código que recibe el participante.
     * @param nombre Nombre del participante.
     * @param dni Documento Nacional de Identidad del participante.
     * @param fechaNacimiento Fecha de naciomiento del participante.
     */
    public Participante(String codigo, String nombre, String dni, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

}
