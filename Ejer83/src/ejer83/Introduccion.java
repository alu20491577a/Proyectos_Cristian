/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer83;

import java.util.Scanner;

/**
 * Clase Introducción
 * @author Cristian
 */
public class Introduccion {

  
private int x2;
private int x;
private int num;
private float raiz;

/** Se pediran las 3 variables de la ecuación */

    public void x2(){
   Scanner teclado = new Scanner(System.in);
    System.out.println("Dame a (x2) ");
    x2=teclado.nextInt();}
    
    public void x(){
    Scanner teclado2 = new Scanner(System.in);
    System.out.println("Dame b (x) ");
    x=teclado2.nextInt();}
    
    public void num(){
    Scanner teclado3 = new Scanner(System.in);
    System.out.println("Dame c (numero) ");
    num=teclado3.nextInt();}
    
    /**
     *
     * @param x2 parte x² de la ecuación
     */
    
    public void SetX2(int x2){
    this.x2=x2;}
    
    /**
     *
     * @param x parte x de la ecuación
     */
    
    public void SetX(int x){
    this.x=x;}

    /**
     *
     * @param num parte numérica de la ecuación
     */
    
    public void SetNum(int num){
    this.num=num;}
    
    public int GetX2(){
    return x2;}
    
    public int GetX(){
    return x;}
    
    public int GetNum(){
    return num;}
    
    /**
     *
     * @return devolvera el valor de la raiz de la ecuación
     */
    public float Raiz(){
    raiz = (float)(Math.pow(x,2) + (-4*x2*num));
    return raiz;}
}
