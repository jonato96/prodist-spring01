package com.programacion;

import com.programacion.config.Config;
import com.programacion.servicios.Operaciones;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args) {

        //Crear el contenedor, archivo de configuracion
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Realizamos una variacion, usando anotaciones, sin configuracion XML
        //No se recomieda usar configuracion xml sino configuracion con anotaciones
        //Creamos el nuevo contenedor configurado con clases
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //Buscamos un componente
        Operaciones servicio = context.getBean(Operaciones.class);
        System.out.println(servicio.getClass());//Obtenemos el tipo de la clase

        //Obtenemos el metodo
        System.out.println("El resultado de la suma es: "+servicio.sumar(2,2));
    }
}
