/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 1
 * ***********************
 */
package com;
import java.util.Scanner;


public class Parte1 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Este es el primer programa
        // la doble barra permite los comentarios
        // los comentarios sirven para documentar el codigo
        // o para anular parte del codigo
        
        // no usamos acentos por que se distorciona

        //impresión en pantalla
        System.out.println("Hola Mundo");
        System.out.println("JAVA 2 SE");
        System.out.print("1"); //imprime en una misma linea
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.println("5");
        System.out.println("probando");
        System.out.println("");
        System.out.println("");
        // sout seguido de la tecla TAB es el metodo abreviado de println

        System.out.println("Hola mundo \n\n");
        // \n hace que se deje una linea extra despues imprimir en consola
        
        System.out.println("\thola");
		// \t deja espacio de tabulación antes de imprimir
		
		System.out.println("\n\n\thola");
		// puedo combinar los modificadores
		
		
        
        // JAVA no tiene una instrucción que limpie la consola
        // Otros lenguajes si
        
        
        
        /* probando mas comentarios
         * este es un bloque de comentarios
         * mas comentarios en java
         * Octubre 2012
         */

		 
		 
		 
		 // Las variables son estructuras de almacenamiento en memoria RAM
		 // Memoria RAM: Volatil		Veloz	Costosa
		 // Disco Duro:	 Persistente	Lento	Barato
		 
	 
		//-------------------------------  
        //Definición de variables enteras
		//------------------------------- 
        //los nombres de variables se fijan en minusculas
        int a;      //defini una variable
        a = 2;        //asigne valor a la variable

        int b = 3;    //defini y asigne valor en una sola linea

        int q = 4, w = 5, r = 20; // puedo definir y asignar varias variables

        // int a=4;
        // sólo se puede definir una ves la variable

        a = 30;
        a = 40;
        a = 2;
        // pero puede asignar valor cuantas veces quiera

        int c = a + b;
        int d = 100;

        System.out.print("Variable A = ");
        System.out.println(a);
        System.out.print("Variable B = ");
        System.out.println(b);
        System.out.print("Variable C = ");
        System.out.println(c);
        System.out.print("Variable D = ");
        System.out.println(d);

        System.out.println("A + B = " + a + b); // error produce la concatenacion

        System.out.print("A + B = ");
        System.out.println(a + b);

        System.out.println("A + B = " + (a + b));
        
        // los nombres de todos los tipos de variables van en minusculas
        // es una convención, los nombres de variables pueden tener
        // letras y números, pero no pueden iniciar su nombre en número
        // para nombres de varias palabras se usa camelCase
		// camelCase : letra camello inicia todominuscula, pero cada palabra empieza en mayuscula
        // Ejemplo: int=controlTemperatura2;
        // no se puede int 2controlTemperatura; //ERROR
		
		// La ide marca como warning las variables declaras pero no usadas
       
        
        //----------------
        //Variables String
		//---------------- 
		// Las variables del tipo String almacenan caracteres de texto y numeros como caracteres
		// String empieza con mayusculas por que es una clase
		// No existe el tipo de datos primitivo string en java, si en C#
		
        String p;
        String l;
        String f;
        
        p = "Perro";
        l = "Ladra";
        f = "fuerte";

        //String p="perro";          //permitido
        //String p="perro", l="ladra",f="fuerte"; //permitido
        
        System.out.println(p + l);

        System.out.println(p + " " + l);

        System.out.println(p + c);
        System.out.println("2"+2);
        // Siempre que hay un termino String o literal, el operador +
        // actua como concatenador, no suma.
        
        //System.out.println("el {0} que {1} muy {2}",p,l,f);
        // no funciona es este lenguage, si en C o C#
        
        
		//--------------- 
        //Variables Chars
		//---------------
		
        char o =65;
        char i =67;
        System.out.println(o + " " + i);
		char ii='a';
        System.out.println(ii);

		//------------------------------- 
        //Variables Booleans
		//------------------------------- 
		
        boolean z;
        z = true;
        System.out.println(z);
        z = false;
        System.out.println(z);

		//------------------------------- 
        // Variables float
		//------------------------------- 
		
        float fl = 0;
        System.out.println(fl);
        fl = 95.60f;
        System.out.println(fl);

		//------------------------------- 
        // Variables double
		//------------------------------- 
        double dl = 0;
        System.out.println(dl);
        dl = 95.60d;
        System.out.println(dl);

		//        int u;
        //        System.out.println(u);
        // las variables no se inicializan en ningun valor

		//------------------------------- 
        //Operadores de Asignación
		//------------------------------- 
        
        int nro1 = 5;
        int nro2 = 7;

        System.out.println(nro1);
        System.out.println(nro2);


        nro1 = nro2;
        // el igual es el operador de asignación y
        // la asignacion se produce de derecha a izquierda

        System.out.println(nro1);
        System.out.println(nro2);

        
		//------------------------------- 
        // INCREMENTALES
		//------------------------------- 
        
        //suma 1 a la variable
        nro1++; // es eficiente que la segunda
        // nro1=nro1+1 // ambas producen el mismo resultado
        System.out.println(nro1);


        //resta 1 a la variable
        nro1--;
        // nro1=nro1-1
        System.out.println(nro1);

        //agregar un valor a la variable
        nro1 += 7;
        //nro1=nro1+7
        System.out.println(nro1);

        //quitar un valor a la variable
        nro1 -= 7;
        //nro1=nro1-7
        System.out.println(nro1);

        //Multiplicar por un valor a la variable
        nro1 *= 5;
        //nro1=nro1*5
        System.out.println(nro1);

        //Dividir por un valor a la variable
        nro1 /= 5;
        //nro1=nro1/5
        System.out.println(nro1);
		
		// los operadores ++ -- += -= *= /=
		// no llevan espacios entre los 2 caracteres
		// no se le puede cambiar el orden de los caracteres
		

        // separador de consola para no mesclar los resultados

        System.out.println("-------------------------------");

        System.out.println(nro1);
        System.out.println(nro1++); //primero imprime despues suma
        System.out.println(nro1); // el resultado de la suma lo vemos aca


        System.out.println("-------------------------------");

        System.out.println(nro1);
        System.out.println(++nro1); //primero suma despues imprime
        System.out.println(nro1);
		
		System.out.println("-------------------------------");
		System.out.println(nro2=8); //primero asigna despues imprime
		

        //------------------------------- 
        // tablas de verdad
		//------------------------------- 
        //--------------------------
        //  X   Y       Or      And
        //  F   F       F       F
        //  F   V       V       F
        //  V   F       V       F
        //  V   V       V       V



		//------------------------------- 
        //operaciones lógicas
		//------------------------------- 
        //   &&  operador Y Lógico
        //   ||  operador O Lógico (ALT 124)
        //   !  Operador NOT
        //   =!  operador no igual
        //   == operador de comparación  
				
		// los operadores logicos primero analiza el operador
		// y despues los terminos
		

        boolean log1 = true;
        boolean log2 = false;
        boolean resultado1 = log1 && log2;
        System.out.println(resultado1);
        System.out.println(log1 || log2);
        System.out.println(resultado1 || log2);
        System.out.println(!log1);
        log1 = !log2;
        System.out.println(log1);

        // cuidado con el doble negado
        System.out.println(! !log1);

        // operadores 
        //   &  operador Y 
        //   |  operador O 
        // Estos operadores siempre analizan los dos terminos
        // y despues la operación

		
        System.out.println(log1 | log2);
        System.out.println(log1 & log2);

        System.out.println("mas operadores Logicos");
        int nro3 = 4;
        int nro4 = 4;
        int nro5 = 5;
        System.out.println(nro3 == nro4);
        System.out.println(nro3 != nro4);
        System.out.println(nro4 == nro5);

        System.out.println("mas todavia");
        System.out.println(nro3 > 4);
        System.out.println(nro3 > 4 && nro1 > nro2);
        System.out.println(nro3 > 0 && nro1 + nro2 == 10);
		
		// los operadores == != >= <=
		// no llevan espacios entre los 2 caracteres
		// no se le puede cambiar el orden de los caracteres
		
		// Operador ^ OR exclusivo
        // no hay ^^
		// Funciona como el OR pero si ambos operadores son true devuelve false
		// Para devolver true, ambos operadores deben ser diferentes
        boolean k=true;
        boolean t=true;
        System.out.println(k^t);
       // int a;
        a=30;
        a=(k ? a++ : a--);
        System.out.println(a);
		
		
		//------------------------------- //------------------------------- 
        // Definición de constantes usando final y en mayusculas
		//------------------------------- //------------------------------- 

        // la palabra final define a las constantes
        // por conveción los nombres de constantes van en mayusculas
        final float PI = 3.14f;
        System.out.println(PI);
        //  Esto No es posible  PI ++
        System.out.println(PI);



		//------------------------------- 
        // Operador Condicional IF
		//------------------------------- 

        int condicion = 3;
        System.out.println("Condición = " + condicion);

        // modo recomendado para JAVA
        if (condicion == 3) {
            System.out.println("La condición se cumplio");
        }
		// notar que cuando abrimos unas { y luego presionamos enter
		// el editor agrega automaticamente la } que cierra
		
        // modo abreviado para una sola sentencia
        // sin llaves
        if (condicion == 3) 
            System.out.println("La condición se cumplio");
        
        // el primer punto y coma finaliza la estructura
		// solo cuando hay una sola linea en el ambito

		

        // Modo colegio
        if (condicion == 3) 
        {
            System.out.println("La condición se cumplio");
        }
        // este modo es muy comun en educación pero da lugar a poner por error ; 
        // detras de la sentencia IF
		// este modo es el recomendado por Microsoft para C# y C++ no es para java, 
		// pero igual se lo puede usar 


		//------------------------------- 
        // Operador Condicional IF con Elsa
		//------------------------------- 
		
        if (true) {
            System.out.println("La condición se cumplio");

        } else {
            System.out.println("La condición no se cumplio");

        }

        // Modo abreviado
		// solo cuando hay una sola linea en el ambito
        if (true) 
            System.out.println("La condición se cumplio");
         else 
            System.out.println("La condición no se cumplio");
        
        // Modo colegio // ocupa mucho espacio
		// este modo es el recomendado para C# y C++ no es para java, 
		// pero igual se lo puede usar 
        if (true) 
        {
            System.out.println("La condición se cumplio");
        }
            else
        {
            System.out.println("La condición no se cumplio");
        }
        
		
		
		// ERROR NUNCA PONER ; DESPUES DE LA SENTENCIA
		// if (condicion == 3);
			// System.out.println("La condición se cumplio");
			
		// ERROR NUNCA PONER ; DESPUES DE LA SENTENCIA	
		// if (condicion == 3);
		// {
			// System.out.println("La condición se cumplio");
		// }
		
		
		//------------------------------- 
        // Estructura si anidada
		//------------------------------- 

        String clima, plata;

        clima = "bueno";
        plata = "si";

        System.out.println("El Clima es :" + clima);
        System.out.println("Hay Plata :" + plata);

        if (clima == "bueno") {
            if (plata == "no") {
                System.out.println("Ponete la bata por que no salimos, no hay plata");
            } else {
                System.out.println("salimos");
            }
        } else {
            System.out.println("Ponete la bata por que no salimos, el clima esta malo");
        }

        
		//------------------------------- 
        // estructura de selección case
		//------------------------------- 
		
        int cond = 12;

        switch (cond) {
            case 10:
                System.out.println("El Valor 10");
                break;
            case 11:
                System.out.println("El Valor 11");
                break;
            case 12:
                System.out.println("El Valor 12");
               
            case 13:
                System.out.println("El Valor 13");
              
            case 14:
                System.out.println("El Valor 14");
                break;
            case 15:
                System.out.println("El Valor 15");
                break;
            default:
                System.out.println("El Valor otro");
        }
