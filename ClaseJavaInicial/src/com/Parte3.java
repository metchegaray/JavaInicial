/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 3
 * ***********************
 */
package com;


public class Parte3 {

    public static void main(String[] args) {
	
       //------------------------------- 
	   // Parte 3 Estructura FOR
	   //------------------------------- 

       for (int a=1;a<=10;a++){        
            System.out.println(a);
        }
        System.out.println("---fin de la estructura FOR---");
        //System.out.println(a);
        //la variable a queda destruida por que se deficion local
        
        for (int a=1;a<=10;a++)        
            System.out.println(a);
        System.out.println("---fin de la estructura FOR---");
        //si solo hay una linea en el bucle puedo omitir las llaves
        //no recomendado en JAVA
        
        for (int a=1;a<=10;a++)
        {        
            System.out.println(a);
        }
        //esta forma de poner las llaves funciona
        //pero no es recomendad en JAVA
        
        for (int a=1;a<=10;a++);
        {        
            //System.out.println(a);
            System.out.println("0");
        }
        // colocar el punto y coma despues de la sentencia hace que la sentencia
        // finalice en el ;
        // y la variable a devuelve el error de no definica por que esta 
        // fuera de la sentencia
        
        int b;
        for (b=1;b<=10;b++){        
            System.out.println(b);
        }
        System.out.println("---fin de la estructura FOR---");
        System.out.println(b);
        // usando una variable global dispongo de la variable en todo el codigo
        
		    b=2;
			
			for (b+=0;b<=10;b++){
                System.out.println(b);
            }
            
            b=2;
            for (b++;b<=10;b++){
                System.out.println(b);     
            } 
		
		
		//------------------------------- 
        // controlando varias variables en un FOR
		//------------------------------- 
		
		for(int x=1,s=1;x<=5 && s<=10;x++,s++){
            System.out.println(x+" "+s);
        }
        // es posible recorrer controlando varias variables
		
		
		//------------------------------- 
		// FOR anidado
		//------------------------------- 
        int t=1;
        for(int x=1;x<=10;x++){
            for (int s=1;s<=10;s++){
                System.out.println("x:"+x+" s:"+s+" t:"+t);
                t++;
            }
        }
        // En las estructuras de repeticion anidadas 
        // las instrucciones de adentro se repiten X x S veces
        
		
			
		
        //------------------------------- 
        // loop infinito
		//------------------------------- 
		
		
//        for (int a=1;true;a++){
//            System.out.println(a);
//        }

		// loop infinito
		//       for (int a=1;a<=10 || true;a++){        
        //    System.out.println(a);
        //}
        
				
        // loop infinito
//        for (int a=1;a<=5;a--){
//            System.out.println(a);
//        }
        
        // loop infinito
//        for (int a=1;a>=1;a++){
//            System.out.println(a);
//        }
        
        
        // loop infinito

//        b=2;
//        for (int a=b;b<=10;a++){
//            System.out.println(a);
//        }

        // loop infinito

//        b=2;
//        for (int a=b;a<=10;b++){
//            System.out.println(a);
//        }

        // loop infinito

//        b=2;
//        for (int a=b;a<=10;a--){
//            System.out.println(a);
//        }

		// loop infinito
       // for (int a=1;a<=10;a++){        
       // 		System.out.println(a--);
        // }
       
        
        //------------------------------- 
		// CONCLUSIONES ACERCA DE CICLOS C++
		//------------------------------- 

// El problema de dado un problema cualesquiera cual ciclo se debe usar se resuelve con:

// 1. Si se conoce la cantidad exacta de veces que se quiere que se ejecute el ciclo o si el programa de alguna manera puede calcularla usar for.

// 2. Si se desconoce la cantidad de veces a repetir el ciclo o se quiere mayor control sobre la salida o terminación del mismo entonces usar while.

// 3. Si se quiere que al menos una vez se ejecute el ciclo entonces usar do while. 
		
		
		
		
		
		
		
		
		
		//------------------------------- //------------------------------- 
		//Laboratorio Parte 3 Estructura de control FOR 
		//------------------------------- //------------------------------- 
        //Pagina 63
        
        //Ejercicio 1
        // Imprimir los números del 1 al 10 uno abajo del otro
        
        System.out.println("--- Ejercicio 1 ---");
        
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }



