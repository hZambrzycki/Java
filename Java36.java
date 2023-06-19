/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2arraybidimensionales;

import java.util.Scanner;

/**
 *
 * @author Ana Datos Personales
 */
public class Ejercicio2ArrayBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        //El mes de abril de este año
        float[][] abril = new float[5][];

        abril[0] = new float[4];
        abril[1] = new float[7];
        abril[2] = new float[7];
        abril[3] = new float[7];
        abril[4] = new float[5];

        for (int i = 0; i < abril.length; i++) {
            for (int j = 0; j < abril[i].length; j++) {
                abril[i][j] = teclado.nextFloat();
            }
        }

        for (int i = 0; i < abril.length; i++) {
            for (int j = 0; j < abril[i].length; j++) {

                System.out.printf("%6.2f",abril[i][j]);

            }
            System.out.println();
        }

        //Calculamos las medias semanales
        float sumaSemanal = 0;
        float sumaMensual = 0;
        for (int i = 0; i < abril.length; i++) {
            sumaSemanal = 0;
            for (int j = 0; j < abril[i].length; j++) {
                sumaSemanal = abril[i][j] + sumaSemanal;
                sumaMensual = abril[i][j] + sumaMensual;

            }
            System.out.printf("Media temperaturas semana %d: %.2f \n",
                    (i + 1), sumaSemanal / abril[i].length);
        }
        System.out.printf("Media total de temperaturas: %.2f \n", sumaMensual / 30);

    }

}
