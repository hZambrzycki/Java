/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Hubert Zambrzycki
 */
public class Animal {

    static void animal() {
        Scanner teclado = new Scanner(System.in);
        String tipoAnimal=teclado.nextLine();
        
        System.out.println("El animal es un : " + tipoAnimal);
    }
    static void nombreAnimal() {
        Scanner teclado = new Scanner(System.in);
        String nombre=teclado.nextLine();
    }

    static void correr() {
         Scanner teclado = new Scanner(System.in);
        int edad= teclado.nextInt();
         if(edad<20) {
             System.out.println("El animal debido a su joven edad, corre rapido");
         } else {
             System.out.println("El animal debido a su edad, corre mas lento");
         }
     }
    static  void agilidad() {
          Scanner teclado = new Scanner(System.in);
          double peso = teclado.nextDouble();
         if(peso<90) {
             System.out.println("El animal es ágil");
         } else {
             System.out.println("Debido a su peso, el animal es menos ágil");
         }
     }
   static  void genero() {
       boolean sexo=true;
         if(sexo=true) {
             System.out.println("El sexo del animal es masculino");
         } else {
             System.out.println("El sexo del animal sera femenino");
         }
     }
     public static void main(String args[]){
          
         Animal X = new Animal();
         X();

     }
     private static void X() {
         System.out.println("Que tipo de animal es =?");
         animal();
         System.out.println("Cual es el nombre del animal=?");
         nombreAnimal();
         System.out.println("Como puede correr el animal?");
         correr();
         System.out.println("Cual es la agilidad del animal?");
         agilidad();
         System.out.println("El genero del animal es?");
         genero();
     }
    
    
}
