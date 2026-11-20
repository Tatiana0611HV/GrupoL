package com.uma.GrupoL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformeController {

    @GetMapping("/informe")
    public String consultarInforme() {
        return "Informe clinico GAP-43 disponible";
    }
}