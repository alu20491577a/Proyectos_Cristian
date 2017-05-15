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
public class Ejer88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cuenta c1 = new Cuenta();    
    c1.cset("Manuel","Martinez","Lopez","25631542A",12000,"1");
    Cuenta c2 = new Cuenta();
    c2.registro();
    c2.ncset("2");
    Cuenta c3 = new Cuenta(c1);
    c3.setsaldoandint(5000);
    c3.ncset("3");
    
    ArrayList<Cuenta> Cuenta = new ArrayList<>();
    Cuenta.add(c1);
    Cuenta.add(c2);
    Cuenta.add(c3);
    for(int i=0;i<Cuenta.size();i++){
    System.out.println(Cuenta.get(i));}
    
    Scanner teclado = new Scanner(System.in);
    }
}
