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
public class Selenita extends Extraterrestre {
    
    private TipoArmamento tipoArmamento;

    public Selenita(TipoArmamento tipoArmamento, String nombre, int nCabezas) {
        super(nombre, 2, nCabezas, 1, Color.BLUE);
        this.tipoArmamento = tipoArmamento;
    }

    @Override
    public String toString() {
        return "Selenita{" + super.toString() + "tipoArmamento=" + tipoArmamento + '}';
    }

    public TipoArmamento getTipoArmamento() {
        return tipoArmamento;
    }
    
    public void dispararArma() {
        if (tipoArmamento == TipoArmamento.CA�ON_LASER) {
            System.out.println("BOUMMM");
        }
        else {
            System.out.println("Bzzzzzz");
        }
    }

    public void setTipoArmamento(TipoArmamento tipoArmamento) {
        this.tipoArmamento = tipoArmamento;
    }
    
    
    @Override
    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Aniquilar terr�cola");
        dispararArma();    
    }
    
}
