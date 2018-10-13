/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionagendatelefonica;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author Usuario 1
 */
/*
    Orden de ingreso de los datos

        aRetornar[0] = nombre;
        aRetornar[1] = apellido;
        aRetornar[2] = direccion;
        aRetornar[3] = telefono[0];
        aRetornar[4] = telefono[1];
        aRetornar[5] = correoElectronico;
        aRetornar[6] = alias;
*/
public class Contacto implements Serializable {
    
    private String nombre;
    private String apellido;
    //private String numeroTelefono;
    private String direccion;
    private String correoElectronico;
    private String alias;
    private ArrayList <Telefono> listaTelefonos;
    
    public Contacto(){}
    
    //public Contacto(String nombre, String apellido, String numeroTelefono,
    //        String correoElectronico, String alias)
    public Contacto(String [] datos)
    {
        /*
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.alias = alias;
        this.listaTelefonos = new ArrayList();
        */
        this.listaTelefonos = new ArrayList();
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.direccion = datos[2];
        this.correoElectronico = datos[5];
        this.alias = datos[6];
        
        Telefono telefono = new Telefono(datos[3], datos[4]);
        this.listaTelefonos.add(telefono);
    }
    
    public void agregarTelefono(String numeroTelefono, String tipo)
    {
        // probablemente hay que hacer la comprobacion de telefonos repetidos
        // aqui o en algun lado
        if(!this.listaTelefonos.isEmpty())
        {
            //if(!this.buscarTelefono(numeroTelefono, tipo))
            if(!this.buscarTelefono(numeroTelefono))
            {
                Telefono telefono = new Telefono(numeroTelefono, tipo);
                this.listaTelefonos.add(telefono);
            }
            else
            {
                System.out.println("El telefono ya ha sido agregado a la lista"
                        + " de contactos");
            }
        }
        else
        {
            Telefono telefono = new Telefono(numeroTelefono, tipo);
            this.listaTelefonos.add(telefono);
        }
    }
    
    // esta = false --> el contacto no esta
    // esta = true --> el contacto esta
    //public boolean buscarTelefono(String numeroTelefono, String tipo)
    public boolean buscarTelefono(String numeroTelefono)
    {
        boolean esta = false;
        if(!this.listaTelefonos.isEmpty())
        {
            for (Telefono telefono: this.listaTelefonos)
            {
                if(numeroTelefono.equals(String.valueOf(telefono.getTelefono())))
                {
                    esta = true;
                    break;
                }
            }
        }
        return esta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getAlias() {
        return alias;
    }

    public ArrayList<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }

    public String getTelefonos()
    {
        String telefonos = "";
        
        if(!this.listaTelefonos.isEmpty())
        {
            for(Telefono telefono: this.listaTelefonos)
            {
                telefonos += telefono.toString() + ", ";
            }
        }
        
        return telefonos;
    }
    public int longitudListaTelefonos()
    {
        return this.listaTelefonos.size();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public void modificarTelefonoEnPosicion(String telefono, String tipoTelefono,
            int posicion)
    {
        if(this.listaTelefonos.size() > posicion && posicion >= 0)
        {
            Telefono t = this.listaTelefonos.get(posicion);
            t.setTelefono(Long.parseLong(telefono));
            t.setTipoTelefono(tipoTelefono);
        }
        else
        {
            System.out.println("Posicion fuera de rango. El telefono en la "
                    + " posicion " + posicion + " no existe" + "\n\n" );
        }
    }
    
    public void eliminarTelefonoEnPosicion(int posicion)
    {
        if(posicion < this.longitudListaTelefonos() && posicion >= 0)
        {
            this.listaTelefonos.remove(posicion);
        }
        else
        {
            System.out.println("Posicion fuera de rango. El telefono en la "
                    + " posicion " + posicion + " no existe" + "\n\n" );        
        }
    }
    
    @Override
    public String toString()
    {
        return "Nombre: " + getNombre() + "\n"
                + "Apellido: " + getApellido() + "\n"
                + "Telefonos: " + getTelefonos() + "\n"
                + "Correo Electronico: " + getCorreoElectronico() + "\n"
                + "Alias: " + getAlias() + "\n";
    }
}
