/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 4 Anexo
 * ***********************
 */
package com;

import java.util.Arrays;
import java.util.Scanner;


public class Parte4Anexo {


    public static void main(String[] args) {
		
		//------------------------------- //------------------------------- 
        // no necesito inicializar un vector para usarlo
        // se contruye con sus valores 0 o nulos
        // pero siempre hay que inicializar las variables
		//------------------------------- //------------------------------- 
        
        int [] numero= new int[4];
        float [] precio= new float[4];
        String [] nombre=new String[4];
        for(int pp =0;pp<numero.length;pp++)
            System.out.println(numero[pp]+" "+precio[pp]+" "+nombre[pp]);
        
		//------------------------------- //------------------------------- 
        // recorride de un vector fuera de rango
		//------------------------------- //------------------------------- 
        // no muestra error el editor pero si al ejecutar se produce error
//        for(int pp =0;pp<=numero.length;pp++)
//            System.out.println(numero[pp]+" "+precio[pp]+" "+nombre[pp]);
        
        
    }
}