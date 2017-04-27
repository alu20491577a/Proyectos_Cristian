/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer86;

/**
 * Clase Principal. Conversor de longitudes
 * @author Cristian
 */
public class Ejer86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String opcion;
    
    int num=0;
    menu m1 = new menu();
    pie p1 = new pie();
    pulgadas p2 = new pulgadas();
    yardas y1 = new yardas();
    cm c1 = new cm();
    while (num==0){
    m1.intro();
    opcion = m1.getStr();
    switch(opcion){
        case "pies":p1.ejec();
            break;
        case "pulgadas":p2.ejec();
            break;
        case "yardas":y1.ejec();
            break;
        case "cm":c1.ejec();
            break;
        default:System.out.println("unidad de medida erronea");
        break;
        case "salir":System.out.println("Gracias por utilizar nuestros servicios");
            num=9;
            break;
        }}}
    
}
