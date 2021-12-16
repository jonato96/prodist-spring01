package com.programacion.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperacionesImpl implements Operaciones{

    @Autowired
    private ServicioLog servicio;

    public OperacionesImpl(){
        System.out.println("Estoy en el constructor");
    }

    @Override
    public int sumar(int x, int y) {
        servicio.log("Inicializando suma con configuracion de clases, anotaciones y productor");
        return x+y;
    }
}
