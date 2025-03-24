/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueatraccion;
/**
 *
 * @author alejandro.escudero
 */
public class Atraccion {
    private String nombre;
    private Integer capacidadMaxima;
    private String estado;
    public Atraccion(String nombre, Integer capacidadMaxima, String estado){
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }//getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public Integer getCapacidadMaxima(){
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(){
        this.capacidadMaxima = capacidadMaxima;
    }
    public String getEstado(){
        return estado;
    } 
    public void setEstado(){
        this.estado = estado;
    }
    
    public void iniciarAtraccion(){
        System.out.println("La atraccion " + nombre + "Esta siendo iniciada");
        
    }
    public void detenerAtraccion(){
        System.out.println("La atraccion " + nombre +  "ha sido detenida");
    }
    public void cambiarEstado(String estadoMaquina){//metodo para cambiar el estado de las maquinas, podría usar un operador ternario, pero con dos else if queda mas visual
        if(estadoMaquina.equalsIgnoreCase("Operativa") ){
            this.estado = estadoMaquina;
        }else if (estadoMaquina.equalsIgnoreCase("En mantenimiento")){
            this.estado = estadoMaquina;
        }else if (estadoMaquina.equalsIgnoreCase("Fuera de servicio")){
            this.estado = estadoMaquina;
        }else{
            System.out.println("estado no valido");
        }
    }
}

