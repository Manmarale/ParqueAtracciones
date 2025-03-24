/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueatraccion;
/**
 *
 * @author alejandro.escudero
 */
public class Mantenimiento extends Empleado {
   private Atraccion atraccionACargo;
   public Mantenimiento(String nombre, Integer idEmpleado, String puesto){ //constructor de la clase hija de Empleado mantenimiento
       super(nombre, idEmpleado, puesto);
   }
   public void realizarMantenimiento(){
       System.out.println("el empleado " + getNombre() + "Esta haciento el mantenimiento");
   }
   public void reportarProblema(Atraccion atraccion){
       System.out.println("Hay un problema en " + atraccion);
   }
}
