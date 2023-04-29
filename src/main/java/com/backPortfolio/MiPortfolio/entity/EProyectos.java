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
    Long id;
    
    private String titulo;
    
     private String fecha;
     
     private String urlFotoProyecto;
     
     private String urlProyecto;
     
    @Size(min=6, max=200, message="fuera de rango")
    private String informacion;
    
    public EProyectos(){
    }

    public EProyectos(String titulo, String fecha, String urlFotoProyecto, String urlProyecto, String informacion) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.urlFotoProyecto = urlFotoProyecto;
        this.urlProyecto = urlProyecto;
        this.informacion = informacion;
    }

}
