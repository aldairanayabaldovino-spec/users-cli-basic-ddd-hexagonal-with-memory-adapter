/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcaa.udec;
import com.jcaa.udec.collections.adapter.persistence.memory.ActualizarEmpleadoAdapter;
import com.jcaa.udec.collections.adapter.persistence.memory.EliminarEmpleadoAdapter;
import com.jcaa.udec.collections.adapter.persistence.memory.EmpleadosMemoria;
import com.jcaa.udec.collections.adapter.persistence.memory.GuardarEmpleadoAdapter;
import com.jcaa.udec.collections.adapter.persistence.memory.ObtenerEmpleadoAdapter;
import com.jcaa.udec.collections.application.service.ActualizarEmpleadoService;
import com.jcaa.udec.collections.application.service.CrearEmpleadoService;
import com.jcaa.udec.collections.application.service.EliminarEmpleadoService;
import com.jcaa.udec.collections.application.service.ObtenerEmpleadoService;
import com.jcaa.udec.collections.application.service.dto.command.CrearEmpleadoComando;
import com.jcaa.udec.collections.application.service.ports.in.ActualizarEmpleadoUseCase;
import com.jcaa.udec.collections.application.service.ports.in.CrearEmpleadoUseCase;
import com.jcaa.udec.collections.application.service.ports.in.EliminarEmpleadoUseCase;
import com.jcaa.udec.collections.application.service.ports.in.ObtenerEmpleadoUseCase;
import com.jcaa.udec.collections.domain.core.model.Empleado;
import com.jcaa.udec.collections.domain.port.out.ActualizarEmpleadoPort;
import com.jcaa.udec.collections.domain.port.out.EliminarEmpleadoPort;
import com.jcaa.udec.collections.domain.port.out.GuardarEmpleadoPort;
import com.jcaa.udec.collections.domain.port.out.ObtenerEmpleadoPort;
/**
 *
 * @author USER
 */
public class DemoEmpleado {

    public static void main(String[] args) {

        EmpleadosMemoria empleadosMemoria = new EmpleadosMemoria();

        GuardarEmpleadoPort guardarPort =
                new GuardarEmpleadoAdapter(empleadosMemoria);

        ObtenerEmpleadoPort obtenerPort =
                new ObtenerEmpleadoAdapter(empleadosMemoria);

        ActualizarEmpleadoPort actualizarPort =
                new ActualizarEmpleadoAdapter(empleadosMemoria);

        EliminarEmpleadoPort eliminarPort =
                new EliminarEmpleadoAdapter(empleadosMemoria);

        CrearEmpleadoUseCase crearEmpleado =
                new CrearEmpleadoService(guardarPort);

        ObtenerEmpleadoUseCase obtenerEmpleado =
                new ObtenerEmpleadoService(obtenerPort);

        ActualizarEmpleadoUseCase actualizarEmpleado =
                new ActualizarEmpleadoService(actualizarPort);

        EliminarEmpleadoUseCase eliminarEmpleado =
                new EliminarEmpleadoService(eliminarPort);

        System.out.println("=== DEMOSTRACIÓN CRUDL DE EMPLEADOS ===");

        // CREATE
        System.out.println("\n1. CREAR EMPLEADO");

        Empleado empleado = crearEmpleado.ejecutar(
                new CrearEmpleadoComando(
                        "1234567890",
                        "Aldair",
                        "Anaya",
                        "3001234567",
                        "Cartagena",
                        "123456789"
                )
        );

        System.out.println("Empleado creado: "
                + empleado.getNombres() + " "
                + empleado.getApellidos());

        // READ
        System.out.println("\n2. CONSULTAR EMPLEADO");

        Empleado consultado =
                obtenerEmpleado.obtenerPorDni("1234567890");

        System.out.println("Empleado consultado: "
                + consultado.getNombres() + " "
                + consultado.getApellidos());

        // LIST
        System.out.println("\n3. LISTAR EMPLEADOS");

        obtenerEmpleado.listar().forEach(e ->
                System.out.println(
                        e.getDni() + " - "
                        + e.getNombres() + " "
                        + e.getApellidos()
                )
        );

        // UPDATE
        System.out.println("\n4. ACTUALIZAR EMPLEADO");

        Empleado empleadoActualizado = Empleado.builder()
                .dni("1234567890")
                .nombres("Aldair")
                .apellidos("Anaya Baldovino")
                .telefono("3019876543")
                .direccion("Cartagena, Bolívar")
                .cuentaBancaria("987654321")
                .build();

        actualizarEmpleado.actualizar(empleadoActualizado);

        System.out.println("Empleado actualizado: "
                + obtenerEmpleado.obtenerPorDni("1234567890").getApellidos());

        // DELETE
        System.out.println("\n5. ELIMINAR EMPLEADO");

        boolean eliminado =
                eliminarEmpleado.eliminar("1234567890");

        System.out.println("Empleado eliminado: " + eliminado);

        System.out.println("\n=== CRUDL FINALIZADO ===");
    }
}
