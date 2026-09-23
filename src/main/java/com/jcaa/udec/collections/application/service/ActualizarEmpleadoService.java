/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service;
import com.jcaa.udec.collections.application.service.ports.in.ActualizarEmpleadoUseCase;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.ActualizarEmpleadoPort;
/**
 *
 * @author USER
 */
public class ActualizarEmpleadoService implements ActualizarEmpleadoUseCase {

    private final ActualizarEmpleadoPort actualizarEmpleadoPort;

    public ActualizarEmpleadoService(ActualizarEmpleadoPort actualizarEmpleadoPort) {
        this.actualizarEmpleadoPort = actualizarEmpleadoPort;
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return actualizarEmpleadoPort.actualizar(empleado);
    }
}