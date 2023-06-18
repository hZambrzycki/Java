/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

import java.util.ArrayList;

/**
 *
 * @author hubert
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Venusiano puk = new Venusiano(TipoRaza.NORTE, "Puk");
        Venusiano tak = new Venusiano(TipoRaza.ESTE, "Tak");
        Selenita primis = new Selenita(TipoArmamento.CA�ON_LASER, "Primis",3);
        Selenita flusis = new Selenita(TipoArmamento.PISTOLA_PROTONES, "Flusis",1);
        
        ArrayList<Extraterrestre> listaExtraterrestres = new ArrayList<>();
        listaExtraterrestres.add(puk);
        listaExtraterrestres.add(tak);
        listaExtraterrestres.add(primis);
        listaExtraterrestres.add(flusis);
        
        imprimir(listaExtraterrestres);
        atacar(listaExtraterrestres);
        
        
    }
    
    public static void imprimir(ArrayList<Extraterrestre> listaExtraterrestres) {
        for (int i=0; i<listaExtraterrestres.size(); i++) {
            System.out.println(listaExtraterrestres.get(i));
        }
    }
    
    public static void atacar(ArrayList<Extraterrestre> listaExtraterrestres) {
        for (int i=0; i<listaExtraterrestres.size(); i++) {
            if (listaExtraterrestres.get(i) instanceof Selenita) {
                for (int j=0; j<10; j++) {
                    listaExtraterrestres.get(i).atacarTerricola();
                }
            }
            else if (listaExtraterrestres.get(i) instanceof Venusiano) {
                listaExtraterrestres.get(i).atacarTerricola();
            }
            
           
        }
        
    }
    
}
