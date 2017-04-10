/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejer79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    float num4;
    System.out.println("Cual es el lado del pentagono a calcular");
    num1=teclado.nextInt();
    System.out.println("Cual es el radio del pentagono a calcular");
    num3=teclado2.nextInt();
    area a1 = new area();
    num2=a1.perimetro(num1);
    num4=a1.apotema(num1,num3);
    System.out.println("El area del pentagono es: " + a1.area(num2, (int) num4) + " cm2");}
}
