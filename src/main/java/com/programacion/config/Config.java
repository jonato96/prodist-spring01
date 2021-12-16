package com.programacion.config;

import com.programacion.servicios.ServicioLog;
import com.programacion.servicios.ServicioLogImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.SocketUtils;

@Configuration
@ComponentScan(basePackages = "com.programacion")
public class Config {

    @Bean
    public ServicioLog createLog(){
        System.out.println("Productor");
        return new ServicioLogImpl();
    }

}
