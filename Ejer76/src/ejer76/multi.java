/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer76;

/**
 *
 * @author cristian
 */

/** Clase multiplicación */
public class multi {
    
private final int num1;
private final int num2;
private final int num3;

/** Mediante este constructor podremos recibir los datos del programa principal
     y podremos calcular la multiplicación
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación */

public multi(int num1, int num2){
this.num1=num1;
this.num2=num2;
num3=num1*num2;}

public int getnum1(){
return num1;}

public int getnum2(){
return num2;}

    /**
     *
     * @return devolvera el resultado de la multiplicación
     */

    public int getnum3(){
return num3;}}
