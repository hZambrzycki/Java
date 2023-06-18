/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarraysobjetos;

/**
 *
 * @author Hubert Zambrzycki
 */
public class EjArraysObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double [] arrayVentas = {20.3,100.8,200.1,40.6,70.5};

        int[] arrayCod = {3,4,2,2,4};

        RegistroVentasDiarias reg =  new RegistroVentasDiarias("21/02/2021", arrayVentas, arrayCod);

        reg.imprimirRegistroVentas();

        reg.setFecha("21/02/2020");

        reg.imprimirRegistroVentas();

        System.out.println("Venta máxima: "+reg.calcularMaximo());

        System.out.println("Producto estrella: "+reg.calcularProductoEstrella());
    }
    
}
