/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Menu {
    
    private String opción;
            
    /**
     *Introduciremos la cuenta con la que deseamos hacer operaciones
     */
    public void intro(){Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el numero de la cuenta con la que desea"
            + " hacer operaciones (1 2 o 3)");
    opción=teclado.nextLine();}
     
    /**
     * Este sera el constructor principal del menu donde haremos todas las
     * operaciones, le introduciremos las 3 cuentas desde la clase principal,
     * introduciremos asi todas las variables que hemos puesto en la clase principal
     * @param c1 primera cuenta del banco
     * @param c2 segunda cuenta del banco
     * @param c3 tercera cuenta del banco
     */
    public void operacion(Cuenta c1, Cuenta c2, Cuenta c3){
        int num=0;
        int num2;
    while(num==0){
        System.out.println("");
    System.out.println("Introduzca una de las siguientes opciones"
            + " (1) Datos de cuenta, (2) Retiro de dinero, (3)"
            + " ingreso de dinero, (4) Transferencia Nacional, (5)"
            + " cambiar de cuenta, (6) Salir del programa");
    Scanner teclado = new Scanner(System.in);
    num2=teclado.nextInt();
    String opcion2;
    switch(num2){
        case 1:
            switch (opción){
        case "1":
            System.out.println("Nombre:" + c1.getname());
            System.out.println("Primer apellido:" + c1.getapellido());
            System.out.println("Segundo apellido:" + c1.getapellido2());
            System.out.println("DNI:" + c1.getDNI());
            System.out.println("Saldo:" + c1.getsaldo() + "€");
            System.out.println("Tipo de interes:" + c1.getint() + " %");
            System.out.println("Numero de cuenta:" + c1.getnc());
            break;
        case "2":
            System.out.println("Nombre:" + c2.getname());
            System.out.println("Primer apellido:" + c2.getapellido());
            System.out.println("Segundo apellido:" + c2.getapellido2());
            System.out.println("DNI:" + c2.getDNI());
            System.out.println("Saldo:" + c2.getsaldo() + "€");
            System.out.println("Tipo de interes:" + c2.getint() + " %");
            System.out.println("Numero de cuenta:" + c2.getnc());
            break;
        case "3":
            System.out.println("Nombre:" + c3.getname());
            System.out.println("Primer apellido:" + c3.getapellido());
            System.out.println("Segundo apellido:" + c3.getapellido2());
            System.out.println("DNI:" + c3.getDNI());
            System.out.println("Saldo:" + c3.getsaldo() + "€");
            System.out.println("Tipo de interes:" + c3.getint() + "%");
            System.out.println("Numero de cuenta:" + c3.getnc());
            break;}
            break;
        case 2:switch(opción){
            case "1":c1.reintegro();
            break;
            case "2":c2.reintegro();
            break;
            case "3":c3.reintegro();
            break;}
            break;
        case 3:switch(opción){
            case "1":c1.ingreso();
            break;
            case "2":c2.ingreso();
            break;
            case "3":c3.ingreso();
            break;}
            break;
        case 4:Scanner teclado2=new Scanner(System.in);
            switch(opción){
            case "1":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 2 si deseas la cuenta 2 o 3 si deseas la cuenta 3");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "2":c1.transferencia(c1,c2);
                    break;
                    case "3":c1.transferencia(c1,c3);
                    break;
                    default:System.out.println("Error, cuenta no existente");
                    break;}
            break;
            case "2":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 1 si deseas la cuenta 1 o 3 si deseas la cuenta 3");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "1":c2.transferencia(c2,c1);
                    break;
                    case "3":c2.transferencia(c2,c3);
                    break;
                    default:System.out.println("Error, cuenta no existente");
                    break;}
            break;
            case "3":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 1 si deseas la cuenta 1 o 2 si deseas la cuenta 2");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "1":c3.transferencia(c3,c1);
                    break;
                    case "2":c3.transferencia(c3,c2);
                    break;
                    default:System.out.println("Error, cuenta no existente");
                    break;}}
            break;
        case 5:System.out.println("Introduzca el numero de la cuenta con la que desea"
            + " hacer operaciones (1 2 o 3)");
        Scanner teclado3 = new Scanner(System.in);
            opción=teclado3.nextLine();
            break;
        case 6:num=1;
        System.out.println("Gracias por usar nuestros servicios");
            break;}
}}}

