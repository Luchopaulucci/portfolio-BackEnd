package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EExperiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
     private String desde;
     
    private String hasta;
    
    @Size(min=6, max=200, message="fuera de rango")
    private String area;
    
    public EExperiencia(){
        
    }

    public EExperiencia(String titulo, String desde, String hasta, String area) {
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
        this.area = area;
    }
    
}
