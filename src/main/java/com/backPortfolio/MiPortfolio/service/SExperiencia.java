package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.EExperiencia;
import com.backPortfolio.MiPortfolio.repository.IExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
    
    @Autowired
    private IExperiencia experienciaRepo;

    public EExperiencia crearExperiencia(EExperiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    public List<EExperiencia> listarExperiencias() {
        return experienciaRepo.findAll();
    }

    public EExperiencia findExperiencia(Long id) {
        EExperiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
    public void modificarExperiencia(EExperiencia experiencia){
        experienciaRepo.save(experiencia);
    }

}
