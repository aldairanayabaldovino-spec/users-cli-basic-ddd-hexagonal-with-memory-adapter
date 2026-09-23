/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.adapter.persistence.memory;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.ActualizarEmpleadoPort;
/**
 *
 * @author USER
 */
public class ActualizarEmpleadoAdapter implements ActualizarEmpleadoPort {

    private final EmpleadosMemoria empleadosMemoria;

    public ActualizarEmpleadoAdapter(EmpleadosMemoria empleadosMemoria) {
        this.empleadosMemoria = empleadosMemoria;
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return empleadosMemoria.actualizar(empleado);
    }
}
