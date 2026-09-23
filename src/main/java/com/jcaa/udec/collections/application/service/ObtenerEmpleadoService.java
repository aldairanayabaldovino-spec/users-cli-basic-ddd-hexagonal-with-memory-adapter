/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.application.service;
import com.jcaa.udec.collections.application.service.ports.in.ObtenerEmpleadoUseCase;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.ObtenerEmpleadoPort;
import java.util.List;
/**
 *
 * @author USER
 */
public class ObtenerEmpleadoService implements ObtenerEmpleadoUseCase {

    private final ObtenerEmpleadoPort obtenerEmpleadoPort;

    public ObtenerEmpleadoService(ObtenerEmpleadoPort obtenerEmpleadoPort) {
        this.obtenerEmpleadoPort = obtenerEmpleadoPort;
    }

    @Override
    public Empleado obtenerPorDni(String dni) {
        return obtenerEmpleadoPort.obtenerPorDni(dni);
    }

    @Override
    public List<Empleado> listar() {
        return obtenerEmpleadoPort.listar();
    }
}