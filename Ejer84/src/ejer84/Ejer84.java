/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer84;

/**
 * Clase principal. Teorema de pitágoras
 * @author Cristian
 */
public class Ejer84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int cateto;
    int cateto2;
        
    Variables v1 = new Variables();
    operacion o1 = new operacion();
    v1.cateto();
    v1.cateto2();
    cateto=v1.getcateto();
    cateto2=v1.getcateto2();
    // Los dos valores siguientes
    // nunca son utilizados en las operaciones del main,
    // no obstante son necesarios a la hora de realizar la operación que se
    // ejecutara en la clase llamada Ecuacion
    cateto=o1.setcateto(cateto);
    cateto2=o1.setcateto2(cateto2);
    System.out.println("La hipotenusa es: " + o1.resultado());
    }
    
}
