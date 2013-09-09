package com.Consola;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // la clase Sys tiene muchas ventajas para el ingreso de datos
        // clase SYS tiene definidos metodos static, 
        // no es necesario instanciar para poder usar sus metodos
        Sys.println("hola mundo");
        Sys.println("-----------");
        Sys.println("ingrese su nombre:");        
        String nombre=Sys.readLineString();
        Sys.println("-------------------");
        Sys.println(nombre);
        Sys.println("Ingrese su edad:");
        int edad=Sys.readLineInt();
        Sys.pressKey();
        Sys.println(nombre+" "+edad);
        Sys.pressKey();
        
        
        
    }
}