        //Ejercicio 2
        // Imprimir los números del 1 al 10 uno abajo del otro
        // salteando de a dos

        System.out.println("--- Ejercicio 2 ---");
        
        for (int a = 1; a <= 10; a += 2) {
            System.out.println(a);
        }



        // Ejercicio 3
        // Imprimir los números del 10 al 1 uno abajo del otro
        
        System.out.println("--- Ejercicio 3 ---");
        
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }



        // Ejercicio 4

        // Imprimir la suma de números impares del 1 al 10

        System.out.println("--- Ejercicio 4 ---");
        
        int acumulador = 0;
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 1) {
                acumulador += a;
            }
        }
        System.out.println("la suma total es: " + acumulador);


        // Ejercicio 5
        // Imprimir la suma de la multiplicación de los números del 1 al 5
        // con la resta de los números del 1 al 5

        System.out.println("--- Ejercicio 5 ---");
        
        int multiplicacion = 1, resta = 0;
        for (int k = 1; k <= 5; k++) {
            multiplicacion *= k;
            resta -= k;
        }
        System.out.println(multiplicacion);
        System.out.println(resta);
        System.out.println(multiplicacion + resta);



        // Ejercicio 6
        // @
        // @
        // @
        // @
        // @

        System.out.println("--- Ejercicio 6 ---");
        
        for (int k = 1; k <= 5; k++) {
            System.out.println("@");
        }
        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("");
        
        // bonus
        // @@@@@
        for (int k = 1; k <= 5; k++) {
            System.out.print("@");
        }
        System.out.println("");
        

        // Ejercicio 7
        // @
        // @@
        // @
        // @@
        // @
        
        System.out.println("--- Ejercicio 7 ---");
        
        // forma 1
        for (int k=1;k <=5;k++){
            if (k % 2 == 0)
                System.out.println("@@");
            else
                System.out.println("@");
        }
        
        
        // forma 2        
        for (int k = 1; k <= 5; k++){
            if (k % 2 == 0)
                System.out.print("@");
            System.out.println("@");
        }
        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("");

        // bonus
        // @@@@@
        // @@@@@
        // @@@@@
        // @@@@@
        // @@@@@
        
                
       for (int a = 1; a <= 5; a++) {
            for (int x = 1; x < 5; x++)
                System.out.print("@");
            System.out.println("@");
        }
        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("");
        // se usa un para anidado el total de @ es 5 por 5
        // un para a con 5 y otro para b con 5, recorre 5 x 5 veces
        
        
        // Ejercicio 8
        // @
        // @@
        // @@@
        // @@@@
        // @@@@@

        System.out.println("--- Ejercicio 8 ---");
        
        for (int a = 1; a <= 5; a++) {
            for (int x = 1; x < a; x++)
                System.out.print("@");
            System.out.println("@");
        }
        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("");



        //Ejercicio 9
        // @@@@@
        // @@@@
        // @@@
        // @@
        // @
        
        System.out.println("--- Ejercicio 9 ---");
        
        for (int a = 5; a >= 1; a--) {
            for (int x = 1; x < a; x++)
                System.out.print("@");
            System.out.println("@");
        }
        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("");



        // Ejercicio  10 y 11 Bonus
        // @
        // @@
        // @@@
        // @@@@
        // @@@@@ 
        // @@@@
        // @@@
        // @@
        // @


        // @@@@@ 
        // @@@
        // @
        // @@@
        // @@@@@ 

        System.out.println("--- Ejercicio 10 / 11 ---");
        
        // char car;
        // car=64;
        String car;
        car = "@";
        int inicio = 1, fin = 5, paso = 1;
        //int inicio=5,fin=1,paso=-1;

        for (int k = inicio; k != fin + paso; k += paso) {
            for (int j = 1; j <= k; j++)
                System.out.print(car);
            System.out.println("");
        }
        paso *= -1;
        fin--;

        for (int k = fin + 1; k != inicio + paso; k += paso) {
            for (int j = 1; j <= k; j++)
                System.out.print(car);
            System.out.println("");
        }

        // para dejar espacio entre ejercicio y ejercicio
        System.out.println("----------------------------");


    }
}
