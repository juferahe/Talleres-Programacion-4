/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearchivos;

import java.io.Serializable;

/**
 *
 * @author Usuario 1
 */

// Clase "Persona" tomada del libro 
// "Programacion Orientada a Objetos Usando Java" 
// de Hector Arturo Florez Fernandez, Ediciones Ecoe

public class Persona implements Serializable {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    
    public Persona () {}
    
    public Persona(int id, String nombre, String apellido, String 
            correoElectronico)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    @Override
    public String toString()
    {
        return  "ID: " + this.id + ", " +
                "Nombre: " + this.nombre + ", " +
                "Apellido: " + this.apellido + ", " +
                "Correo Electronico: " + this.correoElectronico;
    }
}
