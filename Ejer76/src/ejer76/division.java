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

/** Clase división */
public class division {
    
private final float num1;
private final float num2;
private final float num3;

 /** Mediante este constructor podremos recibir los datos del programa principal
     y podremos calcular la división
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación
     * la operación devolvera la división de los dos números*/

public division(float num1,float num2){
this.num1=num1;
this.num2=num2;
num3=num1/num2;}

public float getnum1(){
return num1;}

public float getnum2(){
return num2;}

    /**
     *
     * @return devolvera el resultado de la división
     */

    public float getnum3(){
return num3;}
    
}
