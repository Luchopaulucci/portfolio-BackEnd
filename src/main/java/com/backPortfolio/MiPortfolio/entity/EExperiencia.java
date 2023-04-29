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
    Long id;
    
    private String titulo;
    
     private String fecha;
     
    private String urlCertificado;
    
    private String urlFotoCertificado;
    
    public EExperiencia(){
        
    }

    public EExperiencia(String titulo, String fecha, String urlCertificado, String urlFotoCertificado) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.urlCertificado = urlCertificado;
        this.urlFotoCertificado = urlFotoCertificado;
    }
    
}
