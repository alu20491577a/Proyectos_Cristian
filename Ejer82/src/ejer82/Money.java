/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer82;

/**
 *
 * @author Cristian
 */
public class Money {
    
private int num1;
private int [] cocientes = new int [9];
private int [] restos = new int [9];
private int [] divisores = new int [] {500,200,100,50,20,10,5,2,1};

public int SetNum1(int num1){
this.num1=num1;
return num1;}

public int GetNum1(){
return num1;}

public void Orden(int num1){
for(int i=0; i<9; i++){
cocientes[i]=num1/divisores[i];
restos[i]=num1-(cocientes[i]*divisores[i]);
num1=num1-(cocientes[i]*divisores[i]);}}

public void Resultado(){
for(int i=0; i<7; i++){
System.out.println("La cantidad de billetes de " + divisores[i] +  " es de " + cocientes[i]);   
}
for (int i=7; i<9;i++){
System.out.println("La cantidad de monedas de " + divisores[i] +  " es de " + cocientes[i]);}}}


