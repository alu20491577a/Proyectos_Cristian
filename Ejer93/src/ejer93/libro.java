/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer93;

import java.util.Scanner;

/**
 * Clase libro
 * @author Cristian
 */
public class libro {   
    
private String titulo;
private String ISBN;
private String Editorial;
private int ejemplares=3;  
private String autor;
    
    /**
     *Constructor en el que introduciremos los datos de los libros
     * @param titulo titulo del libro
     * @param ISBN ISBN del libro
     * @param Editorial Editorial del libro
     * @param autor autor del libro
     */
    public void libro(String titulo, String ISBN, String Editorial, String autor){
this.titulo=titulo;
this.ISBN=ISBN;
this.Editorial=Editorial;
this.autor=autor;}
    
    /**
     * Constructor que utilizaremos para ejecutar la operación de prestar 
     * libros a usuarios
     */
    public void prestamo(){
if(ejemplares==0){}
else{ejemplares=ejemplares-1;}}

    /**
     *Constructor que utilizaremos para ejecutar la operación de la 
     * devolución de los libros prestados a los usuarios
     */
    public void devolucion(){
if(ejemplares==3){}
else{ejemplares=ejemplares+1;}
}

    /**
     *Constructor copia que copiara el titulo de un libro
     * @param titulo titulo del libro
     */
    public void settitulo(String titulo){
this.titulo=titulo;}

    /**
     *Constructor copia que copiara el ISBN de un libro
     * @param ISBN ISBN del libro
     */
    public void setISBN(String ISBN){
this.ISBN=ISBN;}

    /**
     *Constructor copia que copiara la editorial de un libro
     * @param Editorial editorial del libro
     */
    public void setEditorial(String Editorial){
this.Editorial=Editorial;}

    /**
     *Constructor copia que copiara el autor de un libro
     * @param autor autor del libro
     */
    public void setautor(String autor){
this.autor=autor;}

    /**
     * Constructor copia que copiara la cantidad de ejemplares de un libro
     * @param ejemplares ejemplares del libro
     */
    public void setejemplares(int ejemplares){
this.ejemplares=ejemplares;}

    /**
     *Constructor que nos devolvera el titulo de un libro
     * @return devolvera el titulo del libro
     */
    public String gettitulo(){
return titulo;}

    /**
     * Constructor que nos devolvera el ISBN de un libro
     * @return devolvera el ISBN del libro
     */
    public String getISBN(){
return ISBN;}

    /**
     * Constructor que nos devolvera la editorial de un libro
     * @return devolvera la editorial del libro
     */
    public String getEditorial(){
return Editorial;}

    /**
     * Constructor que nos devolvera el autor de un libro
     * @return devolvera el autor del libro
     */
    public String getautor(){
return autor;}

    /**
     * Constructor que nos devolvera los ejemplares de un libro
     * @return devolvera los ejemplares del libro
     */
    public int getejemplares(){
return ejemplares;}

    /**
     *Constructor que utilizaremos para dar de alta un libro de nuestra 
     * biblioteca
     */
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

    /**
     * Constructor que utilizaremos para dar de baja un libro de nuestra 
     * biblioteca
     */
    public void baja(){
    System.out.println("El libro " + titulo + " fue dado de baja satisfactoriamente");
settitulo(null);
setautor(null);
setejemplares(0);
setEditorial(null);
setISBN(null);}
    
}
