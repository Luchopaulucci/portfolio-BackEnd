package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.EHabilidades;
import com.backPortfolio.MiPortfolio.repository.IHabilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidades {
    
    @Autowired
    private IHabilidades habilidadesRepo;

    public EHabilidades crearHabilidades(EHabilidades habilidad) {
        return habilidadesRepo.save(habilidad);
    }

    public void borrarHabilidades(Long id) {
        habilidadesRepo.deleteById(id);
    }

    public List<EHabilidades> listarHabilidades() {
        return habilidadesRepo.findAll();
    }

    public EHabilidades findHabilidades(Long id) {
        EHabilidades habilidad = habilidadesRepo.findById(id).orElse(null);
        return habilidad;
    }
    
    public void modificarHabilidad(EHabilidades habilidad){
        habilidadesRepo.save(habilidad);
    }

}
