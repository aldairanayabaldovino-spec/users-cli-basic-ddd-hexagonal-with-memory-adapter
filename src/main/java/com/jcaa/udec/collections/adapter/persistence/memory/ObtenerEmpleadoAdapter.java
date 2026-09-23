/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.adapter.persistence.memory;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.ObtenerEmpleadoPort;
import java.util.List;
/**
 *
 * @author USER
 */
public class ObtenerEmpleadoAdapter implements ObtenerEmpleadoPort {

    private final EmpleadosMemoria empleadosMemoria;

    public ObtenerEmpleadoAdapter(EmpleadosMemoria empleadosMemoria) {
        this.empleadosMemoria = empleadosMemoria;
    }

    @Override
    public Empleado obtenerPorDni(String dni) {
        return empleadosMemoria.obtenerPorDni(dni);
    }

    @Override
    public List<Empleado> listar() {
        return empleadosMemoria.listar();
    }
} 

