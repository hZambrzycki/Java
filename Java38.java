/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arraysbidimensionales;

/**
 *
 *
 */
public class Ejercicio1ArraysBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //a) Crear array b de 2*3 de tipo int
        int [][] b1 = new int[2][3];
        
        //b) Inicializar el array b en la declaración con el valor 0
        // 1. Ya está inicializado porque por defecto los valores numéricos se 
        // inicializan a 0
        //2. 
        int [][] b2 = {{0,0,0}, {0,0,0}};
        
        //c) Escribir el contenido e todos los elementos e la segunda fila de b
        b1[1][0] = 4;
        b1[1][1] = -8;
        b1[1][2] = 8;
        
        //d) Escribir el contenido e todos los elementos de la tercera columna 
        // de b
        b1[0][2] = 6;
        b1[1][2] = 3;
        
        //f)Imprimir por pantalla el contenido del array en formato de tabla
        //http://www.it.uc3m.es/pbasanta/asng/course_notes/input_output_printf_
        // en.html
        System.out.println("************TABLA***********");
        for (int i=0; i< b1.length; i++) {
            for (int j=0; j< b2[i].length; j++){
                System.out.print(b1[i][j]+ " ");
            }
            System.out.println();
        }
        
        //f) Con printf
         //f)Imprimir por pantalla el contenido del array en formato de tabla
        System.out.println("************TABLA***********");
        for (int i=0; i< b1.length; i++) {
            for (int j=0; j< b2[i].length; j++){
                //System.out.printf("%5d", b1[i][j]); //d entero
                                                      //f real
                                                      //s string
                System.out.printf("%5.2f", (double) b1[i][j]);                                   
            }
            System.out.println();
        }
        
        //e) Imprimir el valor más pequeño que se encuentra almaceenado en un 
        //array
        int min = b1[0][0];
        
        for (int i=0; i<b1.length; i++) {
            for (int j=0; j<b1[i].length; j++) {
                if (b1[i][j]<min) {
                    min = b1[i][j];
                }
            }
        }
        //System.out.println(min);
        //Con printf
        System.out.printf("El mínimo es %d \n",min);
        
        
        
    }
    
}
