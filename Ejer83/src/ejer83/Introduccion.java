/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer83;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Introduccion {

    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    Scanner teclado3 = new Scanner(System.in);
    
private int x2;
private int x;
private int num;
private float raiz;

    public void x2(){
    System.out.println("Dame a (x2) ");
    x2=teclado.nextInt();}
    
    public void x(){
    System.out.println("Dame b (x) ");
    x=teclado2.nextInt();}
    
    public void num(){
    System.out.println("Dame c (numero) ");
    num=teclado3.nextInt();}
    
    public void SetX2(int x2){
    this.x2=x2;}
    
    public void SetX(int x){
    this.x=x;}

    public void SetNum(int num){
    this.num=num;}
    
    public int GetX2(){
    return x2;}
    
    public int GetX(){
    return x;}
    
    public int GetNum(){
    return num;}
    public float Raiz(){
    raiz = (float)(Math.pow(x,2) + (-4*x2*num));
    return raiz;}
}