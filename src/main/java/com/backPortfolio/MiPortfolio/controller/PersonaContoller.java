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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaContoller {
    
    @Autowired
    private SPersona personaService;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EPersona> listarEPersonas(){
        return personaService.listarPersonas();
    }
    
     @GetMapping("find/{id}")
    @ResponseBody 
    public EPersona findPersona(@PathVariable Long id){
        return personaService.findPersona(id);  
    }
    
    @PostMapping("/new")
    @ResponseBody
    public void crearPersona(@RequestBody EPersona persona) {
        personaService.crearPersona(persona);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       personaService.borrarPersona (id);
    }
    
    @PutMapping("editar/{id}")
    public EPersona editarPersona(@PathVariable Long id,
            @RequestParam("nombreCompleto") String nuevoNombreCompleto ,
            @RequestParam("urlFoto") String nuevoUrlFoto ,
            @RequestParam("informacion") String nuevoInformacion ,
            @RequestParam("clave") String nuevoClave,
            @RequestParam("email") String nuevoEmail)
            {
                
        EPersona persona = personaService.findPersona(id);
        
        persona.setNombreCompleto(nuevoNombreCompleto);
        persona.setUrlFoto(nuevoUrlFoto);
        persona.setInformacion(nuevoInformacion);
        persona.setClave(nuevoClave);
        persona.setEmail(nuevoEmail);
         personaService.crearPersona(persona);
       return persona;
    } 
    
    @PostMapping("autenticacion/login")
    @ResponseBody
    public EPersona login(@RequestBody EPersona persona) {
        return personaService.login(persona.getEmail(), persona.getClave());
    }

    
}
