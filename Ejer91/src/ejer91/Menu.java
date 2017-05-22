/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer91;

import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Cristian
 */
public class Menu {
    
    private int dia;
    private int mes;
    private int año;
    private boolean bisiesto;
    private int num;
    private int num2=0;
    private int day;
    private int month;
    private int year;

Fecha f1=new Fecha();

public void Menu(){
    f1.intro();
    Scanner teclado3 = new Scanner(System.in);
while(num2==0){
    dia=f1.getdia();
    año=f1.getaño();
    mes=f1.getmes();
    bisiesto=f1.getbisiesto();
System.out.println("Elige la opción deseada");
System.out.println("1.Comprobar si la fecha introducida es correcta");
System.out.println("2.Comprobar la fecha actual");
System.out.println("3.Cambiar fecha");
System.out.println("4.Salir");
num=teclado3.nextInt();
switch(num){
    case 1:
        switch(dia){
            case 29:
                switch(mes){
                    case 2: if(bisiesto==true){
                System.out.println("La fecha " + dia + " del " + mes
                            + " de " + año + " es correcta");}
                    else{System.out.println("Error la fecha es incorrecta");}
                break;
            default:{System.out.println("La fecha " + dia + " del " + mes
                            + " de " + año + " es correcta");}}
            break;
            default:System.out.println("La fecha " + dia + " del " + mes
                            + " de " + año + " es correcta");
            break;
            case 30:
                switch(mes){
                    case 2:System.out.println("Error la fecha es incorrecta");
                    break;
                    default:System.out.println("La fecha " + dia + " del " + mes
                            + " de " + año + " es correcta");
                    break;}
                break;
            case 31:
                switch(mes){
                    case 2:System.out.println("Error la fecha es incorrecta");
                    break;
                    case 4:System.out.println("Error la fecha es incorrecta");
                    break;
                    case 6:System.out.println("Error la fecha es incorrecta");
                    break;
                    case 9:System.out.println("Error la fecha es incorrecta");
                    break;
                    case 11:System.out.println("Error la fecha es incorrecta");
                    break;
                    default:System.out.println("La fecha " + dia + " del " + mes
                            + " de " + año + " es correcta");
                    break;}
            break;}
        break;    
    case 2:Calendar fecha = Calendar.getInstance();
        day=fecha.get(Calendar.DAY_OF_MONTH);
        month=fecha.get(Calendar.MONTH)+1;
        year=fecha.get(Calendar.YEAR);
        System.out.print("La fecha de hoy es: ");
        System.out.println(day + " del " + month + " de " + year);
        break;
    case 3:f1.intro();
        break;
    case 4:num2=9;
    System.out.println("Gracias por utilizar nuestros servicios");
        break;}}}}
