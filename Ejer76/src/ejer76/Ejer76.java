/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer76;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Ejer76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        Scanner teclado3 = new Scanner (System.in);
        Scanner teclado4 = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        int num=0;/** @param num servira para controlar el bucle */
        int num1; /** @param num1 sera el primer número de la operación */
        int num2; /** @param num2 sera el segundo número de la operación */
        int num4; /** @param num4 sera utilizado como variable auxiliar para 
         * que funcione el programa */
        int num5; /** @param num5 sera utilizado para darle valor al switch */
        while(num==0){
            System.out.println("Escoja una opción (1)Sumar (2)Restar "
                    + "(3)Multiplicar (4)Dividir (5)Salir del programa ");
            num5=teclado3.nextInt();
            switch(num5){
                case 1:System.out.println("Introduce el primer número");
                       num1=teclado.nextInt();
                       System.out.println("Introduce el segundo número");
                       num2=teclado.nextInt();
                       /** Utilizaremos las clases(suma,resta,multiplicación,división)
                        * que tenemos en el programa para calcular los resultados*/
                       suma s1 = new suma(num1,num2);
                       System.out.println("resultado es " + s1.getnum3());
                       break;
                case 2:System.out.println("Introduce el primer número");
                       num1=teclado.nextInt();
                       System.out.println("Introduce el segundo número");
                       num2=teclado.nextInt();
                       resta r1 = new resta(num1,num2);
                       System.out.println("resultado es " + r1.getnum3());
                       break;
                case 3:System.out.println("Introduce el primer número");
                       num1=teclado.nextInt();
                       System.out.println("Introduce el segundo número");
                       num2=teclado.nextInt();
                       multi m1 = new multi(num1,num2);
                       System.out.println("resultado es " + m1.getnum3());
                       break;
                case 4:System.out.println("Introduce el primer número");
                       num1=teclado.nextInt();
                       System.out.println("Introduce el segundo número");
                       num2=teclado.nextInt();
                       division d1 = new division(num1,num2);
                       System.out.println("resultado es " + d1.getnum3());
                       break;
                /** La opción 5 la utilizaremos para salir del programa
                 cambiando la variable que controlaba el bucle (num)*/       
                case 5:System.out.println("Saliendo del programa");
                       num=num+1;
                       break;
                /** En caso de que la variable del switch(num5) sea correcta
                 entrara en el default en el cual le informaremos de la decisión incorrecta
                 y le pediremos que elija una opción seguir usando el programa o salir */       
                default:System.out.println("Elección incorrecta, elija una de las siguientes opciones"
            + " (1)Seguir utilizando el programa (2) Salir del programa");
            break;}
            /** Despues del switch en caso de que hayamos usado la opción de salir del programa,
             * el programa acabara sin acceder a la parte que tenemos a continuación, en caso de
             * que no hayamos decidido acabar entraremos a la siguiente parte del programa */
            if (num!=0){}
            else{
            /** En caso de que la variable que controla el switch (num5) este entre 1 y 5 daremos
            las siguientes opciones, volver a utilizar el programa o salir de el */    
            if(num5<1 || num5>5){}
            else{System.out.println("Elija una de las siguientes opciones"
            + "(1) Seguir utilizando el programa (2) Salir del programa");}
    num4=teclado.nextInt();
    if(num4<=0 || num4 >=3){System.out.println("Error");}
    /** Si elegimos la opcion 1 volveremos al inicio del while */
    else{if(num4==1){System.out.println("Volviendo al inicio del programa");}
    /** Si elegimos la opcion 2 tendremos que modificar la variable del while para
     que el programa termine*/
    else{if(num4==2){System.out.println("Saliendo del programa");
            num=num+1;}}}}}
}}
