/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer90;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class libro {   
    
private String titulo;
private String ISBN;
private String Editorial;
private int ejemplares=3;  
private String autor;
    
public void libro(String titulo, String ISBN, String Editorial, String autor){
this.titulo=titulo;
this.ISBN=ISBN;
this.Editorial=Editorial;
this.autor=autor;}
    
public void prestamo(){
if(ejemplares==0){}
else{ejemplares=ejemplares-1;}}

public void devolucion(){
if(ejemplares==3){}
else{ejemplares=ejemplares+1;}
}

public void settitulo(String titulo){
this.titulo=titulo;}

public void setISBN(String ISBN){
this.ISBN=ISBN;}

public void setEditorial(String Editorial){
this.Editorial=Editorial;}

public void setautor(String autor){
this.autor=autor;}

public void setejemplares(int ejemplares){
this.ejemplares=ejemplares;}

public String gettitulo(){
return titulo;}

public String titulo(){
System.out.println(titulo);
return titulo;}

public String getISBN(){
return ISBN;}

public String getEditorial(){
return Editorial;}

public String getautor(){
return autor;}

public int getejemplares(){
return ejemplares;}

public void alta(){
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    Scanner teclado3 = new Scanner(System.in);
    Scanner teclado4 = new Scanner(System.in);
    System.out.println("Introduzca el titulo del libro");
titulo=teclado.nextLine();
    System.out.println("Introduzca el ISBN del libro");
ISBN=teclado2.next();
    System.out.println("Introduzca la editorial del libro");
Editorial=teclado3.next();
    System.out.println("Introduzca el autor del libro");
autor=teclado4.next();
ejemplares=3;
libro(titulo, ISBN,  Editorial, autor);    
System.out.println("El libro " + titulo + " fue dado de alta satisfactoriamente");}

public void baja(){
    System.out.println("El libro " + titulo + " fue dado de baja satisfactoriamente");
settitulo(null);
setautor(null);
setejemplares(0);
setEditorial(null);
setISBN(null);}
}
