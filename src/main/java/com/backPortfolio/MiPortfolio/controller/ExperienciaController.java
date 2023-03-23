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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private SExperiencia experienciaService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EExperiencia> listarEPersonas(){
        return experienciaService.listarExperiencias();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EExperiencia findPersona(@PathVariable Long id){
        return experienciaService.findExperiencia(id);  
    }
    
    @PostMapping("/new")
    @ResponseBody
    public void crearPersona(@RequestBody EExperiencia experiencia) {
        experienciaService.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       experienciaService.borrarExperiencia(id);
    }
    
    @PutMapping("editar/{id}")
    public EExperiencia editarExperiencia(@PathVariable Long id,
            @RequestParam("titulo") String nuevoTitulo ,
            @RequestParam("area") String nuevoArea ,
            @RequestParam("desde") String nuevoDesde ,
            @RequestParam("hasta") String nuevoHasta)
            {
                
        EExperiencia experiencia = experienciaService.findExperiencia(id);
        
        experiencia.setTitulo(nuevoTitulo);
        experiencia.setArea(nuevoArea);
        experiencia.setDesde(nuevoDesde);
        experiencia.setHasta(nuevoHasta);
        experienciaService.crearExperiencia(experiencia);
       return experiencia;
    } 

}
