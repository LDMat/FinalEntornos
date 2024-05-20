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
 * Clase que representa a un participante de tipo asistente en un concierto.
 */
public class Asistente extends Participante{
//Constructor
/**
     * Constructor para la clase Asistente
     * @param codigo Código que recibe el participante de tipo asistente.
     * @param nombre Nombre del participante de tipo asistente.
     * @param dni Documento Nacional de Identidad del participante de tipo asistente.
     * @param fechaNacimiento Fecha de naciomiento del participante de tipo asistente.
     */
    public Asistente(String codigo, String nombre, String dni, Date fechaNacimiento) {
        super(codigo, nombre, dni, fechaNacimiento);
    }

//Getters y setters
/**
     * Establece el código de cada asistente.
     * @param getCodigo nuevo código de cada asistente
     */

    public String getCodigo() {
        return codigo;
    }
/**
     * Devuelve el código de cada asistente.
     * @param setCodigo devuelve código de cada asistente
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
/**
     * Establece el nombre de cada asistente.
     * @param getNombre nuevo nombre de cada asistente
     */

    public String getNombre() {
        return nombre;
    }

/**
     * Devuelve el nombre de cada asistente.
     * @param setNombre devuelve nombre de cada asistente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
     * Establece el dni de cada asistente.
     * @param getDni nuevo nombre de cada asistente
     */
    public String getDni() {
        return dni;
    }

/**
     * Devuelve el dni de cada asistente.
     * @param setDni devuelve nombre de cada asistente
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

/**
     * Establece la fecha de nacimineto de cada asistente.
     * @param getFechaNacimiento nuevo nombre de cada asistente
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

/**
     * Devuelve la fecha de nacimiento de cada asistente.
     * @param setFechaNacimiento devuelve nombre de cada asistente
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
