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

public int SetX2(int x2){
this.x2=x2;
return x2;}

public int SetX(int x){
this.x=x;
return x;}

public float Setraiz(float raiz){
this.raiz=raiz;
return raiz;}

public float SetRes1(){
this.Res1=((-x)-raiz)/(2*x2);
return Res1;}

public float SetRes2(){
this.Res2=((-x)+raiz)/(2*x2);
return Res2;}}