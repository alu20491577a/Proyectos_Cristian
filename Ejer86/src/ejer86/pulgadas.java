/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 * Clase pulgadas
 * @author Cristian
 */
public class pulgadas {

Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in); 

private String opcion;
private float num1;

    /**
     *Inicio de la clase introduciremos la unidad a la que transformar
     */
    public void intro(){
System.out.println("Introduzca la unidad de medida a la que transformar "
        + "pies, cm o yardas");
System.out.println("o escriba salir si quiere volver al primer menu");
opcion=teclado.nextLine();}

    /**
     *
     * @param opcion valor que le daremos a la opción presentada anteriormente
     */
    public void setint(String opcion){
this.opcion=opcion;}

    /**
     *
     * @return devolvera el valor anteriormente introducido
     */
    public String getStr(){
return opcion;}

    /**
     * Introducción del valor númerico a transformar
     */
    public void setnum(){
System.out.println("Introduzca la cantidad de pulgadas");
num1=teclado2.nextInt();}

    /**
     *
     * @param num1 valor númerico introducido anteriormente
     * @return devolvera el valor númerico introducido
     */
    public int getnum(int num1){
return num1;}

    /**
     * Menu principal de la clase
     */
    public void ejec(){
    int num = 0;
    while (num==0){
        intro();
        System.out.println("");
        if (opcion.equals("salir")){}
        else {setnum();}
switch(opcion){
    case "pies":System.out.println( num1 + " pulgada(s) son(es) " + num1*0.0833333333 + " pies");
    break;
    case "yardas":System.out.println( num1 + " pulgada(s) son(es) " + num1*0.0277777778 + " yardas");
    break;
    case "cm":System.out.println( num1 + " pulgada(s) son(es) " + num1*2.54 + "cm");
    break;
    case "salir":
        num=9;
    break;
    default:System.out.println("Elección erronea");
    break;}}}

}    

    