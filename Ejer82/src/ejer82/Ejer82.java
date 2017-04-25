/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer82;

import java.util.Scanner;

/**
 * Clase principal
 * @author Cristian
 */
public class Ejer82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int num1;
    int num2;
    Pedir p1 = new Pedir();
    Money m1 = new Money();
    p1.Intro();
    num1=p1.GetNum();
    num2=m1.SetNum1(num1);
    m1.Orden(num1);
    m1.Resultado();}
}
