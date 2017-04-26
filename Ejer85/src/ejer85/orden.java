/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer85;

/**
 * Clase orden
 * @author Cristian
 */
public class orden {

    /** 
     * Crearemos 3 arrays.
     * cocientes sera un array de 5 huecos vacio
     * restos sera un array de 5 huecos vacio
     * divisores sera un array de 5 huecos iniciado con las valencias de tiempo
     */
    
private double num1;    
private int [] cocientes = new int [5];
private int [] restos = new int [5];
private int [] divisores = new int [] {604800,86400,3600,60,1};
private String [] unidades = new String [] {"semanas","dias","horas","minutos","segundos"};

    /**
     *
     * @param num1 es la variable en segundos a desglosar
     * @return devolvera la variable introducida
     */

    public double SetNum1(double num1){
this.num1=num1;
return num1;}

    /**
     *
     * @return devolvera la cantidad de tiempo
     */
    
    public double GetNum1(){
return num1;}

    /**
     *
     * @param num1 es la variable en segundos a desglosar
     * cocientes sera igual a la cantidad por cada uno de los divisores
     * restos sera igual a la cantidad menos los cocientes por los divisores
     * reiniciaremos num1 para que reste la cantidad extraida
     */

    public void order(int num1){
for (int i=0; i<5; i++){
cocientes[i]=num1/divisores[i];
restos[i]=num1-(cocientes[i]*divisores[i]);
num1=num1-(cocientes[i]*divisores[i]);}}

    /**
     * Resultado del desglose de unidades
     */
    
    public void resultado(){
for (int i=0; i<5; i++){
System.out.println("La cantidad de " + unidades[i] + " que tiene el número"
        + " introducido es de " + cocientes[i]);}}}


