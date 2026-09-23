/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.domain.core.model;
import lombok.Builder;
/**
 *
 * @author USER
 */
public class Empleado {
    
    private final String dni;
    private final String nombres;
    private final String apellidos;
    private final String telefono;
    private final String direccion;
    private final String cuentaBancaria;

    @Builder
    public Empleado(
            String dni,
            String nombres,
            String apellidos,
            String telefono,
            String direccion,
            String cuentaBancaria) {

        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
}
