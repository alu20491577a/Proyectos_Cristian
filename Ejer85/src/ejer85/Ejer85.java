/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer85;

/**
 * Clase Principal. Desglosar tiempo
 * @author Cristian
 */
public class Ejer85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int num;
    double num2;
        
    cantidad c1 = new cantidad();
    orden o1 = new orden();
    c1.intro();
    num=c1.getnum();
    num2=o1.SetNum1(num);
    o1.order(num);
    o1.resultado();}
    
}
