package com.programacion.servicios;

import org.springframework.beans.factory.annotation.Autowired;

public class OperacionesImpl implements Operaciones{

    @Autowired
    private ServicioLog servicio;

    public OperacionesImpl(){
        System.out.println("Estoy en el constructor");
    }

    @Override
    public int sumar(int x, int y) {
        servicio.log("Inicializando suma");
        return x+y;
    }
}
