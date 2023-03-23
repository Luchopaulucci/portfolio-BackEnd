package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.EEducacion;
import com.backPortfolio.MiPortfolio.repository.IEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEducacion {
    
     @Autowired
    private IEducacion educacionRepo;

    public EEducacion crearEducacion(EEducacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    public List<EEducacion> listarEducacion() {
        return educacionRepo.findAll();
    }

    public EEducacion findEducacion(Long id) {
        EEducacion educacion = educacionRepo.findById(id).orElse(null);
        return educacion;
    }
    
    public void modificarEducacion(EEducacion educacion){
        educacionRepo.save(educacion);
    }

}
