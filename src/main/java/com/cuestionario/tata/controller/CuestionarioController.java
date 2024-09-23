package com.cuestionario.tata.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuestionario")
public class CuestionarioController {

    @CrossOrigin(origins = "https://cuestionario-zeta.vercel.app")
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ResponseEntity<?> guardarCuestionario(/* Parámetros necesarios */) {
        // Lógica para guardar el cuestionario
        return ResponseEntity.ok().build();
    }

    @CrossOrigin(origins = "https://cuestionario-zeta.vercel.app")
    @RequestMapping(value = "/guardar", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok().build();
    }
}
