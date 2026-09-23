/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.adapter.persistence.memory;
import com.jcaa.udec.collections.domain.port.out.EliminarEmpleadoPort;
/**
 *
 * @author USER
 */
public class EliminarEmpleadoAdapter implements EliminarEmpleadoPort {

    private final EmpleadosMemoria empleadosMemoria;

    public EliminarEmpleadoAdapter(EmpleadosMemoria empleadosMemoria) {
        this.empleadosMemoria = empleadosMemoria;
    }

    @Override
    public boolean eliminar(String dni) {
        return empleadosMemoria.eliminar(dni);
    }
}
