package com.backPortfolio.MiPortfolio.controller;

import com.backPortfolio.MiPortfolio.entity.EEducacion;
import com.backPortfolio.MiPortfolio.service.SEducacion;
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
@RequestMapping("educacion/")
@CrossOrigin(origins = "https://portfolio-frontend-luciano.web.app")
public class EducacionController {
    
    @Autowired
    private SEducacion educacionService;
    
    @GetMapping("ver")
    @ResponseBody
    public List<EEducacion> listarEducacion(){
        return educacionService.listarEducacion();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EEducacion findEducacion(@PathVariable Long id){
        return educacionService.findEducacion(id);  
    }
    
    @PostMapping("new")
    @ResponseBody
    public void crearEducacion(@RequestBody EEducacion educacion) {
        educacionService.crearEducacion(educacion);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarEducacion(@PathVariable Long id) {
       educacionService.borrarEducacion(id);
    }
    
    @PutMapping("update/{id}")   
    public void editarEducacion(@RequestBody EEducacion educacion){
        educacionService.modificarEducacion(educacion);
    }

}
