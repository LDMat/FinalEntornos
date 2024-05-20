/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1.ldm;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Date;


/**
 *
 * @author londo
 * Clase que representa la gestión de un concierto.
 */
public class GestionConciertos {
    private ArrayList<Concierto> conciertos;
    private ArrayList<Participante> participantes;

//Constructor
/**
     * Constructor para la clase GestionConcierto
     * @param conciertos Datos relativos a cada concierto.
     * @param participantes Datos relativos a cada participante de tipo asistente o artista en el concierto.
     */
    public GestionConciertos(ArrayList<Concierto> conciertos, ArrayList<Participante> participantes) {
        this.conciertos = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

//Getters y setters
/**
     * Establece la lista de los conciertos.
     * @param getConciertos nueva lista de los conciertos.
     */
    public ArrayList<Concierto> getConciertos() {
        return conciertos;
    }
/**
     * Devuelve la lista de los conciertos.
     * @param setConciertos devuelve la lista de los conciertos.
     */
    public void setConciertos(ArrayList<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

/**
     * Establece la lista de los participantes en el concierto.
     * @param getParticipantes nueva lista de los participantes en el concierto.
     */
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
/**
     * Devuelve la lista de los participantes en el concierto.
     * @param setParticipantes devuelve lista de los participantes en el concierto.
     */
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

//Métodos       
/**
     * Da de alta un artista
     * @param darAltaArtistas Da de alta un artista.
     */  
    public void darAltaArtista(Artista artista) {
        participantes.add(artista);
        Collections.sort(participantes, (p1, p2) -> p1.codigo.compareTo(p2.codigo));
    }
/**
     * Da de alta un asistente
     * @param darAltaAsistente Da de alta un asistente.
     */
    public void darAltaAsistente(Asistente asistente) {
        participantes.add(asistente);
        Collections.sort(participantes, (p1, p2) -> p1.codigo.compareTo(p2.codigo));
    }
/**
     * Da de alta un concierto
     * @param darAltaConcierto Da de alta un concierto.
     */
    public void darAltaConcierto(String nombre, Date fecha, String codigoArtista, String estiloMusica) {
        Artista artista = null;
        for (Participante participante : participantes) {
            if (participante instanceof Artista && participante.codigo.equals(codigoArtista)) {
                artista = (Artista) participante;
                break;
            }
        }
        if (artista != null && artista.estiloMusica.equals(estiloMusica)) {
            conciertos.add(new Concierto(nombre, fecha, artista, estiloMusica));
            Collections.sort(conciertos, (c1, c2) -> c1.fecha.compareTo(c2.fecha));
        }
    }
/**
     * Crea una lista de solo asistentes
     * @param listarAsistentes Crea una lista de solo asistentes.
     */
    public ArrayList<Asistente> listarAsistentes() {
        ArrayList<Asistente> asistentes = new ArrayList<>();
        for (Participante participante : participantes) {
            if (participante instanceof Asistente) {
                asistentes.add((Asistente) participante);
            }
        }
        return asistentes;
    }
/**
     * Crea una lista de solo artistas
     * @param listarArtistas Crea una lista de solo artistas.
     */
    public ArrayList<Artista> listarArtistas() {
        ArrayList<Artista> artistas = new ArrayList<>();
        for (Participante participante : participantes) {
            if (participante instanceof Artista) {
                artistas.add((Artista) participante);
            }
        }
        return artistas;
    }
/**
     * Crea una lista de solo conciertos
     * @param listarConciertos Crea una lista de solo conciertos.
     */
    public ArrayList<Concierto> listarConciertos() {
        return conciertos;
    }
/**
     * Crea una lista de conciertos según el estilo de música utilizado.
     * @param listarConciertosPorEstilo Crea una lista de conciertos según el estilo de música utilizado
     */
    public ArrayList<Concierto> listarConciertosPorEstilo(String estilo) {
        ArrayList<Concierto> conciertosPorEstilo = new ArrayList<>();
        for (Concierto concierto : conciertos) {
            if (concierto.estiloMusica.equals(estilo)) {
                conciertosPorEstilo.add(concierto);
            }
        }
        return conciertosPorEstilo;
    }
/**
     * Crea una lista de conciertos según el artista.
     * @param listarConciertosPorArtista Crea una lista de conciertos según el artista que participa
     */
    public ArrayList<Concierto> listarConciertosPorArtista(String codigoArtista) {
        ArrayList<Concierto> conciertosPorArtista = new ArrayList<>();
        for (Concierto concierto : conciertos) {
            if (concierto.artista.codigo.equals(codigoArtista)) {
                conciertosPorArtista.add(concierto);
            }
        }
        return conciertosPorArtista;
    }
/**
     * Da de alta un asistente a un concierto.
     * @param addAsistenteAConcierto Da de alta un asistente a un concierto.
     */
    public void addAsistenteAConcierto(String nombreConcierto, String codigoAsistente) {
        Asistente asistente = null;
        for (Participante participante : participantes) {
            if (participante instanceof Asistente && participante.codigo.equals(codigoAsistente)) {
                asistente = (Asistente) participante;
                break;
            }
        }
        if (asistente != null) {
            for (Concierto concierto : conciertos) {
                if (concierto.nombre.equals(nombreConcierto)) {
                    concierto.asistentes.add(asistente);
                    break;
                }
            }
        }
    }
/**
     * Devuelve la cantidad de conciertos a los que ha asistido un asistente.
     * @param cantidadConciertosAsistidos Devuelve la cantidad de conciertos a los que ha asistido un asistente.
     */
    public int cantidadConciertosAsistidos(String codigoAsistente) {
        int cantidad = 0;
        for (Concierto concierto : conciertos) {
            for (Asistente asistente : concierto.asistentes) {
                if (asistente.codigo.equals(codigoAsistente)) {
                    cantidad++;
                    break;
                }
            }
        }
        return cantidad;
    }
/**
     * Guarda los datos en un fichero
     * @param guardarDatosEnFichero Guarda los datos en un fichero.
     */
    public void guardarDatosEnFichero(String nombreFichero) {
        try {
            FileOutputStream fos = new FileOutputStream(nombreFichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(conciertos);
            oos.writeObject(participantes);
            oos.close();
            fos.close();
            System.out.println("Datos guardados en el fichero: " + nombreFichero);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
     * Carga los datos desde un fichero
     * @param cargarDatosEnFichero Carga los datos desde un fichero.
     */
    public void cargarDatosDesdeFichero(String nombreFichero) {
        try {
            FileInputStream fis = new FileInputStream(nombreFichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            conciertos = (ArrayList<Concierto>) ois.readObject();
            participantes = (ArrayList<Participante>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Datos cargados desde el fichero: " + nombreFichero);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
