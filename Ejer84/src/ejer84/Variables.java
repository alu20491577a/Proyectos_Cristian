/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer84;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Variables {
  
Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in);
    
private int cateto;
private int cateto2;
   
 public void cateto(){
    System.out.println("Dame el primer cateto ");
    cateto=teclado.nextInt();}
    
public void cateto2(){
    System.out.println("Dame el segundo cateto ");
    cateto2=teclado2.nextInt();}

public int getcateto(){
return cateto;}

public int getcateto2(){
return cateto2;}

}
