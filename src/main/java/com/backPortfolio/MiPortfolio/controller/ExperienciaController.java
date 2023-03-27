package com.backPortfolio.MiPortfolio.controller;
import com.backPortfolio.MiPortfolio.entity.EExperiencia;
import com.backPortfolio.MiPortfolio.service.SExperiencia;
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
@RequestMapping("experiencia/")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private SExperiencia experienciaService;
    
    @GetMapping("ver")
    @ResponseBody
    public List<EExperiencia> listarExperiencia(){
        return experienciaService.listarExperiencias();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EExperiencia findExperiencia(@PathVariable Long id){
        return experienciaService.findExperiencia(id);  
    }
    
    @PostMapping("new")
    @ResponseBody
    public void crearExperiencia(@RequestBody EExperiencia experiencia) {
        experienciaService.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
       experienciaService.borrarExperiencia(id);
    }
    
    @PutMapping("update/{id}")   
    public void editarExperiencia(@RequestBody EExperiencia experiencia){
        experienciaService.modificarExperiencia(experiencia);
    }

}
