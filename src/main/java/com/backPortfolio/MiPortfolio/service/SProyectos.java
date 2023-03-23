package com.backPortfolio.MiPortfolio.service;
import com.backPortfolio.MiPortfolio.entity.EProyectos;
import com.backPortfolio.MiPortfolio.repository.IProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyectos {
    
    @Autowired
    private IProyectos proyectosRepo;

    public EProyectos crearProyectos(EProyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void borrarProtectos(Long id) {
        proyectosRepo.deleteById(id);
    }

    public List<EProyectos> listarProtectos() {
        return proyectosRepo.findAll();
    }

    public EProyectos findProtectos(Long id) {
        EProyectos proyectos = proyectosRepo.findById(id).orElse(null);
        return proyectos;
    }
    
    public void modificarProtectos(EProyectos proyectos){
        proyectosRepo.save(proyectos);
    }

}
