package com.cuestionario.tata.controller;

import org.springframework.web.bind.annotation.*;

import com.cuestionario.tata.model.UsuarioResultado;
import com.cuestionario.tata.service.UsuarioResultadoService;

@RestController
@RequestMapping("/api/cuestionario")
@CrossOrigin(origins = "http://localhost:3000")
public class CuestionarioController {

    private final UsuarioResultadoService usuarioResultadoService;

    public CuestionarioController(UsuarioResultadoService usuarioResultadoService) {
        this.usuarioResultadoService = usuarioResultadoService;
    }

    @PostMapping("/guardar")
    public UsuarioResultado guardarResultado(@RequestBody UsuarioResultado usuarioResultado) {
        return usuarioResultadoService.guardarResultado(usuarioResultado);
    }
}
