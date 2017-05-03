/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer85;

import java.util.Scanner;

/**
 * Clase cantidad
 * @author Cristian
 */
public class cantidad {


private int num;

    /**
     * Introduciremos la cantidad en segundos a desglosar
     */

    public void intro(){Scanner teclado = new Scanner (System.in);
System.out.println("Introduce la cantidad de segundos a ordenar:");
num=teclado.nextInt();}

    /**
     *
     * @param num es la variable que guardara la cantidad a desglosar
     */
    
    public void setnum(int num){
this.num=num;}

    /**
     *
     * @return devolvera la cantidad introducida anteriormente
     */
    
    public int getnum(){
return num;}
        }
