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
public class Ejer87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    int num=0;
    int num2;
    int num3;
    int num4;
    String num_cuenta;
    Menu m1=new Menu();
    System.out.println("Cree las cuentas deseadas para el programa");
    Cuenta c1=new Cuenta();
    Cuenta c2=new Cuenta();
    Cuenta c3=new Cuenta(c1);
    c1.cset("Manuel","Gómez","Rodríguez","03902930A",2500,"1");
    c2.registro();
    c2.ncset("2");
    c3.setsaldoandint(5000);
    c3.ncset("3");
    m1.acc(c1,c2,c3);
    m1.intro();
    m1.operacion(c1,c2,c3);}
    
}
