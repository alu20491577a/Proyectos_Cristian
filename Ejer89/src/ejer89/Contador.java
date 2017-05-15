/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer89;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Contador {
    private int num;
    private int contador;
    private int contador2;
    Scanner teclado = new Scanner(System.in);
    
public Contador(){
}

public void iniciar(){
System.out.println("El primer contador comenzara en el número 0");
contador=0;
System.out.println("El segundo contador comenzara en el número 100");
contador2=100;}

public void inicio(){
contador=0;
contador2=100;}

public int getcontador(){
return contador;}

public int getcontador2(){
return contador2;}

public int disminuir(int contador){
System.out.println("Escoge la cantidad a disminuir");
num=teclado.nextInt();
for(int i=0 ; i<num ; i++){
contador=contador-1;}
return contador;}

public int incrementar(int contador){
System.out.println("Escoge la cantidad a incrementar");
num=teclado.nextInt();
for(int i=0 ; i<num ; i++){
contador=contador+1;}
return contador;}}
