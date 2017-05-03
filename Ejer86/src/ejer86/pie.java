/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 *Clase pie
 * @author Cristian
 */
public class pie {




private String opcion;
private float num1;

    /**
     * Introduciremos la medida a la que transformar las unidades
     */
    public void intro(){Scanner teclado = new Scanner(System.in);
System.out.println("Introduzca la unidad de medida a la que transformar "
        + "pulgadas, cm o yardas");
System.out.println("o escriba salir si quiere volver al primer menu");
opcion=teclado.nextLine();}

    /**
     *
     * @param opcion valor que le daremos anteriormente
     */
    public void setint(String opcion){
this.opcion=opcion;}

    /**
     *
     * @return devolvera el valor que le hayamos dado
     */
    public String getStr(){
return opcion;}

    /**
     * Introduciremos la cantidad que queremos transformar
     */
    public void setnum(){Scanner teclado2 = new Scanner(System.in);
System.out.println("Introduzca la cantidad de pies");
num1=teclado2.nextInt();}

    /**
     *
     * @param num1 valor de la cantidad que queremos transformar
     * @return devolvera el valor introducido
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
    case "pulgadas":System.out.println( num1 + " pie(s) son(es) " + num1*12 + " pulgadas");
    break;
    case "yardas":System.out.println( num1 + " pie(s) son(es) " + num1/3 + " yardas");
    break;
    case "cm":System.out.println( num1 + " pie(s) son(es) " + num1*30.48 + "cm");
    break;
    case "salir":
        num=9;
    break;
    default:System.out.println("Elección erronea");
    break;}}} 
}
