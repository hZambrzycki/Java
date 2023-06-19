/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyclinicadental;

/**
 *
 * @author ANA
 */
public class ProyClinicaDental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paciente p1 = new Paciente("Federico", "Gómez");
        Paciente p2 = new Paciente("Pepa", "Flores");
        Paciente p3 = new Paciente("Juan", "Bravo");
        Paciente p4 = new Paciente("Carlos", "Gómez");
        Paciente p5 = new Paciente("Ana", "Martínez");
        
        ClinicaDental cl = new ClinicaDental();
        
        cl.agregarPaciente(p1);
        cl.agregarPaciente(p2);
        cl.agregarPaciente(p3);
        cl.agregarPaciente(p4);
        
        cl.imprimirClinicaDental();
        
        cl.ordenarListaPacientes();
        
        cl.imprimirClinicaDental();
        
        
        
    }
    
}
