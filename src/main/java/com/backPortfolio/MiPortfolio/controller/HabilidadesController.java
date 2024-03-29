package com.backPortfolio.MiPortfolio.controller;

import com.backPortfolio.MiPortfolio.entity.EHabilidades;
import com.backPortfolio.MiPortfolio.service.SHabilidades;
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
@RequestMapping("habilidades/")
@CrossOrigin(origins = "https://portfolio-frontend-luciano.web.app")
public class HabilidadesController {
    
    @Autowired
    private SHabilidades habilidadesService;
    
    @GetMapping("ver")
    @ResponseBody
    public List<EHabilidades> listarHabilidades(){
        return habilidadesService.listarHabilidades();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EHabilidades findHabilidades(@PathVariable Long id){
        return habilidadesService.findHabilidades(id);  
    }
    
    @PostMapping("new")
    @ResponseBody
    public void crearHabilidad(@RequestBody EHabilidades habilidades) {
        habilidadesService.crearHabilidades(habilidades);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarHabilidad (@PathVariable Long id) {
       habilidadesService.borrarHabilidades(id);
    }
    
    @PutMapping("update/{id}")   
    public void editarPersona(@RequestBody EHabilidades habilidad){
        habilidadesService.modificarHabilidad(habilidad);
    }

}
