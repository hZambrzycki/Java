/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyfutbol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dawmi
 */
public class ProyFutbol {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random(10);
        
        
        int[][] puntuaciones = new int[5][];
        puntuaciones[0] = new int[5];
        puntuaciones[1] = new int[5];
        puntuaciones[2] = new int[5];
        puntuaciones[3] = new int[5];
        puntuaciones[4] = new int[5];
        
        
        //identificadores
        puntuaciones[0][0] = 1; /*Madrid */ 
        puntuaciones[0][1] = 2; /*Atleti */ 
        puntuaciones[0][2] = 3; /*BC */ 
        puntuaciones[0][3] = 4; /*Getafe */ 
        puntuaciones[0][4] = 5; /*Alaves */ 
        
        
        //partidos jugados
        
        puntuaciones[1][0] = 9;
        puntuaciones[1][1] = 5;
        puntuaciones[1][2] = 3;
        puntuaciones[1][3] = 7;
        puntuaciones[1][4] = 2;
        
        
        //goles marcados
        puntuaciones[2][0] = 5;
        puntuaciones[2][1] = 5;
        puntuaciones[2][2] = 2;
        puntuaciones[2][3] = 3;
        puntuaciones[2][4] = 1;
        
        //goles recibidos
        puntuaciones[3][0] = 7;
        puntuaciones[3][1] = 8;
        puntuaciones[3][2] = 6;
        puntuaciones[3][3] = 5;
        puntuaciones[3][4] = 3;
        
        //puntos
        puntuaciones[4][0] = 7;
        puntuaciones[4][1] = 8;
        puntuaciones[4][2] = 6;
        puntuaciones[4][3] = 5;
        puntuaciones[4][4] = 3;
        
        
        disputarPartido(0);
        
        
        for (int i = 0; i < puntuaciones.length; i++) {
            for (int j = 0; j < puntuaciones[i].length; j++) {
                System.out.printf("%d | ",+ puntuaciones[i][j]);
               
                
            }
            System.out.println();
            System.out.println("\n----------------------------------------");
        }
    }
    
    public static int disputarPartido(int id) {
         Scanner teclado = new Scanner(System.in);
         Random rd = new Random(10);
          switch(id) {
              case 0 :
                  System.out.println("El Madrid");
              break;
              case 1 :
                  System.out.println("El atletico");
                  break;
              case 2: 
                  System.out.println("El Barcelona");
                  break;
              case 3: 
                  System.out.println("El getafe"); 
                  break;
              case 4: 
                  System.out.println("El Alavés");
                  break;
          }
          int golesLocal = 0;
          int golesVisitante =0;
          
          int local = 0;
          int visitante = 0;
          int [] puntosLocal = new int[10];
          int [] puntosVisitante = new int[10];
          
          if(id == 0) {
              local = puntosLocal.length;
          } else {
              visitante = puntosVisitante.length;
          }
          for (int i = 0; i < 5; i++) {
            golesVisitante = rd.nextInt(10);
            golesLocal = rd.nextInt(10);
            
            if(golesLocal>golesVisitante) {
                puntosLocal[i]+=3;
             } else {
                puntosVisitante[i]+=3;
            }
            if(golesLocal == golesVisitante) {
                puntosLocal[i]+=1;
                puntosVisitante[i]+=1;
            }
          
             
             
          }
          String ganador;
          
          if(local>visitante) {
              System.out.println("GANA EL EQUIPO LOCAL");
              ganador = "El madrid";
          } else {
              System.out.println("GANA EL EQUIPO VISITANTE");
              ganador = "Equipo visitante";
          }
        
         return id;
    }
       
        
        
        
}
