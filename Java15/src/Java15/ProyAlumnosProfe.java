/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyalumnosprofe;

/**
 *
 * @author Hubert Zambrzycki
 */
public class ProyAlumnosProfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaAlumnos la = new ListaAlumnos();
       
       Alumno rodrigo = new Alumno("Rodrigo" , "Bustos" , 26);
       Alumno pablo = new Alumno("Pablo" , "Lorenzo" , 20);
       Alumno judith = new Alumno("Judith" , "Vazquez" , 20);
       Alumno sergio = new Alumno("Sergio", "Peña" , 25);
       
       la.agregarAlumno(pablo);
        System.out.println(la);
        la.agregarAlumno(rodrigo);
        System.out.println(la);
        la.agregarAlumno(judith);
        System.out.println(la);
        la.agregarAlumno(sergio);
        System.out.println(la);
       
    }
    
}
