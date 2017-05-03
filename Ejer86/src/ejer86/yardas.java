/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 *Clase yardas
 * @author Cristian
 */
public class yardas {




private String opcion;
private float num1;

    /**
     * Inicio de la clase
     */
    public void intro(){Scanner teclado = new Scanner(System.in);
System.out.println("Introduzca la unidad de medida a la que transformar "
        + "pulgadas, cm o pies");
System.out.println("o escriba salir si quiere volver al primer menu");
opcion=teclado.nextLine();}

    /**
     *
     * @param opcion valor de la medida a la que deseamos transformar
     */
    public void setint(String opcion){
this.opcion=opcion;}

    /**
     *
     * @return devolvera el valor introducido anteriormente
     */
    public String getStr(){
return opcion;}

    /**
     * Pediremos la cantidad a transformar
     */
    public void setnum(){Scanner teclado2 = new Scanner(System.in);
System.out.println("Introduzca la cantidad de yardas");
num1=teclado2.nextInt();}

    /**
     *
     * @param num1 valor que le daremos para transformar
     * @return devolvera el valor introducido anteriormente
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
