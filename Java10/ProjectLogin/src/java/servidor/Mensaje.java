/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author huber
 */
public class Mensaje {
 private static final AtomicInteger count = new AtomicInteger(0); 
   private String remitente;
   private String destinatario;
   private String mensaje;
  private int id;

    public Mensaje(String remitente, String destinatario, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        id = count.incrementAndGet();
        
    }


    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    
}
