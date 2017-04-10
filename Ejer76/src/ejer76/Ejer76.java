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
        int num=0;
        int num5;
        int num4;
        int num1;
        int num2;
        while(num==0){
            System.out.println("Escoja una opción (1)Sumar (2)Restar "
                    + "(3)Multiplicar (4)Dividir (5)Salir del programa ");
            num5=teclado3.nextInt();
            switch(num5){
                case 1:System.out.println("Introduce el primer número");
                       num1=teclado.nextInt();
                       System.out.println("Introduce el segundo número");
                       num2=teclado.nextInt();
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
                case 5:System.out.println("Saliendo del programa");
                       num=num+1;
                       break;
                default:System.out.println("Elección incorrecta, elija una de las siguientes opciones"
            + "(1)Seguir utilizando el programa (2) Salir del programa");
            break;}
            if (num!=0){}
            else{
            if(num5<1 || num5>5){}
            else{System.out.println("Elija una de las siguientes opciones"
            + "(1) Seguir utilizando el programa (2) Salir del programa");}
    num4=teclado.nextInt();
    if(num4<=0 || num4 >=3){System.out.println("Error");}
    else{if(num4==1){System.out.println("Volviendo al inicio del programa");}
    else{if(num4==2){System.out.println("Saliendo del programa");
            num=num+1;}}}}}
}}
