/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer89;

import java.util.Scanner;

/**
 * Clase contador
 * @author Cristian
 */
public class Contador {
    private int num;
    private int contador;
    private int contador2;
    Scanner teclado = new Scanner(System.in);
    
    /**
     * Constructor vacio
     */
    public Contador(){
}

    /**
     * Constructor con el que iniciaremos los dos contadores del programa.
     */
    public void iniciar(){
System.out.println("El primer contador comenzara en el número 0");
contador=0;
System.out.println("El segundo contador comenzara en el número 100");
contador2=100;}

    /**
     *Este constructor nos devolvera el primer contador
     * @return
     */
    public int getcontador(){
return contador;}

    /**
     *Este constructor nos devolvera el segundo contador
     * @return
     */
    public int getcontador2(){
return contador2;}

    /**
     *Constructor para copiar contadores
     * @param contador contador que introduciremos para usar el constructor
     */
    public int copy(int contador){
    this.contador=contador;
    return contador;}
    
    /**
     * Utilizaremos este constructor para disminuir la cantidad del contador 
     * @param contador contador que introduciremos para usar el constructor
     * @return
     */
    public int disminuir(int contador){
System.out.println("Escoge la cantidad a disminuir");
num=teclado.nextInt();
for(int i=0 ; i<num ; i++){
contador=contador-1;}
return contador;}

     

    /**
     * Utilizaremos este constructor para incrementar la cantidad del contador 
     * @param contador contador que introduciremos para usar el constructor
     * @return
     */

    public int incrementar(int contador){
System.out.println("Escoge la cantidad a incrementar");
num=teclado.nextInt();
for(int i=0 ; i<num ; i++){
contador=contador+1;}
return contador;}}
