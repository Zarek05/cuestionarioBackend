package com.cuestionario.tata.model;

import jakarta.persistence.*;

@Entity
public class UsuarioResultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double porcentaje;
    private String tipoCuestionario;

    public UsuarioResultado() {}

    public UsuarioResultado(String nombre, double porcentaje, String tipoCuestionario) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipoCuestionario = tipoCuestionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipoCuestionario() {
        return tipoCuestionario;
    }

    public void setTipoCuestionario(String tipoCuestionario) {
        this.tipoCuestionario = tipoCuestionario;
    }

    
}
