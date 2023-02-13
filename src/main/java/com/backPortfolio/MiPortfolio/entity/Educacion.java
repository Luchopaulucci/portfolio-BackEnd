package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institucion;
    private String desde;
    private String hasta;
    
    public Educacion(){
    }

    public Educacion(String institucion, String desde, String hasta) {
        this.institucion = institucion;
        this.desde = desde;
        this.hasta = hasta;
    }
    
    

}
