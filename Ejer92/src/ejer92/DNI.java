/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer92;

import java.util.Scanner;

/**
 * Clase DNI
 * @author Cristian
 */
public class DNI {
    
    private int DNI;
    private int resto;
    private String letra;
   
    /**
     * Introduciremos la parte numérica del DNI para poder usarla en calculos
     */
    public void DNI(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Introduce la parte numerica de tu DNI");
    DNI = teclado.nextInt();
    resto = DNI%23;}
    
    /**
     * Devolvera el valor de la variable DNI
     * @return devolvera DNI
     */
    public int getDNI(){
    return DNI;}

    /**
     * Igualara letra a la letra que le introduzcamos cuando usemos el constructor
     * @param letra Letra que tendra el DNI
     */
    
    public void letra(String letra){
    this.letra=letra;
    System.out.println("Tu DNI completo es: " + DNI + letra);}
    
    /**
     * Metodo principal para obtener la letra del DNI a partir de la parte
     * numérica
     */
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
