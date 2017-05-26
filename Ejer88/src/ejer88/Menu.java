/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Menu
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
     * @param Banco Arraylist en el que estaran todas las cuentas del banco
     */
    public void operacion(Cuenta c1, Cuenta c2, Cuenta c3, ArrayList<Cuenta> Banco){
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
            System.out.println("Nombre:" + Banco.get(0).getname());
            System.out.println("Primer apellido:" + Banco.get(0).getapellido());
            System.out.println("Segundo apellido:" + Banco.get(0).getapellido2());
            System.out.println("DNI:" + Banco.get(0).getDNI());
            System.out.println("Saldo:" + Banco.get(0).getsaldo() + "€");
            System.out.println("Tipo de interes:" + Banco.get(0).getint() + " %");
            System.out.println("Numero de cuenta:" + Banco.get(0).getnc());
            break;
        case "2":
            System.out.println("Nombre:" + Banco.get(1).getname());
            System.out.println("Primer apellido:" + Banco.get(1).getapellido());
            System.out.println("Segundo apellido:" + Banco.get(1).getapellido2());
            System.out.println("DNI:" + Banco.get(1).getDNI());
            System.out.println("Saldo:" + Banco.get(1).getsaldo() + "€");
            System.out.println("Tipo de interes:" + Banco.get(1).getint() + " %");
            System.out.println("Numero de cuenta:" + Banco.get(1).getnc());;
            break;
        case "3":
            System.out.println("Nombre:" + Banco.get(2).getname());
            System.out.println("Primer apellido:" + Banco.get(2).getapellido());
            System.out.println("Segundo apellido:" + Banco.get(2).getapellido2());
            System.out.println("DNI:" + Banco.get(2).getDNI());
            System.out.println("Saldo:" + Banco.get(2).getsaldo() + "€");
            System.out.println("Tipo de interes:" + Banco.get(2).getint() + " %");
            System.out.println("Numero de cuenta:" + Banco.get(2).getnc());
            break;}
            break;
        case 2:switch(opción){
            case "1":Banco.get(0).reintegro();
            break;
            case "2":Banco.get(1).reintegro();
            break;
            case "3":Banco.get(2).reintegro();
            break;}
            break;
        case 3:switch(opción){
            case "1":Banco.get(0).ingreso();
            break;
            case "2":Banco.get(1).ingreso();
            break;
            case "3":Banco.get(2).ingreso();
            break;}
            break;
        case 4:Scanner teclado2=new Scanner(System.in);
            switch(opción){
            case "1":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 2 si deseas la cuenta 2 o 3 si deseas la cuenta 3");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "2":Banco.get(0).transferencia(c1,c2,Banco);
                    break;
                    case "3":Banco.get(0).transferencia(c1,c3,Banco);
                    break;
                    default:System.out.println("Error, cuenta no existente");
                    break;}
            break;
            case "2":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 1 si deseas la cuenta 1 o 3 si deseas la cuenta 3");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "1":Banco.get(1).transferencia(c2,c1,Banco);
                    break;
                    case "3":Banco.get(1).transferencia(c2,c3,Banco);
                    break;
                    default:System.out.println("Error, cuenta no existente");
                    break;}
            break;
            case "3":System.out.println("A que cuenta deseas hacer la transferencia,"
                    + "escoge 1 si deseas la cuenta 1 o 2 si deseas la cuenta 2");
                opcion2=teclado2.next();
                switch(opcion2){
                    case "1":Banco.get(2).transferencia(c3,c1,Banco);
                    break;
                    case "2":Banco.get(2).transferencia(c3,c2,Banco);
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

