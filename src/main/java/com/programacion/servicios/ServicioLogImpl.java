package com.programacion.servicios;

public class ServicioLogImpl implements ServicioLog{
    public void log(String msg) {
        System.out.println("Log: "+msg);
    }
}
