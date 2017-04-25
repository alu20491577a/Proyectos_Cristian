/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer78;

/**
 * Clase Area
 * @author Cristian
 */
public class area {
    private int num1;
    private int num2;
    private float num3;
    
    /** Mediante este constructor recibiremos los datos
     * de la clase principal y conseguiremos el area del triangulo
     * @param num1 base del triangulo a calcular
     * @param num2 altura del triangulo a calcular */
    
public area(int num1,int num2){
this.num1=num1;
this.num2=num2;
num3=num1*num2/2;}

    /**
     *
     * @return devolvera el resultado del area
     */
    public float getnum3(){
return num3;}}
