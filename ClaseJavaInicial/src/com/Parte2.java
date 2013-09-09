/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 2
 * ***********************
 */
package com;

public class Parte2 {

    public static void main(String[] args) {
				//------------------------------- 
                // Estructura de repeticion While
				//------------------------------- 

        int a;
        a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("-- fin estructura while --");
        System.out.println(a);
        System.out.println("");
        // las llaves estan como lo recomienda JAVA
        
        a=1;
        while (a <= 10) 
        {
            System.out.println(a);
            a++;
        }
        // las llaves estan como lo recomienda Microsoft para sus lenguajes
        // tb modo colegio
        
		
		//------------------------------- 
		// precedencia del operador ++
		//------------------------------- 
		System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        // la precedencia del operador ++ indica si se opera
        // antes de imprimir o depues
        
        a=1;
        while (a >= 10)
            System.out.println(a++);
        // modo minimalista
               

		//------------------------------- 
        // Estructura de repeticion DO While
		//------------------------------- 
        // esta estructura asegura por lo menos una pasada
        a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 10);
        System.out.println("-- fin estructura do while --");
        System.out.println(a);
        System.out.println("");
        

		//------------------------------- 
		// Estructura While Anidada
		//------------------------------- 
		
		int x=1;
        int s=1;
        int t=1;
        while (x<=10){
            while (s<=10){
                System.out.println("x:"+x+" s:"+s+" t:"+t);
                t++;
                s++;
            }
            s=1;
            x++;
        }
		// En las estructuras de repeticion anidadas 
        // las instrucciones de adentro se repiten X x S veces
        

		//------------------------------- 
        // Ejemplos de loop infinito
		//------------------------------- 
        // para cortar una ejecución infinita menú RUN stop build
        // probar y dejarlas comentariadas para poder seguir con el codigo
        
        
                        // loop infinito
                        //a=1;
                        //while(true){
                        //    System.out.println(a);
                        //    a++;
                        //}
        
        
        
			// loop infinito
			//        a = 1;
			//        while (a <= 10) {
			//            System.out.println(a);
			//            a--;
			//        }


			// loop infinito

			//        a = 1;
			//        while (a >= 1) {
			//            System.out.println(a);
			//            a++;
			//        }


			// loop infinito
			//        a=1;
			//        while(true){
			//            System.out.println(a);
			//            a++;
			//        }

			// loop infinito
			//        a = 1;
			//        while (a <= 10);
			//        {
			//            System.out.println(a);
			//            a++;
			//        }
			
			
			// no produce loop infinito
			        // int a=1,b=2;
					// while (b<10)
					// {
						// System.out.println(a--);
						// b++;
					// }
			

		//------------------------------- 
		// Laboratorio Parte 2 Estructura de control While
		//------------------------------- 
		//Pagina 61

		// Ejercicio 1 Parte 2
		//Imprimir los números del 1 al 10 uno abajo del otro

        System.out.println("---Ejercicio 1---");
        //int a
        a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        //Ejercicio 2 Parte 2
        //Imprimir los números del 1 al 10 salteando de a 2 uno abajo del otro

        System.out.println("---Ejercicio 2---");
        //int a;
        a = 1;
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }

        //Ejercicio 3 Parte 2
        //Imprimir los números del 10 al 1 uno abajo del otro

        System.out.println("---Ejercicio 3---");
        //int a;
        a = 10;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }

        //Ejercicio 4 Clase 2
        //Imprimir los números del 1 al 10 sin imprimir números 2,5 y 9 uno abajo //del otro.
        //Requisito: se necesita tener conocimientos del operador AND (&&) y del operador NOT  (!=)

        System.out.println("---Ejercicio 4---");
        //int a;
        a = 1;
        while (a <= 10) {
            if (a != 2 && a != 5 && a != 9) {
                System.out.println(a);
            }
            a++;
        }

        //ensayo de operador de negacion !
        boolean e = true;
        System.out.println(e);
        System.out.println(!e);

        //Ejercicio 5 Clase 2
        //Imprimir los números del 1 al 30 sin imprimir números entre 
        //el 10 y el 20 uno abajo del otro.
        //Requisitos: se necesita tener conocimientos del operador OR (||)  

        System.out.println("---Ejercicio 5---");
        //int a;
        a = 1;
        while (a <= 30) {
            if (a < 10 || a > 20) {
                System.out.println(a);
            }
            a++;
        }

        //Ejercicio 6 Clase 2
        // Imprimir la suma de los números del 1 al 10

        System.out.println("---Ejercicio 6---");
        //int a;
        a = 1;
        int sumador = 0;
        while (a <= 10) {
            sumador += a;
            a++;
        }
        System.out.println("la suma total es : " + sumador);


        // el operador de resto es % reemplaza al mod (no existe en JAVA)
        System.out.println(15 % 2);
        System.out.println(14 % 2);
        System.out.println(-14 % 2);
        System.out.println(-15 % 2);
        // los numeros pares tienen resto 0
        // los numeros impares tienen resto !=0
		
		// el operador mod no existe en JAVA, se lo llama %

        // Ejercicio 7 Clase 2 
        // Imprimir la suma de los números pares del 1 al 25
        // Requisito: se necesita tener conocimiento del operador RESTO  // (%)

        System.out.println("---Ejercicio 7---");
        //int a;
        a = 1;
        //int sumador;
        sumador = 0;
        while (a <= 25) {
            if (a % 2 == 0) {
                sumador += a;
            }
            a++;
        }

        System.out.println("la suma total es : " + sumador);



        // Ejercicio 8 Clase 2 – BONUS!
        //Imprimir la multiplicación de números impares 
        //que se encuentran entre el -10 y 10

        System.out.println("---Ejercicio 8---");
        //int a;
        a = -10;
        int multiplicador = 1;
        while (a <= 10) {
            if (a % 2 != 0) {
                multiplicador *= a;
            }
            a++;
        }
        System.out.println("la multiplicacion total es : " + multiplicador);

        
        //Ejercicio 9 Clase 2
        //Imprimir la suma de los números pares mayores a 9 y menores a 20
        //que se encuentran entre el 1 y el 30

        System.out.println("---Ejercicio 9---");
        //int a;
        a = 1;
        //int sumador;
        sumador=0;
        
        while (a <= 30) {
            if (a % 2 == 0 && a > 9 && a < 20) {
                sumador += a;
            }
            a++;
        }
        System.out.println("la suma total es : " + sumador);



    }
}