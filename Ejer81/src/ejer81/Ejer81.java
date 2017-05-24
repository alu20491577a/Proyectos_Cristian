/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer81;

import java.util.Scanner;

/**
 *Clase principal
 * @author Cristian
 */
public class Ejer81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
    
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
    int num1;
    int num2;
    float num3;
    System.out.println("Introduce el radio de la esfera");
    num1=teclado.nextInt();
    Sphere s1 = new Sphere();
    System.out.println("El area de la esfera es "+ s1.area(num1) + " cm2");
    System.out.println("El volumen de la esfera es "+ s1.volumen(num1) + " cm3");}
    }
