package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EEducacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
     private String desde;
     
    private String hasta;
    
    private String institucion;
    
    public EEducacion(){
        
    }

    public EEducacion(String titulo, String desde, String hasta, String institucion) {
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
        this.institucion = institucion;
    }

}
