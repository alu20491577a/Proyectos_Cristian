/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer93;

import static java.lang.Double.max;
import java.util.ArrayList;

/**
 * Clase principal
 * @author Cristian
 */
public class Ejer93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <libro> libreria= new ArrayList();
    libro l1 = new libro();
    libro l2 = new libro();
    libro l3 = new libro();
    libro l4 = new libro();
    libro l5 = new libro();
    l1.libro("El mundo del hardware", "5435168", "Pear", "Anonimo");
    l2.libro("C++ and you", "1387645", "Pear", "Gabriel Keyboard");
    l3.libro("Haciendose rico con la informática", "4876879", "Pear", "Bill Gates & Steve Jobs");
    libreria.add(l1);
    libreria.add(l2);
    libreria.add(l3);
    libreria.add(l4);
    libreria.add(l5);
    Menu m1 = new Menu();
    m1.intro(libreria);
    m1.operacion(libreria);}    
}
