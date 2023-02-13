package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String informacion;
    private String desde;
    private String hasta;
    
    public Proyectos(){
    }

    public Proyectos(String titulo, String informacion, String desde, String hasta) {
        this.titulo = titulo;
        this.informacion = informacion;
        this.desde = desde;
        this.hasta = hasta;
    }
    
    
}
