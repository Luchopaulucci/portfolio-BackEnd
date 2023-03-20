package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.EPersona;
import com.backPortfolio.MiPortfolio.repository.IPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona {

    @Autowired
    private IPersona personaRepo;

    public EPersona crearPersona(EPersona persona) {
        return personaRepo.save(persona);
    }

    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    public List<EPersona> listarPersonas() {
        return personaRepo.findAll();
    }

    public EPersona findSobremi(Long id) {
        EPersona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
    
    public void modificarPersona(EPersona persona){
        personaRepo.save(persona);
    }

    public EPersona login(String email, String clave){
        List<EPersona> lisEPersona = personaRepo.findByEmailAndClave(email, clave);
        if (!lisEPersona.isEmpty()) {
            return lisEPersona.get(0);
        }
        return null;
    }
    
    
    }
