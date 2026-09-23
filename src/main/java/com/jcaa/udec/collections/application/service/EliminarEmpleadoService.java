/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service;
import com.jcaa.udec.collections.application.service.ports.in.EliminarEmpleadoUseCase;
import com.jcaa.udec.collections.domain.port.out.EliminarEmpleadoPort;
/**
 *
 * @author USER
 */
public class EliminarEmpleadoService implements EliminarEmpleadoUseCase {

    private final EliminarEmpleadoPort eliminarEmpleadoPort;

    public EliminarEmpleadoService(EliminarEmpleadoPort eliminarEmpleadoPort) {
        this.eliminarEmpleadoPort = eliminarEmpleadoPort;
    }

    @Override
    public boolean eliminar(String dni) {
        return eliminarEmpleadoPort.eliminar(dni);
    }
}
