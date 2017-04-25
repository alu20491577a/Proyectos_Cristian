/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;

/**
 * Clase area
 * @author Cristian
 */
public class area {
    
    private int num1;
    private int num2;
    private int num3;
    private float num4;
    private float num5;
    
    /** Este constructor recibira los parametros de la clase principal
     para calcular el perimetro
     * @param num1 lado del pentagono a calcular
     * @return devolvera el perimetro (num2) */
    
    public int perimetro(int num1){
    this.num1=num1;
    num2=num1*5;
    return num2;}
    
    /** Este constructor recibira los parametros de la clase principal
     para calcular el apotema
     * @param num1 lado del pentagono a calcular
     * @param num3 radio del pentagono a calcular
     * @return devolvera el apotema (num4)  */
    
    public float apotema(int num1,int num3){
    this.num3=num3;
    num4=(int) Math.sqrt((Math.pow(num3,2)-Math.pow((num1/2),2)));
    return num4;}

    /** Este constructor recibira los parametros de la clase principal
     para calcular el area
     * @param num2 perimetro calculado del pentagono
     * @param num4 apotema calculado del pentagono
     * @return devolvera el area del pentagono (num5)  */
    
    public float area(int num2,int num4){
    num5=(num2*num4)/2;
    return num5;}
}
