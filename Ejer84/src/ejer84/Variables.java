/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer84;

import java.util.Scanner;

/**
 * Clase Variables
 * @author Cristian
 */
public class Variables {

private int cateto;
private int cateto2;
   
    /**
     *Pediremos el primer cateto del triangulo
     */

    public void cateto(){Scanner teclado = new Scanner(System.in);
    System.out.println("Dame el primer cateto ");
    cateto=teclado.nextInt();}
    
    /**
     * Pediremos el segundo cateto del triangulo
     */
    
    public void cateto2(){Scanner teclado2 = new Scanner(System.in);
    System.out.println("Dame el segundo cateto ");
    cateto2=teclado2.nextInt();}

    /**
     * 
     * @return devolvera el primer cateto del triangulo
     */
    
    public int getcateto(){
return cateto;}
 
    /**
     *
     * @return devolvera el segundo cateto del triangulo
     */
    public int getcateto2(){
return cateto2;}

}
