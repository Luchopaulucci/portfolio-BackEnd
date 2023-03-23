package com.backPortfolio.MiPortfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class EPersona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreCompleto;
    
    @Lob
    @Column(name = "urlFoto", length = 600)
    private String urlFoto;
    
    @Lob
    @Column(name = "informacion", length = 600)
    private String informacion;
    
    @Lob
    private String email;
    
    @Size(min=6, max=20, message="fuera de rango")
    private String clave;
    
    public EPersona(){
        
    }

    public EPersona(String nombreCompleto, String urlFoto, String informacion, String email, String clave) {
        this.nombreCompleto = nombreCompleto;
        this.urlFoto = urlFoto;
        this.informacion = informacion;
        this.email = email;
        this.clave = clave;
    }
    
}
