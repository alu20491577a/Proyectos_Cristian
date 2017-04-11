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
     * @param num1
     * @param num2 */

public division(float num1,float num2){
this.num1=num1;
this.num2=num2;
num3=num1/num2;}

public float getnum1(){
return num1;}

public float getnum2(){
return num2;}

/** y mediante un return devolveremos el resultado
     * @return devolvera el resultado  */

    public float getnum3(){
return num3;}
    
}
