/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer82;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Pedir {
   
    private int num;
   
    public void Intro(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la cantidad de dinero a ordenar: ");
    num=teclado.nextInt();}
    
    public void SetNum(int num){
    this.num=num;}
    
    public int GetNum(){
    return num;}
}
