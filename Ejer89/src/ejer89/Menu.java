/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer89;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Menu {

int num;
int num2=0;
int num3;
int num4=0;
int n;
Contador c1 = new Contador();

public void menu(){
    c1.inicio();
while (num2==0){
    num4=0;
System.out.println("elige el contador que quieres usar "
        + "(1) Contador 1 ,(2) Contador 2, (3) Salir");
Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in);
num=teclado.nextInt();
    switch(num){
        case 1:
            n=c1.getcontador();
            System.out.println(n);
            while(num4==0){
            System.out.println("Elige si quieres incrementar o disminuir el número del contador "
                    + "(1) Incrementar ,(2) Disminuir, (3) Salir");
            num3=teclado2.nextInt();
switch (num3) {
    case 1:n=c1.incrementar(n);
            System.out.println("numero actual del contador " + n);
        break;
    case 2:n=c1.disminuir(n);
        System.out.println("numero actual del contador " + n);
        break;
    case 3:System.out.println("Volviendo al menu");
           num4=9;
        break;
    default:System.out.println("Opcion incorrecta");
        break;}
}
            break;
        case 2:
            n=c1.getcontador2();
            System.out.println(n);
            while(num4==0){
            System.out.println("Elige si quieres incrementar o disminuir el número del contador "
                    + "(1) Incrementar ,(2) Disminuir, (3) Salir");
            num3=teclado2.nextInt();
switch (num3) {
    case 1:n=c1.incrementar(n);
        System.out.println("numero actual del contador " + n);
        break;
    case 2:n=c1.disminuir(n);
        System.out.println("numero actual del contador " + n);
        break;
    case 3:System.out.println("Volviendo al menu");
           num4=9;
        break;
    default:System.out.println("Opcion incorrecta");
        break;}
}
            break;
        case 3:
            System.out.println("Gracias por utilizar nuestros servicios.");
            num2=9;
            break;
        default:
            System.out.println("Error, el contador no existe");
            break;
    }
}}    
}
