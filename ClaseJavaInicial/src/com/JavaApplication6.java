/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Carlos
 */




public class JavaApplication6 {
    
    
    	private static String readInput() {
		try {
			String CurLine = ""; // Line read from standard in
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String command;
        System.out.println("Ingrese su nombre : ");
        command = readInput();
        System.out.println(command);
    }
}
