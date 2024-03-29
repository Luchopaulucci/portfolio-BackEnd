package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EHabilidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    private String titulo;
    
    private String urlFotoHabilidad;
     
     public EHabilidades(){
         
     }

    public EHabilidades(String titulo, String urlFotoHabilidad) {
        this.titulo = titulo;
        this.urlFotoHabilidad = urlFotoHabilidad;
    } 
    
}
