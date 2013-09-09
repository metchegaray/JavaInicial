package com.Consola;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * Console Interface 2012
 * Sopported Data Types: String, int, boolean, double,char
 * // esta clase esta definida con metodos static
 */
public class Sys {
    static public void println(String s){
        System.out.println(s);
    }
    
    static public void println(int s){
        System.out.println(s);
    }   
    
    static public void println(boolean s){
        System.out.println(s);
    }
    
    static public void println(double s){
        System.out.println(s);
    }    
    
    static public void println(char s){
        System.out.println(s);
    }   
     
    static public void print(String s){
        System.out.print(s);
    }
    
    static public void print(int s){
        System.out.print(s);
    }   
    
    static public void print(boolean s){
        System.out.print(s);
    }
    
    static public void print(double s){
        System.out.print(s);
    }    
    
    static public void print(char s){
        System.out.print(s);
    }  
     
    static public String readLineString(){
         String s;
         s= new Scanner(System.in).next();
         return s;
     }
     
    static public int readLineInt(){
         int s;
         s= new Scanner(System.in).nextInt();
         return s;
    }  
     
    static public boolean readLineBoolean(){
         boolean s;
         s= new Scanner(System.in).nextBoolean();
         return s;
    } 
     
    static public double readLineDouble(){
         double s;
         s= new Scanner(System.in).nextDouble();
         return s;
    }
    
    static public char readLineChar(){
         char s=0;
         readKeyChar();
         return s;
    }
     
     
    static public char readKeyChar(){
        int s=0;
        char x=(char)s;
         try{        
             s=System.in.read();
             x=(char)s;
             //System.out.println(s+" "+x);
        }
            catch(java.io.IOException e) {} 
         return x;
    }
    
    
    static public void pressKey(){
         System.out.println("Please Press <ENTER> to continue.");
         //readKey();
         //readLineString();
         readKeyChar();
    }
}
