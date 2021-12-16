package com.programacion.servicios;

import org.springframework.stereotype.Component;

//@Component
public class ServicioLogImpl implements ServicioLog{
    public void log(String msg) {
        System.out.println("Log: "+msg);
    }
}
