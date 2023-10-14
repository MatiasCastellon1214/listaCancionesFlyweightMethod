package com.backend.clase.factory;

import com.backend.clase.dto.Cancion;

import java.util.HashMap;

public class CancionFactory {
    private static final HashMap<String, Cancion> CANCION_MAP = new HashMap<>();

    public static Cancion almacenarCancion(String nombre){
        Cancion cancion = CANCION_MAP.get(nombre);
        if(cancion == null){
            cancion = new Cancion(nombre);
            CANCION_MAP.put(nombre, cancion);
            System.out.println("Se crea una canción con el nombre: "+nombre);
        }
        return cancion;
    }
}
