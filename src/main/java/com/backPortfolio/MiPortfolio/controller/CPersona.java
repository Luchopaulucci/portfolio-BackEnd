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
    SPersona persoServ;

    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.list();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        persoServ.eliminarPersona(id);
    }
}
