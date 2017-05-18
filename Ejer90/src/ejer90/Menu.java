/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer90;

import java.util.Scanner;

/**
 * Clase Menu
 * @author Cristian
 */
public class Menu {
    
    private int opción;
            
    /**
     *Introduciremos el libro con el que deseemos hacer operaciones
     * @param l1 libro 1 de la biblioteca
     * @param l2 libro 2 de la biblioteca
     * @param l3 libro 3 de la biblioteca
     * @param l4 libro 4 de la biblioteca
     * @param l5 libro 5 de la biblioteca
     */
    public void intro(libro l1, libro l2, libro l3, libro l4, libro l5){
        Scanner teclado = new Scanner(System.in);
    System.out.println();
    System.out.println("Introduzca el libro con el que desea"
            + " hacer operaciones");
    int num=0;
    while(num==0){
        if(l1.gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("1." + l1.gettitulo());}
        if(l2.gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("2." + l2.gettitulo());}
        if(l3.gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("3." + l3.gettitulo());}
        if(l4.gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("4." + l4.gettitulo());}
        if(l5.gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("5." + l5.gettitulo());}
    opción=teclado.nextInt();
    if(opción>=1 && opción<=5){num=9;}
    else{System.out.println();
        System.out.println("La opción que has escogido no es valida");}}}
    
    /**
     * Constructor que utilizaremos para hacer las operaciones principales 
     * en nuestra biblioteca
     * @param l1 libro 1 de la biblioteca
     * @param l2 libro 2 de la biblioteca
     * @param l3 libro 3 de la biblioteca
     * @param l4 libro 4 de la biblioteca
     * @param l5 libro 5 de la biblioteca
     */
    public void operacion(libro l1, libro l2, libro l3, libro l4, libro l5){
        int num=0;
        int num2;
    while(num==0){
        System.out.println("");
    System.out.println("Introduzca una de las siguientes opciones"
            + " (1) Datos de cuenta, (2) Dar de alta, (3)"
            + " Dar de baja, (4) Devolver libro, (5)"
            + " Prestar libro, (6) Cambiar de libro,"
            + " (7) Salir del programa");
    Scanner teclado2 = new Scanner(System.in);
    num2=teclado2.nextInt();
    String opcion2;
    switch(num2){
        case 1:
            switch (opción){
        case 1:if(l1.gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + l1.gettitulo());
            System.out.println("ISBN:" + l1.getISBN());
            System.out.println("Editorial:" + l1.getEditorial());
            System.out.println("Ejemplares:" + l1.getejemplares());
            System.out.println("Autor:" + l1.getautor());}
            break;
        case 2:if(l2.gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + l2.gettitulo());
            System.out.println("ISBN:" + l2.getISBN());
            System.out.println("Editorial:" + l2.getEditorial());
            System.out.println("Ejemplares:" + l2.getejemplares());
            System.out.println("Autor:" + l2.getautor());}
            break;
        case 3:if(l3.gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + l3.gettitulo());
            System.out.println("ISBN:" + l3.getISBN());
            System.out.println("Editorial:" + l3.getEditorial());
            System.out.println("Ejemplares:" + l3.getejemplares());
            System.out.println("Autor:" + l3.getautor());}
            break;
        case 4:if(l4.gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + l4.gettitulo());
            System.out.println("ISBN:" + l4.getISBN());
            System.out.println("Editorial:" + l4.getEditorial());
            System.out.println("Ejemplares:" + l4.getejemplares());
            System.out.println("Autor:" + l4.getautor());}
            break;
        case 5:if(l5.gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + l5.gettitulo());
            System.out.println("ISBN:" + l5.getISBN());
            System.out.println("Editorial:" + l5.getEditorial());
            System.out.println("Ejemplares:" + l5.getejemplares());
            System.out.println("Autor:" + l5.getautor());}
            break;}
            break;
        case 2:switch(opción){
            case 1:if(l1.gettitulo()==null){l1.alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 2:if(l2.gettitulo()==null){l2.alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 3:if(l3.gettitulo()==null){l3.alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 4:if(l4.gettitulo()==null){l4.alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 5:if(l5.gettitulo()==null){l5.alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;}
            break;
        case 3:switch(opción){
            case 1:if(l1.gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{l1.baja();}
            break;
            case 2:if(l2.gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{l2.baja();}
            break;
            case 3:if(l3.gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{l3.baja();}
            break;
            case 4:if(l4.gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{l4.baja();}
            break;
            case 5:if(l5.gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{l5.baja();}
            break;}
            break;
        case 4:
        switch(opción){
                case 1:l1.devolucion();
                if(l1.getejemplares()>=0){
                System.out.println("Quedan " + l1.getejemplares() 
                        + " ejemplares de este libro");}
                if (l1.getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 2:l2.devolucion();
                if(l2.getejemplares()>=0){
                System.out.println("Quedan " + l2.getejemplares() 
                        + " ejemplares de este libro");}
                if (l2.getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 3:l3.devolucion();
                if(l3.getejemplares()>=0){
                System.out.println("Quedan " + l3.getejemplares() 
                        + " ejemplares de este libro");}
                if (l3.getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 4:l4.devolucion();
                if(l4.getejemplares()>=3){
                System.out.println("Quedan " + l4.getejemplares() 
                        + " ejemplares de este libro");}
                if (l5.getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 5:l5.devolucion();
                if(l5.getejemplares()>=3){
                System.out.println("Quedan " + l5.getejemplares() 
                        + " ejemplares de este libro");}
                if (l5.getejemplares()==3){System.out.println("Por favor espere"
                        +  " a que haya algún ejemplar disponible");}
                break;
                default:System.out.println("Libro inexistente");
                break;
            }
        break;
        case 5:
            switch(opción){
                case 1:l1.prestamo();
                if(l1.getejemplares()>=0){
                System.out.println("Quedan " + l1.getejemplares() 
                        + " ejemplares de este libro");}
                if (l1.getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 2:l2.prestamo();
                if(l2.getejemplares()>=0){
                System.out.println("Quedan " + l2.getejemplares() 
                        + " ejemplares de este libro");}
                if (l2.getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 3:l3.prestamo();
                if(l3.getejemplares()>=0){
                System.out.println("Quedan " + l3.getejemplares() 
                        + " ejemplares de este libro");}
                if (l3.getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 4:l4.prestamo();
                if(l4.getejemplares()>=0){
                System.out.println("Quedan " + l4.getejemplares() 
                        + " ejemplares de este libro");}
                if (l4.getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 5:l5.prestamo();
                if(l5.getejemplares()>=0){
                System.out.println("Quedan " + l5.getejemplares() 
                        + " ejemplares de este libro");}
                if (l5.getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                default:System.out.println("Libro inexistente");
                break;
            }
            break;
        case 6:intro(l1,l2,l3,l4,l5);
            break;
        case 7:num=1;
        System.out.println("Gracias por usar nuestros servicios");
        break;
        default:System.out.println("Opcion invalida");}
}}}
