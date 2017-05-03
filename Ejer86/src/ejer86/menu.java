/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

import java.util.Scanner;

/**
 * Clase menu. Inicio del programa
 * @author Cristian
 */
public class menu {
    


private String opcion;

    /**
     * Pediremos en primer lugar la unidad con la que escoger
     */
    public void intro(){Scanner teclado = new Scanner(System.in);
System.out.println("Introduzca la unidad de medida en la que quiere trabajar "
        + "pies, pulgadas, cm o yardas");
System.out.println("Introduzca salir si quiere salir del programa");
opcion=teclado.nextLine();}

    /**
     *
     * @param opcion parametro que le pasaremos anteriormente 
     */
    public void setint(String opcion){
this.opcion=opcion;}

    /**
     *
     * @return devolvera el parametro que le introduzcamos
     */
    public String getStr(){
return opcion;}}
