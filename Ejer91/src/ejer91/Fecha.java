/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer91;

import java.util.Scanner;

/**
 * Clase Fecha
 * @author Cristian
 */
public class Fecha {
    
    /**
     * Clase vacia
     */
    public void fecha(){

}
    private int dia;
    private int mes;
    private int año;
    private boolean bisiesto;
    private int resto;
    private int resto2;
    private int num=0;
    private int num2=0;
    private int num3=0;
    
    /**
     * Clase principal donde introduciremos la fecha que queramos
     */
    public void intro(){
System.out.println("Introduce el dia");
while(num==0){Scanner teclado = new Scanner(System.in);
dia=teclado.nextInt();
if (dia<1 || dia >31){System.out.println("El dia introducido es incorrecto"
        + " introduzca un dia correcto");}
else num=9;}
System.out.println("Introduce el mes");
while(num2==0){
Scanner teclado2 = new Scanner(System.in);
mes=teclado2.nextInt();
if (mes<1 || mes>12){System.out.println("El mes introducido es incorrecto"
        + " introduzca un mes correcto");}
else{num2=9;}}
System.out.println("Introduce el año");
Scanner teclado3= new Scanner(System.in);
año=teclado3.nextInt();
resto=año%4;
resto2=año%100;
if(resto!=0){bisiesto=false;}
else {if(resto2==0){bisiesto=false;}
else{bisiesto=true;}}
num=0;num2=0;}

    /**
     * Clase que devolvera el valor del dia
     * @return devolvera dia
     */
    public int getdia(){
return dia;}

    /**
     * Ckase que devolvera el valor del mes
     * @return devolvera mes
     */
    public int getmes(){
return mes;}

    /**
     * Clase que devolvera el valor del año
     * @return devolvera año
     */
    public int getaño(){
return año;}

    /**
     * Clase que devolvera el valor del boolean bisiesto
     * @return devolvera true or false dependiendo de la operación
     */
    public boolean getbisiesto(){
return bisiesto;}
}
