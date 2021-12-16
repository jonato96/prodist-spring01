package com.programacion;

import com.programacion.servicios.Operaciones;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args) {

        //Crear el contenedor, archivo de configuracion
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Buscamos un componente
        Operaciones servicio = context.getBean(Operaciones.class);
        System.out.println(servicio.getClass());//Obtenemos el tipo de la clase

        //Obtenemos el metodo
        System.out.println("El resultado de la suma es: "+servicio.sumar(2,2));
    }
}
