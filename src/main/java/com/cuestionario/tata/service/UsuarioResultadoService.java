package com.cuestionario.tata.service;

import org.springframework.stereotype.Service;

import com.cuestionario.tata.model.UsuarioResultado;
import com.cuestionario.tata.repository.UsuarioResultadoRepository;

@Service
public class UsuarioResultadoService {

    private final UsuarioResultadoRepository repository;

    public UsuarioResultadoService(UsuarioResultadoRepository repository) {
        this.repository = repository;
    }

    public UsuarioResultado guardarResultado(UsuarioResultado usuarioResultado) {
        return repository.save(usuarioResultado);
    }
}