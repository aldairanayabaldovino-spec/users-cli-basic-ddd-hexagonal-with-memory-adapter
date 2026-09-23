/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service;
import com.jcaa.udec.collections.application.service.dto.command.CrearEmpleadoComando;
import com.jcaa.udec.collections.application.service.mapper.CrearEmpleadoMapper;
import com.jcaa.udec.collections.application.service.ports.in.CrearEmpleadoUseCase;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.GuardarEmpleadoPort;
/**
 *
 * @author USER
 */
public class CrearEmpleadoService implements CrearEmpleadoUseCase {

    private final GuardarEmpleadoPort guardarEmpleadoPort;

    public CrearEmpleadoService(GuardarEmpleadoPort guardarEmpleadoPort) {
        this.guardarEmpleadoPort = guardarEmpleadoPort;
    }

    @Override
    public Empleado ejecutar(CrearEmpleadoComando comando) {
        Empleado empleado = CrearEmpleadoMapper.toDomain(comando);
        guardarEmpleadoPort.guardar(empleado);
        return empleado;
    }
}
