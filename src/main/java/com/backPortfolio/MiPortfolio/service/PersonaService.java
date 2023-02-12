
package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.Persona;
import com.backPortfolio.MiPortfolio.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements SPersona{
    
    @Autowired
    public RPersona persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
        return persoRepo.findById(id).orElse(null);
    }

}
