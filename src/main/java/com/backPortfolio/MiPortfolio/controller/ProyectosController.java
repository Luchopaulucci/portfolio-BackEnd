package com.backPortfolio.MiPortfolio.controller;

import com.backPortfolio.MiPortfolio.entity.EProyectos;
import com.backPortfolio.MiPortfolio.service.SProyectos;
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
@RequestMapping("/proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    
    @Autowired
    private SProyectos proyectosService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EProyectos> listarEProyectos(){
        return proyectosService.listarProtectos();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EProyectos findPersona(@PathVariable Long id){
        return proyectosService.findProtectos(id);  
    }
    
    @PostMapping("/new")
    @ResponseBody
    public void crearPersona(@RequestBody EProyectos proyectos) {
        proyectosService.crearProyectos(proyectos);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       proyectosService.borrarProtectos(id);
    }
    
    @PutMapping("editar/{id}")
    public EProyectos editarProyectos(@PathVariable Long id,
            @RequestParam("titulo") String nuevoTitulo ,
            @RequestParam("informacion") String nuevoInformacion ,
            @RequestParam("desde") String nuevoDesde ,
            @RequestParam("hasta") String nuevoHasta)
            {
                
        EProyectos proyectos = proyectosService.findProtectos(id);
        
        proyectos.setTitulo(nuevoTitulo);
        proyectos.setInformacion(nuevoInformacion);
        proyectos.setDesde(nuevoDesde);
        proyectos.setHasta(nuevoHasta);
        proyectosService.crearProyectos(proyectos);
       return proyectos;
    } 

}
