package com.uma.GrupoL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {

    @GetMapping("/paciente")
    public String mostrarPaciente() {
        return "Informacion del paciente registrada correctamente";
    }
}