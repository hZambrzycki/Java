/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyclinicadentaliii;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ANA
 */
public class ClinicaDental {

    private final int MAX_ELEMENTOS;
    private ArrayList<Paciente> listaPacientes;

    public ClinicaDental() {
        listaPacientes = new ArrayList<>();
        MAX_ELEMENTOS = 4;

    }

    public ClinicaDental(int maxElementos) {
        listaPacientes = new ArrayList<>();
        MAX_ELEMENTOS = maxElementos;
    }

    public boolean agregarPaciente(Paciente p) {
        //COmprobar que el paciente no está en la lista
        if (listaPacientes.contains(p)) {
            return false;
        }

        if (p == null) {
            return false;
        }

        if (listaPacientes.size() < MAX_ELEMENTOS) {
             return listaPacientes.add(p);
        }
        return false;
    }

    public int consultarPaciente(Paciente p) {
        return listaPacientes.indexOf(p);
    }

    public void ordenarListaPacientes() {

       Collections.sort(listaPacientes);
    }

    public void imprimirClinicaDental() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ClinicaDental{" + "listaPacientes=" + listaPacientes + '}';
    }
    
    
}
