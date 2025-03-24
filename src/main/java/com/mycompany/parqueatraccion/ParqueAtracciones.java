package com.mycompany.parqueatraccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alejandro.escudero
 */
public class ParqueAtracciones {
    private List<Atraccion> atracciones;  //listas 
    private List<Empleado> empleados;
    private List<Visitante> visitantes;
    public ParqueAtracciones(){
        this.atracciones = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }
    public List<Atraccion> getAtracciones(){ //un getter el cual puede ser util, creo que debería quitar algunos getters y setters para mejorar el rendimiento pero no se si mi profesor me deja
        return atracciones;
    }
    public void agregarAtraccion(Atraccion atraccion){ //agregar una atraccion
        atracciones.add(atraccion);
        System.out.println("se ha agregado la atraccion " + atraccion);
        
    }
    public void agregarEmpleado(Empleado empleado){ // agregar un empleado
        empleados.add(empleado);
        System.out.println("Se ha agregado al empleado " + empleado);
    }
    public void agregarVisitante(Visitante visitante){ //agregar un visitante
        visitantes.add(visitante);
        System.out.println("Se ha agregado al visitante " + visitante);
    }
    public void mostrarInformacionParque(){
        System.out.println("\n--- Informacion del parque de atracciones ---");
        System.out.println("Atracciones: " + atracciones.size());
        System.out.println("Empleados: " + empleados.size());
        System.out.println("Visitantes: " + visitantes.size());
    }
}

