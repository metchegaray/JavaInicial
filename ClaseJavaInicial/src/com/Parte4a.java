/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 4
 * ***********************
 */
package com;

import java.util.Arrays;
import java.util.Scanner;


public class Parte4a {


    public static void main(String[] args) {

	
		//------------------------------- 
        // Vectores
		//------------------------------- 
        String[] nombres = new String[4];
        int[] numeros = new int[4];
        nombres[0] = "Carlos";
        numeros[0] = 1;
        nombres[1] = "Juan";
        numeros[1] = 2;
        nombres[2] = "Jose";
        numeros[2] = 3;
        nombres[3] = "Javier";
        numeros[3] = 4;
        //nombres[4]="Maria";
        //numeros[4]=5;
        // la primer posición del vector es 0 y la ultima es n-1

		//------------------------------- 
        // Salida de una posición en especial
		//------------------------------- 
        System.out.println(numeros[2] + "  " + nombres[2]);

		//------------------------------- 
        // Recorrido del vector
		//------------------------------- 
        for (int a = 0; a < 4; a++) {
            System.out.println(numeros[a] + "  " + nombres[a]);
        }

		
        //------------------------------- //------------------------------- 
        // El metodo length devuelve la longitud del vector
		//------------------------------- //------------------------------- 
        System.out.println("la longitud del vector nombres es : "+nombres.length);
        
		
		//------------------------------- //------------------------------- 
        // Recorrido del vector mejorado
		//------------------------------- //------------------------------- 
		
        for (int a = 0; a < nombres.length; a++) {
            System.out.println(numeros[a] + "  " + nombres[a]);
        }
        
		//------------------------------- //------------------------------- 
        // Recorrido inverso
		//------------------------------- //------------------------------- 
        for (int a=nombres.length-1;a>=1;a--){
            System.out.println(numeros[a] + "  " + nombres[a]);
        }
		
		//------------------------------- //------------------------------- 
        // Recorrido usando while
		//------------------------------- //------------------------------- 
		int x=0;
		while(x<nombres.length){
			System.out.println(numeros[x] + "  " + nombres[x]);
			x++;
		}
        
        
        int[] vec = {10, 5, 2, 3, 10,30,23,20,10,10,5,20,15};
        System.out.println(vec[1]);

		//------------------------------- //------------------------------- 
        //  vec.length corresponde a la longitud del vector
		//------------------------------- //------------------------------- 
        System.out.println(vec.length);
		

		
		//------------------------------- //------------------------------- 
        // recorrido del vector usando length
		//------------------------------- //------------------------------- 

        for (int b = 0; b < vec.length; b++) {
            System.out.println(vec[b]);
        }

		
		//------------------------------- //------------------------------- 
        // Busqueda del numero maximo y minimo de un vector
		//------------------------------- //------------------------------- 
		
        int maximo=vec[0],minimo=vec[0];
        // si solo voy calcular el maximo y minimo puedo recorrer desde 1
        for (int a=1;a<vec.length;a++){
            if (vec[a]>maximo)
                maximo=vec[a];
            if (vec[a]<minimo)
                minimo=vec[a];
        }
        System.out.println("El maximo es : "+maximo);
        System.out.println("El minimo es : "+minimo);
        
        
		//------------------------------- //------------------------------- 
        // Contar cuantas veces aparece el numero 10
		//------------------------------- //------------------------------- 
		
        int contador =0;
        for(int a=0;a<vec.length;a++){
            if (vec[a]==10)
            contador ++;
        }
        System.out.println("El numero 10 aparece :"+contador+" veces");
        
        
		//-------------------------------//------------------------------- 
        // Totalizar un vector y calcular el promedio
		//------------------------------- //------------------------------- 
        int total=0;
        for(int a=0;a<vec.length;a++){
            total+=vec[a];
        }
        System.out.println("La suma total es:"+total);
        System.out.println("El promedio es:"+total/vec.length);
        
        
		
		//------------------------------- 
        // Copia de un vector
		//------------------------------- 

        int pares[] = {2, 4, 6, 8, 10};
        int[] impares = new int[pares.length];
        for (int c = 0; c < pares.length; c++) {
            impares[c] = pares[c] - 1;
        }

		//------------------------------- //------------------------------- 
        // Recorrido del primer y segundo vector
		//------------------------------- //------------------------------- 
		
        for (int d = 0; d < pares.length; d++) {
            System.out.println(impares[d]);
            System.out.println(pares[d]);

        }

		//------------------------------- //------------------------------- 
        //usando una función de la biblioteca Standard de java
		//System.arraycopy(from,fromindex,to,toindex,Length);
		//------------------------------- //------------------------------- 

        int[] pares2 = new int[pares.length];
        System.arraycopy(pares, 0, pares2, 0, pares.length);

		
		//------------------------------- //------------------------------- 
        // recorrido del primer y segundo vector
		//------------------------------- //------------------------------- 
		
        for (int d = 0; d < pares.length; d++) {
            System.out.println(pares[d]);
            System.out.println(pares2[d]);
        }

		
		//------------------------------- 
        //recorro vec
		//------------------------------- 
        for (int b = 0; b < vec.length; b++) {
            System.out.println(vec[b]);
        }

        // Para algunas utilidades es necesario incorporar la librería Arrays
        // al iniciar el código, despues del nombre del package
        // import java.util.Arrays;
        
		//------------------------------- 
		// ordeno vec
		//------------------------------- 
				
        Arrays.sort(vec);
		

        //------------------------------- 
		//recorro vec
		//------------------------------- 
        for (int b = 0; b < vec.length; b++) {
            System.out.println(vec[b]);
        }

		//------------------------------- 
        // comparo pares con impares
		//------------------------------- 
        System.out.println(Arrays.equals(pares, impares));

		//------------------------------- 
        // comparo pares con impares2
		//------------------------------- 
        System.out.println(Arrays.equals(pares, pares2));


		//------------------------------- 
        // devuelve el vector en forma de String
		//------------------------------- 
        System.out.println(Arrays.toString(pares));

        
        //----------------------------
        //Laboratorio Parte 4 Vectores 
        //----------------------------
        
		// Pagina 66

        //Ejercicio 1

        // Dado el Vector {10,20,5,15,30,20}
        // a- informar el vector de la forma: “Índice: X, Valor: Y”
        // b- Totalizar el vector e informar el total
        // c- informar el contenido de las posiciones impares 
        // (por ejemplo, las posiciones 1,3,5,etc)
        // d- Informar el mayor numero
        // e- Informar cuantas veces aparece el numero 20

        int vector[] = {10, 20, 5, 15, 30, 20};
        //int total;
        //int maximo;
        //int minimo;
        //int contador;
        total = 0;
        maximo = 0;
        contador = 0;
        
        for (int a = 0; a < vector.length; a++) {
           
            System.out.println("indice:" + a + " Valor:" + vector[a]);
            total += vector[a];
            

            if (a % 2 == 1) {
                System.out.println("posicion Impar");
            }


            if (vector[a] > maximo) {
                maximo = vector[a];
            }
            
			
			if (vector[a] == 20) {
                contador++;
            }

        }
        System.out.println("El total es: " + total);
        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor 20 aparece " + contador + " Veces");



        //Ejercicio 2

        //Dado el vector inflación 
        // {0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9};
        // Cada item del vector representa la inflación de un mes 
        // de tal manera que el primer item.del vector que es 0.8 
        // representa la inflación de Enero, y el ultimo Item. del vector 
        // representa la inflación de diciembre.Se pide

        //a - informar la inflación anual
        //b - informar la inflación más baja con el número de mes.
        //    Por ejemplo Mes 2=0.1
        //c - informar la inflación más alta con el número de mes.
        //    Por ejemplo Mes 12=0.9
        //d - informar el promedio de inflación (inflación total / 12).
        //


        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        double inflacionAnual = 1;
        double inflacionMasBaja = inflacion[0];
        int indiceInflacionMasBaja = 0;
        double inflacionMasAlta = inflacion[0];
        int indiceInflacionMasAlta = 0;
        double sumatoriaInflacion = 0;


        for (int k = 0; k < inflacion.length; k++) {
            inflacionAnual += inflacionAnual * inflacion[k] / 100;
            if (inflacion[k] < inflacionMasBaja) {
                inflacionMasBaja = inflacion[k];
                indiceInflacionMasBaja = k;
            }
            if (inflacion[k] > inflacionMasAlta) {
                inflacionMasAlta = inflacion[k];
                indiceInflacionMasAlta = k;
            }
            sumatoriaInflacion += inflacion[k];
        }
        System.out.println("Inflacion anual= " + inflacionAnual);
        System.out.println("Inflacion mas baja= " + inflacionMasBaja + " En el mes= " + indiceInflacionMasBaja);
        System.out.println("Inflacion mas alta= " + inflacionMasAlta + " En el mes= " + indiceInflacionMasAlta);
        System.out.println("Promedio de inflacion= " + sumatoriaInflacion / inflacion.length);

        
        // Ejercicio usuarios Bonus
        // Parte 1: Definicion y carga de vectores usuarios y claves
        // Parte 2: Entrada por consola de los Strings usuario y clave
        // Parte 3: Determinar si el String usuario exites en usuarios
        //          e informar donde.
        // Parte 4: Comprobar clave y dar respuesta final
        
        
        // Parte 1:
        String[] claves = new String[4];
        String[] usuarios = new String[4];
        usuarios[0]="pepito";
        claves[0]="ushuaia";
        usuarios[1]="Juan";
        claves[1]="123";
        usuarios[2]="Ana";
        claves[2]="321";
        usuarios[3]="Maria";
        claves[3]="abc";
        
        // Parte 2:
        Scanner teclado = new Scanner(System.in);
        String usuario,clave;
        System.out.println("Ingrese su nombre de Usuario : ");
        usuario = teclado.next();
        System.out.println("Ingrese su clave : ");
        clave = teclado.next();
        //System.out.println("usuario : "+usuario+" clave : "+clave);
        
        // Parte 3:
        //System.out.println(usuario=="pepito");
        //System.out.println(usuario.equals("pepito"));
        //En los objetos de la clase String ingresados por consola
        //debemos comparar con el metodo equals
        boolean existe=false;
        int donde=0;
        for (int a=0;a<claves.length;a++){
            if (usuario.equals(usuarios[a])){
                existe=true;
                donde=a;
            }
        }
        
        // Parte 4
        //System.out.println("Existe "+existe);
        if (existe){
            if(clave.equals(claves[donde]))
                System.out.println("Bienvenido "+usuario);
            else
                System.out.println("Clave incorrecta");
        }else
            System.out.println("Usuario incorrecto");
        // Algunas lineas comentariadas, en caso de error las descomentariamos
        // y sirven para buscar el error
    }
}