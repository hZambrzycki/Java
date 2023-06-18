/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarraysobjetos2;

/**
 *
 * @author Hubert Zambrzycki
 */
public class EjArraysObjetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     RegistroVentasDiarias reg = new RegistroVentasDiarias("21/02/2021", 10);

        Venta venta1 = new Venta(1, 20.5);
        Venta venta2 = new Venta(2, 100.5);
        Venta venta3 = new Venta(1, 200.5);
        Venta venta4 = new Venta(4, 30.5);
        Venta venta5 = new Venta(5, 70.5);
        Venta venta6 = new Venta(8, 135.5);
        Venta venta7 = new Venta(3, 240.5);
        Venta venta8 = new Venta(2, 108.5);
        Venta venta9 = new Venta(4, 205.5);
        Venta venta10 = new Venta(7, 65.5);

        Venta venta11 = new Venta(3, 165.5);


        System.out.println("Añadimos venta1: "+reg.agregarVenta(venta1));
        System.out.println("Añadimos venta2: "+reg.agregarVenta(venta2));
        System.out.println("Añadimos venta3: "+reg.agregarVenta(venta3));
        System.out.println("Añadimos venta4: "+reg.agregarVenta(venta4));
        System.out.println("Añadimos venta5: "+reg.agregarVenta(venta5));
        System.out.println("Añadimos venta6: "+reg.agregarVenta(venta6));
        System.out.println("Añadimos venta7: "+reg.agregarVenta(venta7));
        System.out.println("Añadimos venta8: "+reg.agregarVenta(venta8));
        System.out.println("Añadimos venta9: "+reg.agregarVenta(venta9));
        System.out.println("Añadimos venta10: "+reg.agregarVenta(venta10));

        System.out.println("Añadimos venta11: "+reg.agregarVenta(venta11));

        System.out.println("Buscamos la venta7: "+reg.buscarVenta(3));
    }
    
}
