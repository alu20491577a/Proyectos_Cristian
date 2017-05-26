/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Cuenta
 * @author Cristian
 */
public class Cuenta {

    private int num;
    private String name;
    private String apellido;
    private String apellido2;
    private String DNI;
    private int saldo;
    private double interes;
    private String numero_cuenta;
    Scanner teclado = new Scanner(System.in);
    private ArrayList<Cuenta> Account;

    
    
    /**
     * Este es un constructor vacio.
     */
    
    public void cuenta(){
    this.Account=new ArrayList<>();}

    /**
     * Este constructor se utilizara para rellenar los datos de la cuenta 2
     */
    
    
    public void registro(){
    Scanner teclado2 = new Scanner(System.in);
    Scanner teclado3 = new Scanner(System.in);
    Scanner teclado4 = new Scanner(System.in);
    Scanner teclado5 = new Scanner(System.in);
    Scanner teclado6 = new Scanner(System.in);
System.out.println("Introduzca los siguientes datos para la creación de su"
        + " nueva cuenta.");
System.out.println();
System.out.println("Nombre:");
name=teclado2.next();
System.out.println("Primer apellido:");
apellido=teclado3.next();
System.out.println("Segundo apellido:");
apellido2=teclado4.next();
System.out.println("DNI:");
DNI=teclado5.next();
System.out.println("saldo con el que desea empezar la cuenta:");
saldo=teclado6.nextInt();
if (saldo<5000){interes=2.5;}
else if(saldo>5000){interes=5;}
else if(saldo<20000){interes=7.5;}
else{interes=10;}
this.Account=new ArrayList<>();}    

    /**
     * Usaremos este parametro para asignar automaticamente un numero de cuenta
     * a la cuenta 2.
     * @param numero_cuenta numero de la cuenta actual
     */
    public void ncset(String numero_cuenta){
this.numero_cuenta=numero_cuenta;}

    /**
     *Este constructor con parametros sera utilizado para rellenar la primera cuenta
     * @param name variable del nombre
     * @param apellido variable del primer apellido
     * @param apellido2 variable del segundo apellido
     * @param DNI variable del dato DNI
     * @param saldo variable con la cantidad de dinero acumulado
     * @param numero_cuenta variable del numero de la cuenta actual
     */
    
    Cuenta(String name, String apellido, String apellido2, String DNI,
        int saldo, String numero_cuenta){
this.name=name;
this.apellido=apellido;
this.apellido2=apellido2;
this.DNI=DNI;
this.saldo=saldo;
if (saldo<5000){interes=2.5;}
else if(saldo>5000){interes=5;}
else if(saldo<20000){interes=7.5;}
else{interes=10;}
this.numero_cuenta=numero_cuenta;}

    /**
     * Este constructor copia sera utilizado en la cuenta 3 como segunda cuenta
     * del cliente de la cuenta 1
     * @param c1 primera cuenta del ejercicio
     */
    
    public Cuenta(Cuenta c1){
this.name=c1.name;
this.apellido=c1.apellido;
this.apellido2=c1.apellido2;
this.DNI=c1.DNI;}

    /**
     *Utilizaremos esto para introducir el saldo y crear el tipo de interes de
     * la cuenta 3
     * @param saldo variable de la cantidad de dinero acumulado
     */
    public void setsaldoandint(int saldo){
this.saldo=saldo;
if (saldo<5000){interes=2.5;}
else if(saldo>5000){interes=5;}
else if(saldo<20000){interes=7.5;}
else{interes=10;}}

    /**
     * Utilizaremos este constructor cuando queramos el nombre 
     * del titular de la cuenta
     * @return devolvera el nombre
     */
    public String getname(){
return name;}

    /**
     *Utilizaremos este constructor cuando queramos el primer 
     * apellido del titular de la cuenta
     * @return devolvera el primer apellido
     */
    public String getapellido(){
return apellido;}

    /**
     *Utilizaremos este constructor cuando queramos el segundo
     * apellido del titular de la cuenta
     * @return devolvera el segundo apellido
     */
    public String getapellido2(){
return apellido2;}

    /**
     *Utilizaremos este constructor cuando queramos el DNI del titular de la cuenta
     * @return devolvera el DNI
     */
    public String getDNI(){
return DNI;}

    /**
     *Utilizaremos este constructor cuando queramos el saldo de la cuenta
     * @return devolvera el saldo
     */
    public int getsaldo(){
return saldo;}

    /**
     *Utilizaremos este constructor cuando queramos el tipo de interes de la cuenta
     * @return devolvera el interes
     */
    public Double getint(){
return interes;}

    /**
     * Utilizaremos este constructor cuando queramos el numero de la cuenta
     * @return devolvera el numero de cuenta
     */
    public String getnc(){
return numero_cuenta;}

    /**
     *Utilizaremos este constructor para ejecutar la operación de ingresar
     * dinero en una cuenta
     */
    public void ingreso(){
System.out.println("Introduzca la cantidad de dinero a introducir");
num=teclado.nextInt();
saldo=saldo+num;
System.out.println("La cantidad de " + num + "€ ha sido ingresada en su cuenta.");
System.out.println("Su saldo actual es " + saldo + "€");}

    /**
     Utilizaremos este constructor para ejecutar la operación de sacar
     * dinero en una cuenta
     */
    public void reintegro(){
System.out.println("Introduzca la cantidad de dinero a retirar");
num=teclado.nextInt();
saldo=saldo-num;
System.out.println("La cantidad de " + num + "€ ha sido retirada de su cuenta.");
System.out.println("Su saldo actual es " + saldo + "€");}

    /**
     *Este constructor sera utilizado para transferir dinero de una cuenta a otra
     * @param c1 primera cuenta, de la que se extraera el dinero
     * @param c2 segunda cuenta, en la que se ingresara el dinero
     * @param Banco Arraylist en el que tenemos los datos de las cuentas
     */
    public void transferencia(Cuenta c1, Cuenta c2,ArrayList Banco){
System.out.println("Introduzca la cantidad de dinero a transferir");
num=teclado.nextInt();
c1.saldo=c1.saldo-num;
c2.saldo=c2.saldo+num;
System.out.println("La cantidad de " + num + " ha sido retirada de la cuenta " + c1.numero_cuenta);
System.out.println("Su saldo actual es " + saldo + "€");
System.out.println("La cantidad de " + num + " ha sido transferida a la cuenta " + c2.numero_cuenta);
System.out.println("Su saldo actual es " + saldo + "€");}
}
