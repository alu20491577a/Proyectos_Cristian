/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 * Clase cm
 * @author Cristian
 */
public class cm {
    
private String opcion;
private float num1;

    /**
     * Introducción de unidades
     */

    public void intro(){Scanner teclado = new Scanner(System.in);
System.out.println("");
System.out.println("Introduzca la unidad de medida a la que transformar "
        + "pulgadas, pies o yardas");
System.out.println("o escriba salir si quiere volver al primer menu");
opcion=teclado.nextLine();}

    /**
     *
     * @param opcion variable para escoger a que unidad transformar
     */
    
    public void setint(String opcion){
this.opcion=opcion;}

    /**
     *
     * @return devolvera la variable introducida anteriormente
     */
    
    public String getStr(){
return opcion;}

    /**
     * Introduciremos la cantidad a desglosar
     */
    
    public void setnum(){Scanner teclado2 = new Scanner(System.in); 
System.out.println("Introduzca la cantidad de cm");
num1=teclado2.nextInt();}

    /**
     *
     * @param num1 cantidad a desglosar
     * @return devolvera la cantidad introducida
     */
    public int getnum(int num1){
return num1;}

    /**
     *Menu para las conversiones de unidades
     */
    
    public void ejec(){
    int num = 0;
    while (num==0){
        intro();
        System.out.println("");
        if (opcion.equals("salir")){}
        else {setnum();}
switch(opcion){
    case "pulgadas":System.out.println("");
    System.out.println( num1 + " cm(s) son(es) " + num1*0.393700787 + " pulgadas");
    System.out.println("");
    break;
    case "yardas":System.out.println("");
    System.out.println( num1 + " cm(s) son(es) " + num1*0.010936133 + " yardas");
    System.out.println("");
    break;
    case "pies":System.out.println("");
    System.out.println( num1 + " cm(s) son(es) " + num1*0.032808399 + "pies");
    System.out.println("");
    break;
    case "salir":
        num=9;
        System.out.println("");
    break;
    default:System.out.println("Elección erronea");
    System.out.println("");    
    break;}}}

}
