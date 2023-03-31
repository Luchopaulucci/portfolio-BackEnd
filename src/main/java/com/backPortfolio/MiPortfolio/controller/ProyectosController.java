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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos/")
@CrossOrigin(origins = "https://portfolio-frontend-luciano.web.app")
public class ProyectosController {
    
    @Autowired
    private SProyectos proyectosService;
    
    @GetMapping("ver")
    @ResponseBody
    public List<EProyectos> listarEProyectos(){
        return proyectosService.listarProtectos();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EProyectos findProyecto(@PathVariable Long id){
        return proyectosService.findProtectos(id);  
    }
    
    @PostMapping("new")
    @ResponseBody
    public void crearProyecto(@RequestBody EProyectos proyectos) {
        proyectosService.crearProyectos(proyectos);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarProyecto (@PathVariable Long id) {
       proyectosService.borrarProtectos(id);
    }
    
    @PutMapping("update/{id}")   
    public void editarProyecto(@RequestBody EProyectos proyectos){
        proyectosService.modificarProtectos(proyectos);
    }

}
