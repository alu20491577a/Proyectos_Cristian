/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer80;

import java.util.Scanner;

/**
 * Clase principal. Ejercicio del cubo
 * @author Cristian
 */
public class Ejer80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int num1;
    System.out.println("Introduce el lado del cubo");
    num1=teclado.nextInt();
    area a1 = new area();
    System.out.println("El area total del cubo es " + a1.area(num1) + " cm3");}
    
}
