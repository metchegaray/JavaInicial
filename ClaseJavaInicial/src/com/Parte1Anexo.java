 /* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 1 ANEXO
 * ***********************
 */
package com;
import java.util.Scanner;


public class Parte1Anexo {

    public static void main(String[] args) {       
        
		//------------------------------- 
		//ANEXO
		//------------------------------- 
        
		//------------------------------- 
		//        Tipos de datos primitivos
		//------------------------------- 		
		
		//Tipo 	Tamaño y formato 			Rango
		//  	enteros 	 
		//byte 	8 bits - complemento a 2 	-2^7\ al\ 2^7-1
		//short 16 bits - complemento a 2 	-2^{15}\ al\ 2^{15}-1
		//int 	32 bits - complemento a 2 	-2^{31}\ al\ 2^{31}-1
		//long 	64 bits - complemento a 2 	-2^{63}\ al\ 2^{63}-1
		
		//  	números reales 	 
		//float 32 bits - IEEE 754 	 
		//double 64 bits - IEEE 754 	 
		
		//  	otros 	 
		//char 	16 bits - caracteres UNICODE 	'\u0000' al '\uffff'
		//boolean 	1 bit 	true o false


        // Tipo de datos numericos en JAVA
        // cuidado C# tiene diferencias en los tipos 
        
		//        1.- byte (8 bits).
		//        2.- short (16 bits).
		//        3.- int (32 bits).
		//        4.- long (64 btis).
		//        5.- char (16 btis).
		//        6.- float (32 bits).
		//        7.- double (64 bits),
        
        
        //------------------------------- 
		// uso de Variables y tipo de datos
		//------------------------------- 
		
		byte bb=-120;
        System.out.println(bb);
                
        
        Boolean qq=true; //existe la clase Boolean
        boolean qw=true; // en C# no existe este tipo de datos primitivo existe bool
        // bool qe=true; //no existe este tipo de datos primitivo, si en C#
        System.out.println(qq);
        System.out.println(qw);
        // string aa="ww"; // no existe el tipo de datos primitivo en JAVA pero si en C#
        
        int xx;
        // xx ++;
        // System.out.println(xx);
        String xa;
        //System.out.println(xa);
        boolean xb;
        //System.out.println(xb);
        Boolean xc;
        // System.out.println(xc);
        
        // necesito inicializar las variables antes de usarlar
        
        // ff=10;
        // no dispongo de variables implicitas en JAVA
        // var ff=10;
        
        //------------------------------- 
        // Un campo Float puede contenter un entero
		//------------------------------- 
        int rr=10;
        float ra=4.20f;
        ra=rr;
        System.out.println(ra);
        
		//------------------------------- 
        // un campo entero no puede contener un float
		//------------------------------- 
        ra=16.50f;
        //rr=ra;
        //debo sacar la parte entera con la funcion (int)
        rr=(int)ra;
        System.out.println(rr);


			//------------------------------- 
                // Operadores Aritmeticos
			//------------------------------- 
                
                System.out.println("Operadores Aritmeticos");
                int i      = 12;
                int j      = 10;
                int suma   = i + j;
                int resta  = i - j;
                int mult   = i * j;
                int div    = i / j;
                int modulo = i % j;
                
                System.out.print("Suma :");
                System.out.println(suma );
                System.out.print("Resta :");
                System.out.println(resta);
                System.out.print("Multiplicacion :");
                System.out.println(mult);
                System.out.print("Division :");
                System.out.println(div);
                System.out.print("Modulo :");
                System.out.println(modulo);   
        
                
                //------------------------------- 
                // Overflow de campo numerico
				//------------------------------- 
                
                System.out.println("OverFlow de campos numericos");
                j = 2147483647;
                i = j + 1;
                System.out.println("El valor obtenido es " + i);
                
                j = -2147483648;
                i = j - 1;
                System.out.println("El valor obtenido es " + i);
        		
        // 01111111111111111111111111111111 : 2147483647 en números binarios.
        // 00000000000000000000000000000001 : le sumamos 1
        // 10000000000000000000000000000000 : Resultado: -2147483648 complemento a 2
                
				//------------------------------- 
                // División por cero
                // no da noticias el editor
                // pero no ejecuta
                int x = 5;
                int y = 0;
                int z = 0;
                // z= x/y;
                System.out.println(z);
                
                // Esta división por cero devuelve la palabra infinity
                float x1 = 5.0f;
                float y1 = 0.0f;
                float z1 = x1/y1;
                System.out.println(z1);
                
                
				//------------------------------- 
                // Operadores UNARIOS
				//------------------------------- 
                int a=-10;
                System.out.println(-a); // - multiplica por -1 cambia el signo
                System.out.println(+a); // + multiplica por 1 no cambia el signo
                
                
                //------------------------------- 
                System.out.println("Desplazamiento de bits");
				//------------------------------- 
				// Operadores de bits
				//------------------------------- 
				
				
				// Operador     Uso     Resultado
				// <<           A << B  Desplazamiento de A a la izq. en B posiciones
				// >>           A >> B  Desplazamiento de A a la izq. en B posiciones,
				//                      tiene en cuenta el signo.
				// >>>          A >>> B Desplazamiento de A a la izq. en B posiciones,
				//                      no tiene en cuenta el signo.
				//  &           A & B   Operador AND a nivel bits
				//  |           A | B   Operador OR a nivel bits
				//  ^           A ^ B   Operador XOR a nivel bits
				//  ~           A ~ B   Operador de complemento a nivel bits
        
		
			//------------------------------- 
			// Desplazamiento a la izquierda con signo (cíclico)
			//------------------------------- 
			
			j = 33;
			int k = j << 2;
			
			System.out.println(j);
			System.out.println(k);
			
	//        00000000000000000000000000100001 : j = 33
	//        00000000000000000000000010000100 : k = 33 << 2 ; k = 132  
        
		//------------------------------- 
        // Desplazamiento a la derecha con signo (cíclico)
		//------------------------------- 
        k = 132;
        int m = k >> 2;
        
        System.out.println(k);
        System.out.println(m);
        
//        00000000000000000000000010000100 : k = 132    
//        00000000000000000000000000100001 : m = 132 >> 2 ; m = 33
        
          
        // 
          x = -1;
          y = x >> 2;
          System.out.println(y);
          // 11111111111111111111111111111111 : -1
          // no funciona por que agrega 1 a las derecha y los desplaza
          
		  
		  //------------------------------- 
          // Desplazamiento a la derecha sin signo
		  //------------------------------- 
		  
          x = -1;
          y = x >>> 2;
          System.out.println(y);
          // 00111111111111111111111111111111 : 1073741823 en binario
          
          //------------------------------- 
          System.out.println("Operador AND nivel bits");
          // Operador AND de Bits
          int l;
          k = 132;   // k: 00000000000000000000000010000100
          l = 144;   // l: 00000000000000000000000010010000  
          m = k & l; // m: 00000000000000000000000010000000 
          
          System.out.println(m);
          
		  //------------------------------- 
          System.out.println("Operador OR nivel bits");
          // Operador OR de Bits
          k = 132;   // k: 00000000000000000000000010000100
          l = 144;   // l: 00000000000000000000000010010000  
          m = k | l; // m: 00000000000000000000000010010100 
          
          System.out.println(m);
          
		  //------------------------------- 
          System.out.println("Operador XOR nivel bits");
          // Operador XOR de Bits
          k = 132;   // k: 00000000000000000000000010000100
          l = 144;   // l: 00000000000000000000000010010000  
          m = k ^ l; // m: 00000000000000000000000000010100 
          System.out.println(m);
          
		  //------------------------------- 
          System.out.println("Operador NOT nivel bits");
          // Operador NOT de Bits
          k = 132;   // k: 00000000000000000000000010000100
          m = ~k;    // m: 11111111111111111111111101111011 
          System.out.println(m);
          
          
          x = 123;  
          y = ~x;   
          z = y + 1;
          
          System.out.println(y);
          System.out.println(z);
          
		  //------------------------------- 
          // Operador cast
		  //------------------------------- 
          int  unInt = 5000;
          byte unByte = (byte)unInt;
          System.out.println("el resultado es : " + unByte);
          // estamos cortando la variable en 8 bits
          
		//00000000000000000001001110001000 : un int de valor 5000 
		//                        10001000 : un byte de valor -120, complemento a 2
          
          
        
		//------------------------------- //------------------------------- 
		//          Operadores de asignación 
		//------------------------------- //------------------------------- 
				  
		//Operación 				Operador 	Utilización 	Operación equivalente
		//Suma 						+= 		A += B 			A = A + B
		//Resta 					-= 		A -= B 			A = A - B
		//Multiplicación 			*= 		A *= B 			A = A * B
		//División 					/= 		A /= B 			A = A / B
		//Resto de división 		%= 		A %= B 			A = A % B
		//Desplazamiento izq 		<<= 	A <<= B 		A = A << B
		//Desplazamiento der 		>>= 	A >>= B 		A = A >> B
		//Desplazamiento der sin signo >>>= A >>>= B        A = A >>> B
		//AND de bits 				&= 		A &= B 			A = A & B
		//OR de bits 				|= 		A |= B 			A = A | B
		//XOR de bits 				^= 		A ^= B 			A = A ^ B
		//          
				  
				  
		  
		 //-------------------------------  
          // Operadores Booleanos o logicos
		  //------------------------------- 
		  
          
		//          Operadores booleanos 
		//Nombre 	Operador 	Utilización 	Resultado
		//AND       && 		A && B 		V cuando A y B son V 
														//Evaluación condicional.
		//OR 		|| 		A || B 		V cuando A o B son V 
														//Evaluación condicional.
		//NOT       ! 		!A 		V si A es falso.
		//AND       & 		A & B 		V cuando A y B son V 
														//Siempre evalúa ambos operandos.
		//OR 		| 		A | B 		V cuando A o B son V 
														//Siempre evalúa ambos operandos.
		//XOR       ^ 		A ^ B 		V cuando A y B son diferentes.
          
          
          boolean xa1 = true;
          boolean ya = false;
          boolean a1 = xa1 && xa1;
          boolean a2 = xa1 && ya;
          boolean a3 = ya && xa1;
          boolean a4 = ya && ya;

		  //------------------------------- 
          System.out.println("Tabla de verdad de la conjunción");
          System.out.println( xa1 + " AND " + xa1 + " = " + a1 );
          System.out.println( xa1 + " AND " + ya + " = " + a2 );
          System.out.println( ya + " AND " + xa1 + " = " + a3 );
          System.out.println( ya + " AND " + ya + " = " + a4 );
          
          boolean xi,xc1,yi,yc;
          xi = false && true; 
          xc1 = false & true;

          System.out.println(xi);
          System.out.println(xc1);
          
          yi = true || false;
          yc = true |  false;
          
          System.out.println(yi);
          System.out.println(yc);
		  
		  
         //-------------------------------  
          // Operadores Relacionales
		 //-------------------------------  
		  
		//Operador 	Utilización 	Resultado
		//>         A > B 	verdadero si A es mayor que B
		//>= 		A >= B 	verdadero si A es mayor o igual que B
		//< 		A < B 	verdadero si A es menor que B
		//<= 		A <= B 	verdadero si A es menor o igual que B
		//== 		A == B 	verdadero si A es igual a B
		//!= 		A != B 	verdadero si A es distinto de B
          
          
       i = -3;
       byte   b = 5;
       float  f = 1e-10f;
       double d = 3.14;
       boolean b1 = i > i;
       boolean b2 = i < b;
       boolean b3 = b <= f;
       boolean b4 = f >= d;
       boolean b5 = d != 0;
       boolean b6 = 1 == f;

       System.out.println("b1: " + i + " > " + i + " = " + b1);
       System.out.println("b2: " + i + " < " + b + " = " + b2);
       System.out.println("b3: " + b + " <= " + f + " = " + b3);
       System.out.println("b4: " + f + " >= " + d + " = " + b4);
       System.out.println("b5: " + d + " != " + 0 + " = " + b5);
       System.out.println("b6: " + 1 + " == " + f + " = " + b6);
       
       char az = 'A';
       char bz = 'B';
       boolean xz = az > bz;
       
       boolean xu = true;
       boolean yu = xu == xu;
       boolean zu = xu != yu;
       
           //------------------------------- 
		   // Secuencias de Escape       
		   //------------------------------- 
				  
		//    \n -----> Nueva Linea.
		//    \t -----> Tabulador.
		//    \r -----> Retroceso de Carro.
		//    \f -----> Comienzo de Pagina.
		//    \b -----> Borrado a la Izquierda.
		//    \\ -----> El carácter barra inversa ( \ ).
		//    \' -----> El carácter prima simple ( ' ).
		//    \" -----> El carácter prima doble o bi-prima ( " ).

        System.out.println("Este es un ejemplo");
        System.out.println("de");
        System.out.println("Secuencias de Escape");

        // ejemplo de uso de secuencias de escape
        System.out.println("Este es un ejemplo\nde \nSecuencias de Escape");
		
		// no valido
		//int a=2,b=3,c=4;
        //System.out.println("cadena de texto %0 %1 %2",a,b,c);
		//System.out.println("cadena de texto {0} {1} {2}", a, b, c);
		// no valido
		// si para C#
		
		
	//------------------------------- 	
    // Palabras reservadas JAVA
	//------------------------------- 

	// *abstract *double *int *strictfp ** *boolean *else *interface *super *break *extends *long *switch *byte 
	// *final *native *synchronized *case *finally *new *this *catch *float *package *throw *char *for *private 
	// *throws *class *goto * protected *transient *const * if *public* try *continue *implements *return *void
	// *default *import *short *volatile *do *instanceof *static *while

	 
	 
	 
	}
}	 
        
    
          
        