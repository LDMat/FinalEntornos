/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1.ldm;

/**
 *
 * @author londo
 * Clase que representa la funcionalidad de la clase GestionConciertos
 */

import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public class Main {
        public static void main(String[] args) {
        // Crear objeto de GestionConciertos
        GestionConciertos gestionConciertos = new GestionConciertos();

        // Dar de alta 3 artistas y 3 asistentes
        gestionConciertos.darAltaArtista(new Artista("AR001", "Grupo A", "12345678A", new Date(), 5, "Rock", 1000));
        gestionConciertos.darAltaArtista(new Artista("AR002", "Grupo B", "87654321B", new Date(), 4, "Pop", 1500));
        gestionConciertos.darAltaArtista(new Artista("AR003", "Grupo C", "98765432C", new Date(), 3, "Rock", 1200));
        gestionConciertos.darAltaAsistente(new Asistente("AS001", "Asistente 1", "11111111A", new Date()));
        gestionConciertos.darAltaAsistente(new Asistente("AS002", "Asistente 2", "22222222B", new Date()));
        gestionConciertos.darAltaAsistente(new Asistente("AS003", "Asistente 3", "33333333C", new Date()));

        // Listar solo los artistas
        System.out.println("Lista de artistas:");
        for (Artista artista : gestionConciertos.listarArtistas()) {
            System.out.println(artista.nombre);
        }

        // Listar solo los asistentes
        System.out.println("\nLista de asistentes:");
        for (Asistente asistente : gestionConciertos.listarAsistentes()) {
            System.out.println(asistente.nombre);
        }

        // Intentar dar de alta 4 conciertos
        gestionConciertos.darAltaConcierto("Concierto 1", new Date(), "AR001", "Rock");
        gestionConciertos.darAltaConcierto("Concierto 2", new Date(), "AR002", "Pop");
        gestionConciertos.darAltaConcierto("Concierto 3", new Date(), "AR003", "Rock");
        gestionConciertos.darAltaConcierto("Concierto 4", new Date(), "AR002", "Rock");

        // Asignar asistentes a los conciertos
        gestionConciertos.addAsistenteAConcierto("Concierto 1", "AS001");
        gestionConciertos.addAsistenteAConcierto("Concierto 1", "AS002");
        gestionConciertos.addAsistenteAConcierto("Concierto 2", "AS002");
        gestionConciertos.addAsistenteAConcierto("Concierto 3", "AS001");

        // Listar los conciertos de un estilo concreto de música
        System.out.println("\nConciertos de estilo Rock:");
        for (Concierto concierto : gestionConciertos.listarConciertosPorEstilo("Rock")) {
            System.out.println(concierto.nombre);
        }

        // Listar los conciertos de un artista concreto
        System.out.println("\nConciertos del artista Grupo B:");
        for (Concierto concierto : gestionConciertos.listarConciertosPorArtista("AR002")) {
            System.out.println(concierto.nombre);
        }

        // Mostrar la cantidad de conciertos a los que ha asistido un asistente
        System.out.println("\nCantidad de conciertos a los que ha asistido Asistente 2:");
        System.out.println(gestionConciertos.cantidadConciertosAsistidos("AS002"));

        // Guardar los datos en un fichero
        gestionConciertos.guardarDatosEnFichero("datos_festival.dat");

        // Cargar los datos desde un fichero
        GestionConciertos gestionConciertos2 = new GestionConciertos();
        gestionConciertos2.cargarDatosDesdeFichero("datos_festival.dat");

        // Verificar que los datos se hayan cargado correctamente
        System.out.println("\nConciertos cargados desde el fichero:");
        for (Concierto concierto : gestionConciertos2.listarConciertos()) {
            System.out.println(concierto.nombre);
        }
    }
}
