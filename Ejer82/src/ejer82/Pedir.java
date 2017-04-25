/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer82;

import java.util.Scanner;

/**
 * Clase Pedir
 * @author Cristian
 */
public class Pedir {
   
    private int num;
   
    /**
     * Pediremos que se introduzca una cantidad
     */
    public void Intro(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la cantidad de dinero a ordenar: ");
    num=teclado.nextInt();}
    
    /**
     *
     * @param num cantidad de dinero introducida
     */
    public void SetNum(int num){
    this.num=num;}
    
    /**
     *
     * @return devolvera la cantidad de dinero introducida
     */
    public int GetNum(){
    return num;}
}
