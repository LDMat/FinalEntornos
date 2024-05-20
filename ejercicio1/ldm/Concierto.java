/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1.ldm;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author londo
 * Clase que representa a un concierto.
 */
public class Concierto {
    protected String nombre;
    protected Date fecha;
    protected Artista artista;
    protected String estiloMusica;
    protected ArrayList<Asistente> asistentes;

//Constructor
/**
     * Constructor para la clase Concierto
     * @param nombre Nombre del concierto.
     * @param fecha Fecha en la que se celebra el concierto.
     * @param artista Artistas que participarán en el concierto.
     * @param estiloMusica Tipo de estilo de múscia del concierto.
     * @param asistentes Asistentes que participarán en el concierto.
     */
    public Concierto(String nombre, Date fecha, Artista artista, String estiloMusica) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.artista = artista;
        this.estiloMusica = estiloMusica;
        this.asistentes = new ArrayList<>();
    }

    public Concierto(String nombre, Date fecha, Artista artista, String estiloMusica, ArrayList<Asistente> asistentes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.artista = artista;
        this.estiloMusica = estiloMusica;
        this.asistentes = asistentes;
    }

//Getters y setters
/**
     * Establece el nombre del concierto.
     * @param getNombre nuevo nombre del concierto.
     */
    public String getNombre() {
        return nombre;
    }

/**
     * Devuelve el nombre del concierto.
     * @param setNombre devuelve el nombre del concierto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
     * Establece la fecha en la que se celebra el concierto.
     * @param getFecha nueva fecha en la que se celebra el concierto.
     */
    public Date getFecha() {
        return fecha;
    }

/**
     * Devuelve la fecha en la que se celebra el concierto.
     * @param setFecha devuelve fecha en la que se celebra el concierto.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

/**
     * Establece los artistas que participarán en el concierto.
     * @param getArtista nueva lista de artistas que participarán en el concierto.
     */
    public Artista getArtista() {
        return artista;
    }

/**
     * Devuelve los artistas que participarán en el concierto.
     * @param setArtista devuelve lista de artistas que participarán en el concierto.
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

/**
     * Establece el tipo de estilo de música del concierto.
     * @param getEstiloMusica nuevo tipo de estilo de música del concierto.
     */
    public String getEstiloMusica() {
        return estiloMusica;
    }

/**
     * Devuelve el tipo de estilo de música del concierto.
     * @param setEstiloMusica devuelve tipo de estilo de música del concierto.
     */
    public void setEstiloMusica(String estiloMusica) {
        this.estiloMusica = estiloMusica;
    }

/**
     * Establece la lista de los asistentes al concierto.
     * @param getAsistentes nueva lista de los asistentes al concierto.
     */
    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

/**
     * Devuelve la lista de los asistentes al concierto.
     * @param setAsistentes devuelve la lista de los asistentes al concierto.
     */
    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    

}
