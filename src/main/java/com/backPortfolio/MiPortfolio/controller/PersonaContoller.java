package com.backPortfolio.MiPortfolio.controller;
import com.backPortfolio.MiPortfolio.entity.EPersona;
import com.backPortfolio.MiPortfolio.service.SPersona;
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
@RequestMapping("persona/")
@CrossOrigin(origins = "https://portfolio-frontend-luciano.web.app")
public class PersonaContoller {
    
    @Autowired
    private SPersona personaService;
    
    @GetMapping("ver")
    @ResponseBody
    public List<EPersona> listarEPersonas(){
        return personaService.listarPersonas();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EPersona findPersona(@PathVariable Long id){
        return personaService.findPersona(id);  
    }
    
    @PostMapping("new")
    @ResponseBody
    public void crearPersona(@RequestBody EPersona persona) {
        personaService.crearPersona(persona);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       personaService.borrarPersona (id);
    }
    
    @PutMapping("update/{id}")   
    public void editarPersona(@RequestBody EPersona persona){
        personaService.modificarPersona(persona);
    }
    
    @PostMapping("autenticacion/login")
    @ResponseBody
    public EPersona login(@RequestBody EPersona persona) {
        return personaService.login(persona.getEmail(), persona.getClave());
    }

}
