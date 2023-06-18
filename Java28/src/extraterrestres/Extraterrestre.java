/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

import java.awt.Color;

/**
 *
 * @author hubert
 */
public class Extraterrestre {
    
    private String nombre;
    private int nPiernas;
    private int nCabezas;
    private int nOjos;
    private Color color;
    private static int nCapturados = 0;

    public Extraterrestre(String nombre, int nPiernas, int nCabezas, int nOjos, Color color) {
        this.nombre = nombre;
        this.nPiernas = nPiernas;
        this.nCabezas = nCabezas;
        this.nOjos = nOjos;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnPiernas() {
        return nPiernas;
    }

    public void setnPiernas(int nPiernas) {
        this.nPiernas = nPiernas;
    }

    public int getnCabezas() {
        return nCabezas;
    }

    public void setnCabezas(int nCabezas) {
        this.nCabezas = nCabezas;
    }

    public int getnOjos() {
        return nOjos;
    }

    public void setnOjos(int nOjos) {
        this.nOjos = nOjos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Extraterrestre{" + "nombre=" + nombre + ", nPiernas=" + nPiernas + ", nCabezas=" + nCabezas + ", nOjos=" + nOjos + ", color=" + color + '}';
    }
    
    public  void atacarTerricola() {
        nCapturados++;
        System.out.println("Terricola capturado. Total " + nCapturados);
    }
    
    
}