//  Limitación 1: solo admite una condición. No son validos los operadores 
//  && y ||. 

//  Limitación 2: en esa condición se presupone que el operador de relaci�n 
//  es la comparacion (==). 

//  Limitación 3: la variable asociada a la condición solo puede ser de
//  tipo byte, short, int o char, ninguna otra es valida. 

        // si no hay break continua ejecutando hasta encontrar un break

                   
        
        // Ingresos por consola
        // Entradas de teclado
        // Al inicio del codigo importamos la libreria Scanner de Java Util
        //import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
//        int valor1;
//        int valor2;
//        System.out.println("Ingrese el Valor 1 :");
//        valor1 = teclado.nextInt();
//        System.out.println("Ingrese el Valor 2 :");
//        valor2 = teclado.nextInt();
//
//        System.out.println("El Valor 1 es:" + valor1);
//        System.out.println("El Valor 2 es:" + valor2);

        // en caso de ingresar String usar el metodo .next()
        // en caso de ingresar float usar el metodo .nextFloat()

		
			//------------------------------- //------------------------------- 
			// Laboratorio Parte 1 Estructura de control IF
			//------------------------------- //------------------------------- 
					//Trabajo 1
					//Pagina 60

			//Dado el siguiente código:
			// int nro1 = 100, nro2 = 500, nro3 = 250;
			// Informar cual de los 3 números es el mayor.
			//Requisitos: se necesita tener conociendo de operadores mayor y menor, 
			//y la utilizacion //de if anidados.


        // int
        nro1 = 150;
        // int
        nro2 = 500;
        // int
        nro3 = 250;


        if (nro1 > nro2) {
            if (nro1 > nro3) {
                System.out.println("el mayor es el Numero 1");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        } else {
            if (nro2 > nro3) {
                System.out.println("el mayor es el Numero 2");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        }



		// Trabajo 2
		//Dado el siguiente código:
		//int a=10, b=-2, c=5; // hay 2 numeros positivos y 1 negativo
		//Informar la multiplicación de los dos números positivos

		// int
        a = 10;
		// int
        b = -2;
		// int
        c = 5;


        if (a < 0) {
            System.out.println(b * c);
        } else {
            if (b < 0) {
                System.out.println(a * c);
            } else {
                System.out.println(a * b);
            }

        }



		// Trabajo 3
		// Dado el siguiente código:
		// String usuario = "pepito", clave = "ushuaia";
		// Informar los siguientes casos:
		// si usuario="pepito" y clave="ushuaia" Informar "Bienvenido pepito!"
		// si usuario="pepito" y clave no es "ushuaia" 
		// informar "El usuario no coincide con la contraseña"
		// si el usuario no es "pepito" informar "El usuario no existe!"


        String usuario, clave;
        usuario = "Pepito";
        clave = "ushuaia";

        if (usuario == "Pepito" && clave == "ushuaia") {
            System.out.println("Bienvenido Pepito");
        } else {
            if (usuario == "Pepito") {
                System.out.println("Contrase�a Incorrecta");
            } else {
                System.out.println("Usuario Incorrecto");
            }
        }

		// remake Trabajo 3 con consola
				
		//        //String usuario, clave;
		//		  Scanner teclado=new Scanner(System.in);
		//        System.out.println("Ingrese su nombre de Usuario:");
		//        usuario = teclado.next();
		//        System.out.println("Ingrese su clave:");
		//        clave = teclado.next();
		//
		//        if (usuario.equals("Pepito") && clave.equals("ushuaia")) {
		//            System.out.println("Bienvenido Pepito");
		//        } else {
		//            if (usuario.equals("Pepito")) {
		//                System.out.println("Contrase�a Incorrecta");
		//            } else {
		//                System.out.println("Usuario Incorrecto");
		//            }
		//        }
		//el metodo equals compara la propiedad texto de los objetos clase String

    }
}
