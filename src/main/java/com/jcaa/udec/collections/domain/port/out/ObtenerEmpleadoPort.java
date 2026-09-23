/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jcaa.udec.collections.domain.port.out;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import java.util.List;
/**
 *
 * @author USER
 */
public interface ObtenerEmpleadoPort {

    Empleado obtenerPorDni(String dni);

    List<Empleado> listar();
}
