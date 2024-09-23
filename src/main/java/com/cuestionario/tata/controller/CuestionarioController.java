package com.cuestionario.tata.controller;

import org.springframework.web.bind.annotation.*;

import com.cuestionario.tata.model.UsuarioResultado;
import com.cuestionario.tata.service.UsuarioResultadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuestionario")
public class CuestionarioController {

    private final UsuarioResultadoService usuarioResultadoService;

    // Inyección del servicio a través del constructor
    public CuestionarioController(UsuarioResultadoService usuarioResultadoService) {
        this.usuarioResultadoService = usuarioResultadoService;
    }

    @CrossOrigin(origins = "https://cuestionario-zeta.vercel.app")
    @PostMapping("/guardar")
    public ResponseEntity<UsuarioResultado> guardarCuestionario(@RequestBody UsuarioResultado usuarioResultado) {
        UsuarioResultado resultadoGuardado = usuarioResultadoService.guardarResultado(usuarioResultado);
        return ResponseEntity.ok(resultadoGuardado); // Retorna una respuesta en formato ResponseEntity
    }

    @CrossOrigin(origins = "https://cuestionario-zeta.vercel.app")
    @RequestMapping(value = "/guardar", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok().build();
    }
}

