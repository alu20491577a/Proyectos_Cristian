/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer85;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class cantidad {

Scanner teclado = new Scanner (System.in);
private int num;

public void intro(){
System.out.println("Introduce la cantidad de segundos a ordenar:");
num=teclado.nextInt();}

public void setnum(int num){
this.num=num;}

public int getnum(){
return num;}
        }
