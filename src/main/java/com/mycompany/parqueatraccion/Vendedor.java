/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueatraccion;
/**
 *
 * @author alejandro.escudero
 */
public class Vendedor extends Empleado{
    private Integer ventasRealizadas;
    public Vendedor(String nombre, Integer idEmpleado, String puesto){ //Constructor de la clase hija de Empleado Vendedor
        super(nombre, idEmpleado, puesto);
        
    }
    public void venderEntrada(Integer entrada){//un metodo que simplemente suma 1 a las entradas vendidas
        System.out.println("se ha venidido una entrada");
        this.ventasRealizadas = ventasRealizadas + 1; 
    }public Integer reportarVentas(){//Un metodo que te muestra con un return las ventas realizadas
        System.out.println("se han realizado las siguientes ventas: ");
        return ventasRealizadas;
    }
}
