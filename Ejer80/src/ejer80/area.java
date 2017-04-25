/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer80;

/**
 * Clase area
 * @author Cristian
 */
public class area {
    
private int num1;
private int num2;

    /**
     *
     * @param num1 lado del cubo a calcular
     * @return devolvera el area del cubo (num2)
     */
    public int area(int num1){
num2=(int) (Math.pow(num1,2)*6);
return num2;}}
