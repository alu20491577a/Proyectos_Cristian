/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer78;

import java.util.Scanner;

/**
 * Clase principal. Ejercicio del triangulo
 * @author Cristian
 */
public class Ejer78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
    int num1;
    int num2;
    float num3;
    System.out.println("Introduce la base del triangulo");
    num1=teclado.nextInt();
    System.out.println("Introduce la altura del triangulo");
    num2=teclado2.nextInt();
    area a1 = new area(num1,num2);
    System.out.println("El area del triangulo es "+ a1.getnum3() + " cm2" );}
    
}
