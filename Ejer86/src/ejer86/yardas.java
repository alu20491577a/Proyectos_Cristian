/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class yardas {

Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in); 

private String opcion;
private float num1;

public void intro(){
System.out.println("Introduzca la unidad de medida a la que transformar "
        + "pulgadas, cm o pies");
System.out.println("o escriba salir si quiere volver al primer menu");
opcion=teclado.nextLine();}

public void setint(String opcion){
this.opcion=opcion;}

public String getStr(){
return opcion;}

public void setnum(){
System.out.println("Introduzca la cantidad de pies");
num1=teclado2.nextInt();}

public int getnum(int num1){
return num1;}

public void ejec(){
    int num = 0;
    while (num==0){
        intro();
        System.out.println("");
        if (opcion.equals("salir")){}
        else {setnum();}
switch(opcion){
    case "pulgadas":System.out.println( num1 + " yarda(s) son(es) " + num1*36 + " pulgadas");
    break;
    case "pies":System.out.println( num1 + " yarda(s) son(es) " + num1*3 + " pies");
    break;
    case "cm":System.out.println( num1 + " yarda(s) son(es) " + num1*91.44 + "cm");
    break;
    case "salir":
        num=9;
    break;
    default:System.out.println("Elección erronea");
    break;}}}

}
