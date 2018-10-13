/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionagendatelefonica;
import java.util.ArrayList;

/**
 *
 * @author Usuario 1
 */
public class AgendaTelefonica {
    private ArrayList<Contacto> agenda;
    private ManejadorArchivos manejadorArchivos;
    //private int numeroContactos;
    
    public AgendaTelefonica()
    {
        this.agenda = new ArrayList();
        this.manejadorArchivos = new ManejadorArchivos();
        //numeroContactos = 0;
    }
    
    public void iniciar()
    {
        cargarArchivo();
    }
    public void cerrarArchivo()
    {
        this.manejadorArchivos.cerrarArchivo();
    }
    
    private void cargarArchivo()
    {
        //System.out.println(this.manejadorArchivos.archivo.exists());
        this.agenda = this.manejadorArchivos.cargarArchivo();
        //System.out.println("size: " + agenda.size());
    }
    
    // la recepcion de datos no va aqui
    // tiene que ir en la aplicacion que controla la agenda
    // agregar contacto solo recibe los datos, crea el objeto contacto
    // y lo almacena en la lista de contactos
    // la verificacion de los datos tambien tiene que hacerse en
    // al momento de recibir los datos en la clase que administra la agenda    
    public void agregarContacto(String [] datos)
    {
        if(this.agenda.size() == 0)
        {
            Contacto nuevoContacto = new Contacto(datos);
            this.agenda.add(nuevoContacto);
            //this.numeroContactos += 1;
        }
        else
        {
            boolean esta = false;
            
            // reviso todos los telefonos de la lista de contactos
            // en busca de coincidencias. A la primera que encuentro
            // detengo el proceso y concluyo que no puedo agregar el contacto
            
            if(!this.telefonoExiste(datos[3]))
            {
                Contacto nuevoContacto = new Contacto(datos);
                this.agenda.add(nuevoContacto);
            }
            else{
                System.out.println("El telefono ya esta asignado a otro contacto."
                    + "\n" + "El contacto no se puede agregar."
                    + " Intente agregando el contacto otra vez pero"
                    + " usando otro numero de telefono" + "\n\n");
            }
        }
        this.almacenarContactos();
    }

    // reviso todos los telefonos de la lista de contactos
    // en busca de coincidencias. A la primera que encuentro
    // detengo el proceso y concluyo que no puedo agregar el contacto    
    // esta = false --> telefono no existe en otros contactos
    // esta = true --> telefono existe en otros contactos
    private boolean telefonoExiste(String telefono)
    {
        boolean esta = false;
        for(Contacto contacto : this.agenda)
        {
            if(contacto.buscarTelefono(telefono))
            {
                esta = true;
                break;
            }
        }
        return esta;
    }
    public void almacenarContactos()
    {
        this.manejadorArchivos.almacenarContactos(this.agenda);
    }
    
    public void exportarContactos()
    {
        this.manejadorArchivos.exportarContactos(this.agenda);
    }
    
    public void mostrarContacto(int posicion)
    {
        if(!this.agenda.isEmpty())
        {
            if(posicion >= 0 && posicion < this.agenda.size())
            {
                String contacto = "Contacto " + (posicion + 1) + "/" + 
                        this.getNumeroContactos() + "\n" +
                        this.agenda.get(posicion).toString() ;
                System.out.println(contacto);
            }
        }
        else
        {
            System.out.println("No hay nada que ver. La lista de contactos"
                    + " esta vacia");
        }
    }
    
    public void mostrarContactos(ArrayList<Contacto> contactos)
    {
        if(!contactos.isEmpty())
        {
            int contador = 1;
            int total = contactos.size();
            for(Contacto contacto : contactos)
            {
                String contact = "Contacto " + contador + "/" + 
                        total + "\n" +
                        contacto.toString() ;
                System.out.println(contact);
                contador += 1;
            }
        }
        else
        {
            System.out.println("No hay nada que ver. La lista de contactos"
                    + " esta vacia");
        }        
    }
    
    public void mostrarContactos()
    {
        if(!this.agenda.isEmpty())
        {
            System.out.println("Contactos en la agenda telefonica" + "\n");
            int contador = 1;
            int total = this.getNumeroContactos();
            for(Contacto contacto : this.agenda)
            {
                String contact = "Contacto " + contador + "/" + 
                        total + "\n" +
                        contacto.toString() + "\n" ;
                System.out.println(contact);
                contador += 1;
            }
        }
        else
        {
            System.out.println("No hay nada que ver. La lista de contactos"
                    + " esta vacia");
        }        
    }
    
    public void eliminarContacto(int posicion)
    {
        if(!this.agenda.isEmpty())
        {
            if(this.agenda.size() == 1)
            {
                this.agenda.remove(0);
            }
            else if(posicion >= 0 && posicion < this.agenda.size())
            {
                this.agenda.remove(posicion);
            }
            
            else
            {
                System.out.println("Contacto en la posicion dada no existe" + "\n\n");
            }
        }
        else
        {
            System.out.println("No hay ningun contacto en la agenda" + "\n\n");
        }
        this.almacenarContactos();
    }

    public int getNumeroContactos() {
        return this.agenda.size();
    }
    
    // size == 0 --> vacia  Retorna true
    // en el otro caso retorna false
    public boolean agendaVacia()
    {
        return this.agenda.size() == 0;
    }
    
    public void modificarContacto(int posicion, String campo, String valor)
    {
        if(!agenda.isEmpty())
        {
            modificarContactoParametro(posicion, campo, valor);
        }
        else
        {
            System.out.println("No hay nada que modificar. La agenda esta vacia");
        }
        this.almacenarContactos();
    }
    
