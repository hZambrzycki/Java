/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyclinicadental2;

import java.util.ArrayList;

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
        if (consultarPaciente(p) != -1) {
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
        //Comprobar nulos
        if (p==null) {
            return -1;
        }
        
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (p.getNombre().equals(listaPacientes.get(i).getNombre())
            && p.getApellido().equals(listaPacientes.get(i).getApellido())) {
                return i;
            }
        }
        return -1;
    }

    public void ordenarListaPacientes() {

        for (int i = 1; i < listaPacientes.size(); i++) {
            boolean ordenado = true;
            for (int j = 0; j < listaPacientes.size() - i; j++) {
                if (listaPacientes.get(j+1).getApellido().
                        compareTo(listaPacientes.get(j).getApellido()) < 0) {
                    // Intercambio (swapping)
                    Paciente aux = listaPacientes.get(j + 1);
                    listaPacientes.set(j+1, listaPacientes.get(j));
                    listaPacientes.set(j, aux);
                    ordenado = false;
                }
            }
            if (ordenado) {
                return;
            }
        }
    }

    public void imprimirClinicaDental() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ClinicaDental{" + "listaPacientes=" + listaPacientes + '}';
    }
    
    
}
