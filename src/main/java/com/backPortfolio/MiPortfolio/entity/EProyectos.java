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
public class EProyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
     private String desde;
     
    private String hasta;
    
    @Size(min=6, max=200, message="fuera de rango")
    private String informacion;
    
    public EProyectos(){
        
    }

    public EProyectos(String titulo, String desde, String hasta, String informacion) {
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
        this.informacion = informacion;
    }
    
}
