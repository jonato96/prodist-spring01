package com.programacion.servicios;

public class OperacionesImpl implements Operaciones{

    public OperacionesImpl(){
        System.out.println("Estoy en el constructor");
    }

    @Override
    public int sumar(int x, int y) {
        return x+y;
    }
}
