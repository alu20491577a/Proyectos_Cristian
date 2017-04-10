/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer84;

/**
 *
 * @author Cristian
 */
public class operacion {
    
    private int cateto;
    private int cateto2;
    private float hipotenusa;
    
    public int setcateto(int cateto){
    this.cateto=cateto;
    return cateto;}
    
    public int setcateto2(int cateto2){
    this.cateto2=cateto2;
    return cateto2;}
    
    public float resultado(){
    hipotenusa=(float)Math.sqrt(Math.pow(cateto,2)+Math.pow(cateto2,2));
    return hipotenusa;}
}
