package com.uma.GrupoL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Gap43Controller {

    @GetMapping("/gap43")
    public String mostrarInformacion() {
        return "Sistema GAP-43 funcionando correctamente";
    }
}