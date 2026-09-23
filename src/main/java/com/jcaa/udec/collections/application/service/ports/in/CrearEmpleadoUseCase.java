/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jcaa.udec.collections.application.service.ports.in;
import com.jcaa.udec.collections.application.service.dto.command.CrearEmpleadoComando;
import com.jcaa.udec.collections.domain.core.model.Empleado;

/**
 *
 * @author USER
 */
public interface CrearEmpleadoUseCase {

    Empleado ejecutar(CrearEmpleadoComando comando);
}
