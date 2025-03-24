/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueatraccion;
/**
 *
 * @author alejandro.escudero
 */
public class Visitante {
     private String nombre;
    private Integer idVisitante;
    private Integer edad;
    public Visitante(String nombre, Integer idVisitante, Integer edad){
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public Integer getIdVisitante(){
        return idVisitante;
    }
    public void setIdVisitante(){
        this.idVisitante = idVisitante;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(){
        this.edad = edad;
    }
    public void comprarEntrada(Integer entrada){
        System.out.println(nombre + "ha comprado " + entrada + "entradas ");
    }
    public void usarAtraccion(Atraccion atraccion){
        System.out.println("El visitante " + nombre  + "esta disfrutando de la atraccion " + atraccion.getNombre());
        
    }
}

