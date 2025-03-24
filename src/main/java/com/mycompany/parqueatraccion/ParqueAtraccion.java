/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parqueatraccion;
import java.util.Scanner;
/**
 *
 * @author alejandro.escudero
 */
public class ParqueAtraccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//el scanner 
        ParqueAtracciones parque = new ParqueAtracciones();
        Vendedor vendedor = null; //hago que sean null para mejorar el rendimiento
        Mantenimiento mantenimiento = null;
        while(true){//Menu interactivo
            System.out.println("\n--- Menu del Parque de Atracciones ---");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Atraccion");
            System.out.println("3. Agregar Visitante");
            System.out.println("4. Mostrar Informacion del Parque");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1://en el caso de querer añadir un empleado
                    System.out.println("Nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.println("ID del Empleado: ");
                    int idEmpleado = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Puesto del empleado (Vendedor/Mantenimiento)");
                    String puestoEmpleado = scanner.nextLine();
                    if(puestoEmpleado.equalsIgnoreCase("mantenimiento")){
                        mantenimiento = new Mantenimiento(nombreEmpleado,idEmpleado , "Mantenimiento");
                        parque.agregarEmpleado(mantenimiento);
                    }else if(puestoEmpleado.equalsIgnoreCase("vendedor")){
                        vendedor = new Vendedor(nombreEmpleado, idEmpleado, "Vendedor");
                        parque.agregarEmpleado(vendedor);
                    }else{
                        System.out.println("Opcion no valida");
                    }
                    break;
                case 2: //en el caso de querer añadir una atracción
                    System.out.println("Nombre de la atraccion: ");
                    String nombreAtraccion = scanner.nextLine();
                    System.out.println("Capacidad maxima de la atraccion: ");
                    int capacidadAtraccion = scanner.nextInt();
                    scanner.nextLine();
                    Atraccion atraccion = new Atraccion(nombreAtraccion, capacidadAtraccion, "Operativa");
                    parque.agregarAtraccion(atraccion);
                    break;
                case 3: //en el caso de querer añadir un visitante 
                    System.out.println("Nombre del visitante: ");
                    String nombreVisitante = scanner.nextLine();
                    System.out.println("ID del Visitante: ");
                    int idVisitante = scanner.nextInt();
                    System.out.println("Edad del Visitante: ");
                    int edadVisitante = scanner.nextInt();
                    scanner.nextLine();
                    Visitante visitante = new Visitante(nombreVisitante, idVisitante, edadVisitante);
                    parque.agregarVisitante(visitante);
                    break;
                case 4: //en el caso de querer ver la info del parque
                    parque.mostrarInformacionParque();
                    break;
                case 5: //en el caso de querer salir
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default: //cualquier otro caso no reconocido
                    System.out.println("Opcion no valida");
            }
        }
    }
}
