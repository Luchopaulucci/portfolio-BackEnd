
package com.backPortfolio.MiPortfolio.controller;

import com.backPortfolio.MiPortfolio.entity.Persona;
import com.backPortfolio.MiPortfolio.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPersona {
    
    @Autowired
    private SPersona personaServicio;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona per){
        personaServicio.crearPersona(per);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaServicio. verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable long id){
        personaServicio.borrarPersona(id);
    }
    

    

}
