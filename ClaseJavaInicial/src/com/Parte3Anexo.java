 /* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 3 ANEXO
 * ***********************
 */
package com;
import java.util.Scanner;


public class Parte3Anexo {

    public static void main(String[] args) {  
          
		  //------------------------------- 
		  // Operador IF ELSE
		  // Este es el unico operador ternario
		  //------------------------------- 
		  
      int a = 23;
      int b = 12;
      int j = a > b ? a - b : b - a;
      System.out.println("El resultado es: " + j );
      
      
	  //------------------------------- 
      // Sentencia Break en while
	  //------------------------------- 
      int n�mero = 4557888;
      int d�gitos = 0;
      while ( n�mero > 0 ) {
          n�mero /=10;
          d�gitos++;
          if (d�gitos ==5) break;
      }
      if (d�gitos ==5) System.out.println("El numero tiene 5 o m�s d�gitos");
      
      //------------------------------- 
	  // Sentencia break en for
	  //------------------------------- 
        for( int pp=0;pp<=20;pp++){
            System.out.println(pp);
            break;
        }
        
	  
	  //------------------------------- 
      // Sentecia continue
	  //------------------------------- 
	  
	//        for (int j = 0; j < 10; j++) {
	//            sentencia 1;
	//            sentencia 2;
	//            sentencia 3;
	//            continue;
	//            sentencia 4;
	//        }
	// La sentecia 4 nunca se ejecuta
	  
		
		//------------------------------- 
        // Sentencia continue
		//------------------------------- 
		
	//        for( int pp=0;pp<=20;pp++){
	//            System.out.println(pp);
	//            continue;
	//            System.out.println("semana");
	//        }
			// en JAVA da error, en c# es posible, solo marca una advertencia
        
            for( int pp=0;pp<=20;pp++){
            System.out.println(pp);
            if (pp<10)continue;
            System.out.println("semana");
        }    
	  
	  
	  
	  
	  
	}
}
      