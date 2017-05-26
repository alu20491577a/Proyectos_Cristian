/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer88;

import java.util.ArrayList;

/**
 * Clase principal
 * @author Cristian
 */
public class Ejer88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Cuenta> Banco = new ArrayList(3);
    Menu m1=new Menu();
    Cuenta cuenta1 = new Cuenta("Manuel","Gómez","Rodríguez","03902930A",2500,"1");
    Banco.add(cuenta1);
    Cuenta cuenta2 = new Cuenta("Laura","Lopez","Vives","96583214B",7500,"2");
    Banco.add(cuenta2);
    Cuenta cuenta3 = new Cuenta(cuenta1);
    cuenta3.setsaldoandint(5000);
    cuenta3.ncset("3");
    Banco.add(cuenta3);
    m1.intro();
    m1.operacion(cuenta1,cuenta2,cuenta3,Banco);
}}
