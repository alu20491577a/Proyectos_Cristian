/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer90;

/**
 *
 * @author Cristian
 */
public class Ejer90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    libro l1 = new libro();
    libro l2 = new libro();
    libro l3 = new libro();
    libro l4 = new libro();
    libro l5 = new libro();
    l1.libro("El mundo del hardware", "5435168", "Pear", "Anonimo");
    l2.libro("C++ and you", "1387645", "Pear", "Gabriel Keyboard");
    l3.libro("Haciendose rico con la informática", "4876879", "Pear", "Bill Gates & Steve Jobs");
    Menu m1 = new Menu();
    m1.intro(l1,l2,l3,l4,l5);
    m1.operacion(l1,l2,l3,l4,l5);}
}
