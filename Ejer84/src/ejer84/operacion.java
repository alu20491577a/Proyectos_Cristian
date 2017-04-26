/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer84;

/**
 * Clase operación
 * @author Cristian
 */
public class operacion {
    
    private int cateto;
    private int cateto2;
    private float hipotenusa;
    
    /**
     *
     * @param cateto es la variable del primer cateto
     * @return devolvera la variable del primer cateto
     */
    
    public int setcateto(int cateto){
    this.cateto=cateto;
    return cateto;}
    
    /**
     *
     * @param cateto2 es la variable del segundo cateto
     * @return devolvera la variable del segundo cateto
     */
    
    public int setcateto2(int cateto2){
    this.cateto2=cateto2;
    return cateto2;}
    
    /**
     * 
     * @return devolvera el resultado de la operación para hallar la
     * hipotenusa
     */
    
    public float resultado(){
    hipotenusa=(float)Math.sqrt(Math.pow(cateto,2)+Math.pow(cateto2,2));
    return hipotenusa;}
}
