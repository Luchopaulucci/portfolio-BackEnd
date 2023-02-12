package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.Persona;
import java.util.List;

public interface SPersona {
    
    public List<Persona> verPersonas();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona(long id);
    
    public Persona buscarPersona(long id);
    
}
