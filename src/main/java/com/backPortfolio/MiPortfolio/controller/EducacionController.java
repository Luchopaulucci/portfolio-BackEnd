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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired
    private SEducacion educacionService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EEducacion> listarEPersonas(){
        return educacionService.listarEducacion();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EEducacion findPersona(@PathVariable Long id){
        return educacionService.findEducacion(id);  
    }
    
    @PostMapping("/new")
    @ResponseBody
    public void crearPersona(@RequestBody EEducacion habilidades) {
        educacionService.crearEducacion(habilidades);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       educacionService.borrarEducacion(id);
    }
    
    @PutMapping("editar/{id}")
    public EEducacion editarEducacion(@PathVariable Long id,
            @RequestParam("titulo") String nuevoTitulo ,
            @RequestParam("institucion") String nuevoInstitucion ,
            @RequestParam("desde") String nuevoDesde ,
            @RequestParam("hasta") String nuevoHasta)
            {
                
        EEducacion educacion = educacionService.findEducacion(id);
        
        educacion.setTitulo(nuevoTitulo);
        educacion.setInstitucion(nuevoInstitucion);
        educacion.setDesde(nuevoDesde);
        educacion.setHasta(nuevoHasta);
         educacionService.crearEducacion(educacion);
       return educacion;
    } 

}
