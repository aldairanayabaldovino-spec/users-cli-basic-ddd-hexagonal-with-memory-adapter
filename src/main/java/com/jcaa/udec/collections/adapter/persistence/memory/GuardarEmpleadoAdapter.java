/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.adapter.persistence.memory;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.GuardarEmpleadoPort;

/**
 *
 * @author USER
 */
public class GuardarEmpleadoAdapter implements GuardarEmpleadoPort {

    private final EmpleadosMemoria empleadosMemoria;

    public GuardarEmpleadoAdapter(EmpleadosMemoria empleadosMemoria) {
        this.empleadosMemoria = empleadosMemoria;
    }

    @Override
    public void guardar(Empleado empleado) {
        empleadosMemoria.guardar(empleado);
    }
}
