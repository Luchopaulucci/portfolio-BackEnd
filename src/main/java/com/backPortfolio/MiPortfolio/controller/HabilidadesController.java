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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadesController {
    
    @Autowired
    private SHabilidades habilidadesService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EHabilidades> listarEPersonas(){
        return habilidadesService.listarHabilidades();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EHabilidades findPersona(@PathVariable Long id){
        return habilidadesService.findHabilidades(id);  
    }
    
    @PostMapping("/new")
    @ResponseBody
    public void crearPersona(@RequestBody EHabilidades habilidades) {
        habilidadesService.crearHabilidades(habilidades);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       habilidadesService.borrarHabilidades(id);
    }
    
    @PutMapping("update/{id}")   
    public void editarPersona(@RequestBody EHabilidades habilidades){
        habilidadesService.modificarHabilidades(habilidades);
    }
    
//    @PutMapping("editar/{id}")
//    public EHabilidades editarExperiencia(@PathVariable Long id,
//            @RequestParam("titulo") String nuevoTitulo ,
//            @RequestParam("porcentaje") int nuevoPorcentaje )
//            {
//                
//        EHabilidades habilidades = habilidadesService.findHabilidades(id);
//        
//        habilidades.setTitulo(nuevoTitulo);
//        habilidades.setPorcentaje(nuevoPorcentaje);
//        habilidadesService.crearHabilidades(habilidades);
//       return habilidades;
//    } 

}
