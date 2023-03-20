package com.backPortfolio.MiPortfolio.controller;

import com.backPortfolio.MiPortfolio.entity.EPersona;
import com.backPortfolio.MiPortfolio.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaContoller {
    
    @Autowired
    private SPersona personaService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EPersona> listarEPersonas(){
        return personaService.listarPersonas();
    }
    
    @PostMapping("/new")
    public void crearPersona(@RequestBody EPersona persona) {
        personaService.crearPersona(persona);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       personaService.borrarPersona (id);
    }
    
    @PutMapping("editar/")
    public void modificarPersona(@RequestBody EPersona persona){
        personaService.modificarPersona(persona);
    }
    
    @PostMapping("autenticacion/login")
    public EPersona login(@RequestBody EPersona persona) {
        return personaService.login(persona.getEmail(), persona.getClave());
    }

    
}
