package com.adso.proyectitodef.controlador;

import com.adso.proyectitodef.modelo.Personajes;
import com.adso.proyectitodef.repositorio.PersonajesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controlador {
    @Autowired
    private PersonajesRepositorio personajesRepositorio;
        @GetMapping("/")
        public String index (){
            return "index";
        }
        @GetMapping("/personajes")
        public String personajes(Model model){
            model.addAttribute("personajes",personajesRepositorio.findAll());
            return "personajes";
        }
        @GetMapping("/agregarPersonajes")
        public String agregarPersonajes(){
            return "agregarPersonajes";
        }
        @PostMapping("/guardar")
        public String guardar(@Validated Personajes solicitudes, Model solicitud){
            personajesRepositorio.save(solicitudes);
            return "redirect:/personajes";
        }


}