    private void modificarContactoParametro(int posicion, String campo, String valorParametro)
    {
        Contacto c = agenda.get(posicion);
        //Contacto c = agenda.remove(posicion);
        switch(campo)
        {
            case "nombre":
                c.setNombre(valorParametro);
                break;
            case "apellido":
                c.setApellido(valorParametro);
                break;
            case "direccion":
                c.setDireccion(valorParametro);
                break;
            case "correo":
                c.setCorreoElectronico(valorParametro);
                break;
            case "alias":
                c.setAlias(valorParametro);
                break;
            default:
                break;
        }
        
        //agenda.add(posicion, c);
        this.almacenarContactos();
        
    }
    
    public void modificarTelefonoContacto(int posicionContacto, String accion, 
            String telefono, String tipoTelefono, int posicionTelefono)
    {
        Contacto c = this.agenda.get(posicionContacto);
        ///System.out.println("Posicion telefono: " + posicionTelefono);
        switch(accion)
        {
            case "agregar":
                if(!this.telefonoExiste(telefono))
                {
                    c.agregarTelefono(telefono, tipoTelefono);
                }
                else
                {
                    System.out.println("El telefono no se puede agregar al contacto."
                            + "\n" + "El telefono ya esta asignado a uno de los"
                            + " contactos" + "\n"
                            + "ingrese un telefono distinto" +"\n\n");
                }
                break;
            case "modificar":
                if(!this.telefonoExiste(telefono))
                {
                    if(c.longitudListaTelefonos() > posicionTelefono &&
                        posicionTelefono >= 0)
                    {
                        c.modificarTelefonoEnPosicion(telefono, tipoTelefono, 
                            posicionTelefono);
                    }
                    else
                    {
                        System.out.println("Posicion fuera de rango. El telefono en la"
                            + " posicion " + posicionTelefono + " no existe"
                            + " para este contacto" + "\n"
                            + ". Intente ingresando una posicion valida" + "\n\n");
                    }
                }
                else
                {
                    System.out.println("El contacto no se puede modificar" + "\n"
                            + "El telefono ya esta asignado a uno de los"
                            + " contactos" + "\n"
                            + "ingrese un telefono distinto" +"\n\n");
                }                
                break;
            case "eliminar":
                if(c.longitudListaTelefonos() > posicionTelefono &&
                        posicionTelefono >= 0)
                {
                    c.eliminarTelefonoEnPosicion(posicionTelefono);
                }
                else
                {
                    System.out.println("El telefono no se puede eliminar" + "\n"
                            + "Posicion fuera de rango. El telefono en la"
                            + " posicion " + posicionTelefono + " no existe"
                            + " para este contacto" + "\n"
                            + ". Intente ingresando una posicion valida" + "\n\n");
                }                
                break;
        }
        
        this.almacenarContactos();
        
    }
    
    public Contacto getContactoPorNombre(String nombre)
    {
        Contacto retorno = null;
        
        for(Contacto contacto : agenda)
        {
            if(contacto.getNombre().equals(nombre))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    
    public Contacto getContactoPorApellido(String apellido)
    {
        Contacto retorno = null;
        
        for(Contacto contacto : agenda)
        {
            if(contacto.getApellido().equals(apellido))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    
    /*
    public Contacto getContactoPorNumeroTelefonico(int numeroTelefonico)
    {
        Contacto retorno = null;
        for(Contacto contacto : agenda)
        {
            if(contacto.getNumeroTelefono().equals(numeroTelefonico))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    */
    public Contacto getContactoPorCorreoElectronico(String correoElectronico)
    {
        Contacto retorno = null;
        for(Contacto contacto : agenda)
        {
            if(contacto.getCorreoElectronico().equals(correoElectronico))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    
    public Contacto getContactoPorAlias(String alias)
    {
        Contacto retorno = null;
        for(Contacto contacto : agenda)
        {
            if(contacto.getAlias().equals(alias))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    
    public Contacto getContactoPorDireccion(String direccion)
    {
        Contacto retorno = null;
        for(Contacto contacto : agenda)
        {
            if(contacto.getDireccion().equals(direccion))
            {
                retorno = contacto;
                break;
            }
        }
        return retorno;
    }
    
    public ArrayList<Contacto> buscarPorNombre(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.getNombre().equals(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
    
    public ArrayList<Contacto> buscarPorApellido(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.getApellido().equals(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
    
    public ArrayList<Contacto> buscarPorDireccion(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.getDireccion().equals(parametro))
            // if (contacto.getDireccion().contains(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
    
    public ArrayList<Contacto> buscarPorCorreoElectronico(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.getCorreoElectronico().equals(parametro))
            //if(contacto.getCorreoElectronico().contains(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }            
    public ArrayList<Contacto> buscarPorAlias(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.getAlias().equals(parametro))
            //if(contacto.getAlias().contains(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
    
    public ArrayList<Contacto> buscarPorTelefono(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for(Contacto contacto : agenda)
        {
            if(contacto.buscarTelefono(parametro))
            {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
            
    public ArrayList<Contacto> buscarPorParametro(String parametro)
    {
        ArrayList<Contacto> contactos = new ArrayList<>();
        
        for(Contacto contacto : agenda)
        {
            if(contacto.getNombre().equals(parametro) || 
                    contacto.getApellido().equals(parametro) ||
                    contacto.getCorreoElectronico().contains(parametro) ||
                    contacto.getCorreoElectronico().contains(parametro) ||
                    contacto.buscarTelefono(parametro) ||
                    contacto.getAlias().equals(parametro))
            {
                contactos.add(contacto);
            }
        }
        
        return contactos;
    }
    
    
}
