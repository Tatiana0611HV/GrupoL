package com.uma.GrupoL;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CascoController {

    @GetMapping("/casco")
    public Map<String, Object> getCasco() {
        return Map.of(
            "id", 1,
            "modelo", "Casco Pro X",
            "material", "Policarbonato",
            "talla", "M",
            "certificadoCE", true
        );
    }
}