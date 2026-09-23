/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service.mapper;
import com.jcaa.udec.collections.application.service.dto.command.CrearEmpleadoComando;
import com.jcaa.udec.collections.domain.core.model.Empleado;
/**
 *
 * @author USER
 */
public class CrearEmpleadoMapper {

    public static Empleado toDomain(CrearEmpleadoComando comando) {
        return Empleado.builder()
                .dni(comando.dni())
                .nombres(comando.nombres())
                .apellidos(comando.apellidos())
                .telefono(comando.telefono())
                .direccion(comando.direccion())
                .cuentaBancaria(comando.cuentaBancaria())
                .build();
    }
}
