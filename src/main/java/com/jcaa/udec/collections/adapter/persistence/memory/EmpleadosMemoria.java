/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec.collections.adapter.persistence.memory;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class EmpleadosMemoria {

    private final List<Empleado> empleados = new ArrayList<>();

    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado obtenerPorDni(String dni) {
        return empleados.stream()
                .filter(empleado -> empleado.getDni().equals(dni))
                .findFirst()
                .orElse(null);
    }

    public List<Empleado> listar() {
        return empleados;
    }

    public Empleado actualizar(Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getDni().equals(empleado.getDni())) {
                empleados.set(i, empleado);
                return empleado;
            }
        }
        return null;
    }
public boolean eliminar(String dni) {
    return empleados.removeIf(empleado -> empleado.getDni().equals(dni));
}
}