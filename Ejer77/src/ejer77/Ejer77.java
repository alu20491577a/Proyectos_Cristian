/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer77;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejer77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    float num1;
    System.out.println("Introduzca el radio de la circunferencia a calcular");
    num1=teclado.nextInt();
    Area a1 = new Area(num1);
    Circunferencia c1 = new Circunferencia(num1);
    System.out.println("Los resultados son:");
    System.out.println("Area: " + a1.getnum3() + "cm2");
    System.out.println("Longitud: " + c1.getnum3() + "cm2");
    }
    
}
