/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service.dto.command;

/**
 *
 * @author USER
 */
public record CrearEmpleadoComando(
        String dni,
        String nombres,
        String apellidos,
        String telefono,
        String direccion,
        String cuentaBancaria) {
}
