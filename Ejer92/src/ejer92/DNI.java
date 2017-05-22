/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer92;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class DNI {
    
/* Declaramos variables */
    private int DNI;
    private int resto;
    private String letra;
    /* Introducimos variables */
   
    public void DNI(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Introduce la parte numerica de tu DNI");
    DNI = teclado.nextInt();
    resto = DNI%23;}
    
    public int getDNI(){
    return DNI;}

    public void letra(String letra){
    this.letra=letra;
    System.out.println("La letra de su DNI es: " + letra);}
    
    public void calculo(){
    if (DNI > 99999999){System.out.println("Error");}
    else{switch (resto){
        case 0:letra("T");
        break;
        case 1:letra("R");
        break;
        case 2:letra("W");
        break;
        case 3:letra("A");
        break;
        case 4:letra("G");
        break;
        case 5:letra("M");
        break;
        case 6:letra("Y");
        break;
        case 7:letra("F");
        break;
        case 8:letra("P");
        break;
        case 9:letra("D");
        break;
        case 10:letra("X");
        break;
        case 11:letra("B");
        break;
        case 12:letra("N");
        break;
        case 13:letra("J");
        break;
        case 14:letra("Z");
        break;
        case 15:letra("S");
        break;
        case 16:letra("Q");
        break;
        case 17:letra("V");
        break;
        case 18:letra("H");
        break;
        case 19:letra("L");
        break;
        case 20:letra("C");
        break;
        case 21:letra("K");
        break;
        case 22:letra("E");
        break;
        default:System.out.println("Error");}}}}
