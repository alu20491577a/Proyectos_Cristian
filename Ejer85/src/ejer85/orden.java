/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer85;

/**
 *
 * @author Cristian
 */
public class orden {

private double num1;    
private int [] cocientes = new int [5];
private int [] restos = new int [5];
private int [] divisores = new int [] {604800,86400,3600,60,1};
private String [] unidades = new String [] {"semanas","dias","horas","minutos","segundos"};

public double SetNum1(double num1){
this.num1=num1;
return num1;}

public double GetNum1(){
return num1;}

public void order(int num1){
for (int i=0; i<5; i++){
cocientes[i]=num1/divisores[i];
restos[i]=num1-(cocientes[i]*divisores[i]);
num1=num1-(cocientes[i]*divisores[i]);}}

public void resultado(){
for (int i=0; i<5; i++){
System.out.println("La cantidad de " + unidades[i] + " que tiene el número"
        + " introducido es de " + cocientes[i]);}}}


