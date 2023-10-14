package com.backend.clase.dto;

public class Cancion {
    private String nombre;
    private String artista;
    private String genero;

    public Cancion(String nombre) {
        this.nombre = nombre;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void almacenar(){
        System.out.println("Almacenamos la canción con el nombre de: "+nombre);
    }
}
