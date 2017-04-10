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
public class menu {
    
Scanner teclado = new Scanner(System.in);

private String opcion;

public void intro(){
System.out.println("Introduzca la unidad de medida en la que quiere trabajar "
        + "pies, pulgadas, cm o yardas");
System.out.println("Introduzca salir si quiere salir del programa");
opcion=teclado.nextLine();}

public void setint(String opcion){
this.opcion=opcion;}

public String getStr(){
return opcion;}}
