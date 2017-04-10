/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer77;

/**
 *
 * @author Cristian
 */
public class Area {
    
    private final float num1;
    private final float num3;
    
    public Area(float num1){
    this.num1=num1;
    num3=(float) (num1*num1*Math.PI);}

    public float getnum3(){
    return num3;}
}
