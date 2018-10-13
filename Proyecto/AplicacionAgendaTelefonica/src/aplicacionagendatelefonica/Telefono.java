/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionagendatelefonica;
import java.io.Serializable;
/**
 *
 * @author Usuario 1
 */
public class Telefono implements Serializable{
    private long  telefono;
    private String tipoTelefono;
    
    public Telefono(String telefono, String tipoTelefono)
    {
        this.telefono = Long.parseLong(telefono);
        this.tipoTelefono = tipoTelefono;
    }
    
    public long getTelefono() {
        return telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    @Override
    public String toString()
    {
        /*
        String numeroTelefono = "Telefono: " + telefono + ", " +
                "Tipo: " + tipoTelefono;
        */
        String numeroTelefono = "[ " + telefono + ", " 
                + tipoTelefono + " ]";
        return numeroTelefono;
    }
}
