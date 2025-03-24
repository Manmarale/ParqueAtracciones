/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package com.mycompany.parqueatraccion;
/**
 *
 * @author alejandro.escudero
 */
public class Empleado {
   private String nombre;
   private Integer idEmpleado;
   private String puesto;
   public Empleado(String nombre, Integer idEmpleado, String puesto){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public Integer getIdEmpleado(){
        return idEmpleado;
    }
    public void setIdEmpleado(){
        this.idEmpleado = idEmpleado;
    }
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(){
        this.puesto = puesto;
    }
    public void asignarTarea(String tarea){
        System.out.println("El empleado " + nombre + "tiene de tarea " + tarea);
    }
    public void realizarTarea(String tarea){
        System.out.println("El empleado " + nombre + "esta realizando " + tarea);
    }
}



