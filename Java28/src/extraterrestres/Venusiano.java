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
public class Venusiano extends Extraterrestre {
    
    private TipoRaza raza;

    public Venusiano(TipoRaza raza, String nombre) {
        super(nombre, 4, 2, 4, Color.GREEN);
        this.raza = raza;
    }

    public TipoRaza getRaza() {
        return raza;
    }

    public void setRaza(TipoRaza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Venusiano{" + super.toString() + "raza=" + raza + '}';
    }
    
    @Override
    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Experimentar con terricola");
    }
    

    
    
}
