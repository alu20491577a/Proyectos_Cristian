/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer81;

/**
 *
 * @author Cristian
 */
public class Sphere {
    
private int num1;
private float num2;

public float area(int num1){
this.num1=num1;
num2=(float) ((4/3)*Math.PI*Math.pow(num1,2));
return num2;}

public float volumen(int num1){
this.num1=num1;
num2=(float) ((4/3)*Math.PI*Math.pow(num1,3));
return num2;}}

