package com.backPortfolio.MiPortfolio.service;

import com.backPortfolio.MiPortfolio.entity.Persona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backPortfolio.MiPortfolio.repository.RPersona;
import java.util.List;


@Service
@Transactional
public class SPersona {
    
    @Autowired
    RPersona rPersona;
    
    public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public List<Persona> verPerona() {
        List<Persona> listPeople= rPersona.findAll();
        return listPeople;
    }
    public Persona buscarPersona(long id) {
        Persona per = rPersona.findById(id).orElse(null);
        return per;
    }
    public void crearPersona(Persona per) {
        rPersona.save(per);
    }
    public void editarPersona(Persona per) {
        rPersona.save(per);
    }
    public void eliminarPersona(long id) {
        rPersona.deleteById(id);
    }

    public void actualizarPersonaById(long id, Persona per){
        rPersona.save(per);
    }
    

}
