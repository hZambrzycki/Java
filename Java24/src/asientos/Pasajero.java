/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asientos;

/**
 *
 * @author Hubert Zambrzycki
 */
public class Pasajero {

    private String dni;
    private String nombre;
    private String apellidos;

    public Pasajero(String dni, String nombre, String apellidos) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
