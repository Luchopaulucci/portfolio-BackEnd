
package com.backPortfolio.MiPortfolio.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String area;
    private String desde;
    private String hasta;
    
    public Experiencia(){ 
    }

    public Experiencia(String titulo, String area, String desde, String hasta) {
        this.titulo = titulo;
        this.area = area;
        this.desde = desde;
        this.hasta = hasta;
    }
    
}
