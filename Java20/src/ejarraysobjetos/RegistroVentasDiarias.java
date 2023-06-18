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
public class RegistroVentasDiarias {

    String fecha;
    double [] listaVentas;
    int [] listaCodProducto;

    public RegistroVentasDiarias(String fecha, double[] listaVentas, int [] listaCodProducto) {
        this.fecha=fecha;
        this.listaVentas=listaVentas;
        this.listaCodProducto=listaCodProducto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void imprimirRegistroVentas() {
        String listaVent="";
        String listaCod="";
        for (int i = 0; i < listaVentas.length; i++) {
            listaVent+=listaVentas[i] + ", ";
            listaCod+=listaCodProducto[i] + ", ";
        }
        System.out.println("Fecha: "+ fecha);
        System.out.println("Lista de ventas: "+ listaVent);
        System.out.println("Lista de codigos: "+ listaCod);

    }

    public double calcularMaximo() {
        double maximo=0;
        for (int i = 0; i < listaVentas.length; i++) {
            if(maximo<listaVentas[i]) {
                maximo=listaVentas[i];
            }
        }
        return maximo;
    }

    public int calcularProductoEstrella() {
        int cont=0;
        int [] aux= new int[listaCodProducto.length];
        int codigo;
        for (int i = 0; i < listaCodProducto.length; i++) {

            codigo=listaCodProducto[i];
            for (int j = 0; j < listaCodProducto.length; j++) {
                if(codigo == listaCodProducto[j]) {
                    cont++;
                }
            }
            aux[i] = cont;
            cont = 0;

        }
        int posicion = 0;
        int max = 0;
        for (int i = 0; i < aux.length; i++) {
            if(max<aux[i]) {
                max = aux[i];
                posicion=i;
            }
        }


        return listaCodProducto[posicion];
    }


}
