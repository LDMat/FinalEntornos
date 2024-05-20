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
 * Clase que representa a un participante de tipo artista en un concierto.
 */
public class Artista extends Participante{
    protected int numIntegrantes;
    protected String estiloMusica;
    protected double cache;

//Constructor
/**
     * Constructor para la clase Artista
     * @param codigo Código que recibe el participante de tipo artista.
     * @param nombre Nombre del participante de tipo artista.
     * @param dni Documento Nacional de Identidad del participante de tipo artista.
     * @param fechaNacimiento Fecha de naciomiento del participante de tipo artista.
     * @param numIntegrantes Número de integrantes de tipo artista.
     * @param estiloMusica Tipo de estilo de música de los artistas.
     * @param cache Caché o precio de cada artista.
     */
    public Artista(int numIntegrantes, String estiloMusica, double cache, String codigo, String nombre, String dni, Date fechaNacimiento) {
        super(codigo, nombre, dni, fechaNacimiento);
        this.numIntegrantes = numIntegrantes;
        this.estiloMusica = estiloMusica;
        this.cache = cache;
    }

//Getters y setters
/**
     * Establece el número de integrantes de tipo artista.
     * @param getNumIntegrantes número de integrantes de tipo artista.
     */
    public int getNumIntegrantes() {
        return numIntegrantes;
    }

/**
     * Devuelve el número de integrantes de tipo artista.
     * @param setNumIntegrantes devuelve número de integrantes de tipo artista.
     */
    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

/**
     * Establece el estilo de música de cada artista.
     * @param getEstiloMusica estilo de música de cada artista.
     */
    public String getEstiloMusica() {
        return estiloMusica;
    }


/**
     * Devuelve el estilo de música de cada artista.
     * @param setEstiloMusica devuelve estilo de música de cada artista.
     */
    public void setEstiloMusica(String estiloMusica) {
        this.estiloMusica = estiloMusica;
    }

/**
     * Establece el caché o precio de cada artista.
     * @param el caché o precio de cada artista.
     */
    public double getCache() {
        return cache;
    }

/**
     * Devuelve el caché o precio de cada artista.
     * @param setCache devuelve el caché o precio de cada artista.
     */
    public void setCache(double cache) {
        this.cache = cache;
    }

/**
     * Establece el código de cada artista.
     * @param getCodigo nuevo código de cada artista
     */
    public String getCodigo() {
        return codigo;
    }

/**
     * Devuelve el código de cada artista.
     * @param setCodigo devuelve código de cada artista
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

/**
     * Establece el nombre de cada artista.
     * @param getNombre nuevo nmombre de cada artista
     */
    public String getNombre() {
        return nombre;
    }

/**
     * Devuelve el nombre de cada artista.
     * @param setCodigo devuelve nombre de cada asrtista
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
     * Establece el dni de cada artista.
     * @param getDni nuevo Documento Nacional de identidad de cada artista
     */
    public String getDni() {
        return dni;
    }

/**
     * Devuelve el dni de cada artista.
     * @param setDni nuevo Documento Nacional de identidad de cada artista
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

/**
     * Establece la fecha de nacimiento de cada artista.
     * @param getFechaNacimiento fecha de nacimiento de cada artista.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
/**
     * Devuelve la fecha de nacimiento de cada artista.
     * @param setFechaNacimiento fecha de nacimiento de cada artista.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
