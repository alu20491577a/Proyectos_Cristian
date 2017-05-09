/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer87;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Cuenta {
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    Scanner teclado3 = new Scanner(System.in);
    Scanner teclado4 = new Scanner(System.in);
    Scanner teclado5 = new Scanner(System.in);
    Scanner teclado6 = new Scanner(System.in);
    private int num;
    private String name;
    private String apellido;
    private String apellido2;
    private String DNI;
    private int saldo;
    private double interes;
    private String numero_cuenta;
    
public Cuenta(){
}
    
public void registro(){
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
else{interes=10;}}    

public void ncset(String numero_cuenta){
this.numero_cuenta=numero_cuenta;}

public void cset(String name, String apellido, String apellido2, String DNI,
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

public Cuenta(Cuenta c1){
this.name=c1.name;
this.apellido=c1.apellido;
this.apellido2=c1.apellido2;
this.DNI=c1.DNI;}

public void setsaldoandint(int saldo){
this.saldo=saldo;
if (saldo<5000){interes=2.5;}
else if(saldo>5000){interes=5;}
else if(saldo<20000){interes=7.5;}
else{interes=10;}}

public void Account(Cuenta c1){
this.name=c1.name;
this.apellido=c1.apellido;
this.apellido2=c1.apellido2;
this.DNI=c1.DNI;}

public String getname(){
return name;}

public String getapellido(){
return apellido;}

public String getapellido2(){
return apellido2;}

public String getDNI(){
return DNI;}

public int getsaldo(){
return saldo;}

public Double getint(){
return interes;}

public String getnc(){
return numero_cuenta;}

public void ingreso(){
System.out.println("Introduzca la cantidad de dinero a introducir");
num=teclado.nextInt();
saldo=saldo+num;
System.out.println("La cantidad de " + num + "ha sido ingresada en su cuenta.");
System.out.println("Su saldo actual es " + saldo + "€");}

public void reintegro(){
System.out.println("Introduzca la cantidad de dinero a retirar");
num=teclado.nextInt();
saldo=saldo-num;
System.out.println("La cantidad de " + num + "ha sido retirada de su cuenta.");
System.out.println("Su saldo actual es " + saldo + "€");}

public void transferencia(Cuenta c1, Cuenta c2){
System.out.println("Introduzca la cantidad de dinero a transferir");
num=teclado.nextInt();
c1.saldo=c1.saldo-num;
c2.saldo=c2.saldo+num;
System.out.println("La cantidad de " + num + " ha sido retirada de la cuenta " + c1.numero_cuenta);
System.out.println("Su saldo actual es " + c1.saldo + "€");
System.out.println("La cantidad de " + num + " ha sido transferida a la cuenta " + c2.numero_cuenta);
System.out.println("Su saldo actual es " + c2.saldo + "€");}
}
