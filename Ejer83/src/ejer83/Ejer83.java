/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer83;

/**
 *
 * @author Cristian
 */
public class Ejer83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x2;
    int x;
    int num;
    float num1;
    float num2;
    //Variables
    Introduccion i1 = new Introduccion();
    Ecuacion e1 = new Ecuacion();
    i1.x2();
    x2=i1.GetX2();
    i1.x();
    x=i1.GetX();
    i1.num();
    num1=i1.Raiz();
    if(num1>0){
    num1=(float) Math.sqrt(num1);
    num2=e1.Setraiz(num1);
    // Los dos valores siguientes
    // nunca son utilizados en las operaciones del main,
    // no obstante son necesarios a la hora de realizar la operación que se
    // ejecutara en la clase llamada Ecuacion
    x=e1.SetX(x);
    x2=e1.SetX2(x2);
    System.out.println("Los resultados son los siguientes;");
    System.out.println("El resultado negativo es:" + e1.SetRes1());
    System.out.println("El resultado negativo es:" + e1.SetRes2());}
    else{System.out.println(num1);
        System.out.println("La raiz de un número negativo es una imposibilidad"
            + " matemática.");}}
    
}
