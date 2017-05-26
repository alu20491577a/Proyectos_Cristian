/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer93;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Menu {
    

    
    private int opción;
            
    /**
     *Introduciremos el libro con el que deseemos hacer operaciones
     * @param libreria Arraylist en el que estaran todos los libros
     */
    public void intro( ArrayList<libro> libreria){
        Scanner teclado = new Scanner(System.in);
    System.out.println();
    System.out.println("Introduzca el libro con el que desea"
            + " hacer operaciones");
    int num=0;
    while(num==0){
        if(libreria.get(0).gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("1." + libreria.get(0).gettitulo());}
        if(libreria.get(1).gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("2." + libreria.get(1).gettitulo());}
        if(libreria.get(2).gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("3." + libreria.get(2).gettitulo());}
        if(libreria.get(3).gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("4." + libreria.get(3).gettitulo());}
        if(libreria.get(4).gettitulo()==null){System.out.println("Registro Vacio");}
        else{
        System.out.println("5." + libreria.get(4).gettitulo());}
    opción=teclado.nextInt();
    if(opción>=1 && opción<=5){num=9;}
    else{System.out.println();
        System.out.println("La opción que has escogido no es valida");}}}
    
    /**
     * Constructor que utilizaremos para hacer las operaciones principales 
     * en nuestra biblioteca
     * @param libreria Arraylist con los libros de la libreria
     */
    public void operacion(ArrayList<libro> libreria){
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
        case 1:if(libreria.get(0).gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + libreria.get(0).gettitulo());
            System.out.println("ISBN:" + libreria.get(0).getISBN());
            System.out.println("Editorial:" + libreria.get(0).getEditorial());
            System.out.println("Ejemplares:" + libreria.get(0).getejemplares());
            System.out.println("Autor:" + libreria.get(0).getautor());}
            break;
        case 2:if(libreria.get(1).gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + libreria.get(1).gettitulo());
            System.out.println("ISBN:" + libreria.get(1).getISBN());
            System.out.println("Editorial:" + libreria.get(1).getEditorial());
            System.out.println("Ejemplares:" + libreria.get(1).getejemplares());
            System.out.println("Autor:" + libreria.get(1).getautor());}
            break;
        case 3:if(libreria.get(2).gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + libreria.get(2).gettitulo());
            System.out.println("ISBN:" + libreria.get(2).getISBN());
            System.out.println("Editorial:" + libreria.get(2).getEditorial());
            System.out.println("Ejemplares:" + libreria.get(2).getejemplares());
            System.out.println("Autor:" + libreria.get(2).getautor());}
            break;
        case 4:if(libreria.get(3).gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + libreria.get(3).gettitulo());
            System.out.println("ISBN:" + libreria.get(3).getISBN());
            System.out.println("Editorial:" + libreria.get(3).getEditorial());
            System.out.println("Ejemplares:" + libreria.get(3).getejemplares());
            System.out.println("Autor:" + libreria.get(3).getautor());}
            break;
        case 5:if(libreria.get(4).gettitulo()==null){System.out.println("El libro no esta"
                + " dado de alta");}
        else{
            System.out.println("Titulo:" + libreria.get(4).gettitulo());
            System.out.println("ISBN:" + libreria.get(4).getISBN());
            System.out.println("Editorial:" + libreria.get(4).getEditorial());
            System.out.println("Ejemplares:" + libreria.get(4).getejemplares());
            System.out.println("Autor:" + libreria.get(4).getautor());}
            break;}
            break;
        case 2:switch(opción){
            case 1:if(libreria.get(0).gettitulo()==null){libreria.get(0).alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 2:if(libreria.get(1).gettitulo()==null){libreria.get(1).alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 3:if(libreria.get(2).gettitulo()==null){libreria.get(2).alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 4:if(libreria.get(3).gettitulo()==null){libreria.get(3).alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;
            case 5:if(libreria.get(4).gettitulo()==null){libreria.get(4).alta();}
                    else{System.out.println("Este libro"
                    + " ya esta dado de alta");}
            break;}
            break;
        case 3:switch(opción){
            case 1:if(libreria.get(0).gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{libreria.get(0).baja();}
            break;
            case 2:if(libreria.get(1).gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{libreria.get(1).baja();}
            break;
            case 3:if(libreria.get(2).gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{libreria.get(2).baja();}
            break;
            case 4:if(libreria.get(3).gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{libreria.get(3).baja();}
            break;
            case 5:if(libreria.get(4).gettitulo()==null){System.out.println("Este libro"
                    + " ya esta dado de baja");}
                    else{libreria.get(4).baja();}
            break;}
            break;
        case 4:
        switch(opción){
                case 1:libreria.get(0).devolucion();
                if(libreria.get(0).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(0).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(0).getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 2:libreria.get(1).devolucion();
                if(libreria.get(1).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(1).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(1).getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 3:libreria.get(2).devolucion();
                if(libreria.get(2).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(2).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(2).getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 4:libreria.get(3).devolucion();
                if(libreria.get(3).getejemplares()>=3){
                System.out.println("Quedan " + libreria.get(3).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(3).getejemplares()==3){System.out.println("Todos los"
                        +  " ejemplares estan en la biblioteca");}
                break;
                case 5:libreria.get(4).devolucion();
                if(libreria.get(4).getejemplares()>=3){
                System.out.println("Quedan " + libreria.get(4).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(4).getejemplares()==3){System.out.println("Por favor espere"
                        +  " a que haya algún ejemplar disponible");}
                break;
                default:System.out.println("Libro inexistente");
                break;
            }
        break;
        case 5:
            switch(opción){
                case 1:libreria.get(0).prestamo();
                if(libreria.get(0).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(0).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(0).getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 2:libreria.get(1).prestamo();
                if(libreria.get(1).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(1).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(1).getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 3:libreria.get(2).prestamo();
                if(libreria.get(2).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(2).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(2).getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 4:libreria.get(3).prestamo();
                if(libreria.get(3).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(3).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(3).getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                case 5:libreria.get(4).prestamo();
                if(libreria.get(4).getejemplares()>=0){
                System.out.println("Quedan " + libreria.get(4).getejemplares() 
                        + " ejemplares de este libro");}
                if (libreria.get(4).getejemplares()==0){System.out.println("Por favor espere"
                        +  " a que se devuelva algún ejemplar");}
                break;
                default:System.out.println("Libro inexistente");
                break;
            }
            break;
        case 6:intro(libreria);
            break;
        case 7:num=1;
        System.out.println("Gracias por usar nuestros servicios");
        break;
        default:System.out.println("Opcion invalida");}
}}}
