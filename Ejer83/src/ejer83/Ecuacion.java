/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer83;

/**
 *
 * @author Cristian
 */
public class Ecuacion {
    
private float raiz;
private int x2;
private int x;
private float Res1;
private float Res2;

    /**
     *
     * @param x2 parte x² de la ecuación
     * @return devuelve x2
     */
    public int SetX2(int x2){
this.x2=x2;
return x2;}

    /**
     *
     * @param x parte x de la ecuación
     * @return devuelve x
     */
    public int SetX(int x){
this.x=x;
return x;}

    /**
     *
     * @param raiz raiz de la ecuación de 2o grado
     * @return la raiz
     */
    public float Setraiz(float raiz){
this.raiz=raiz;
return raiz;}

    /**
     *
     * @return devolvera el resultado en el caso de sumar la raiz en la ecuación
     */
    
    public float SetRes1(){
this.Res1=((-x)-raiz)/(2*x2);
return Res1;}

    /**
     *
     * @return devolvera el resultado en el caso de restar la raiz en la ecuación
     */
    public float SetRes2(){
this.Res2=((-x)+raiz)/(2*x2);
return Res2;}}