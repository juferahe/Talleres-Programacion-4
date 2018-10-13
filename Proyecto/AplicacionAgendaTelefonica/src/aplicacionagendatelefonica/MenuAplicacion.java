/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionagendatelefonica;
import java.util.Scanner;

/**
 *
 * @author Usuario 1
 */
public class MenuAplicacion {
    private AgendaTelefonica agenda;

    public MenuAplicacion() {
        this.agenda = new AgendaTelefonica();
        this.agenda.iniciar();
    }
    
    // BUSCAR CONTACTO, DEPENDIENDO DE SU IMPLEMENTACION
    // PUEDE TENER O NO UN SUBMENU QUE INDIQUE POR QUE CAMPO DEL
    // DEL REGISTRO CONTACTO DESEA HACERSE LA BUSQUEDA
    public void ejecutar()
    {
        llamarFuncionesMenuPrincipal();
    }
    
    private void opcionesMenu()
    {
        String opciones = "Menu Agenda Telefonica" + "\n\n" +
                "1- Mostrar Contactos" + "\n" +
                "2- Agregar Contacto" + "\n" +
                "3- Modificar Contacto" + "\n" +
                "4- Eliminar Contacto" + "\n" +
                "5- Buscar Contacto" + "\n" +
                "6- Exportar Contactos" + "\n" +
                "7- Importar Contactos" + "\n" +
                "8- Salir" + "\n";       
        System.out.print(opciones);
    }

    private void subMenuModificar()
    {
        String titulo = "\n\n" + "Menu Modificar Contacto" + "\n\n" +
                "Instrucciones" + "\n\n" +
                "A continuacion se mostraran en pantalla los contactos, " + "\n"
                + "comenzando por el primero, seguidos de un menu de opciones" +
                "\n"+ "Luego ingrese la opcion que desee ejecutar";

        System.out.print(titulo);
        //int opcion = capturarOpcion("Menu Modificar");
    }
    
    private void opcionesMenuModificar()
    {
        String opciones = "\n\n" +
                "1- Modificar Nombre" + "\n" +
                "2- Modificar Apellido" + "\n" +
                "3- Modificr Correo Electronico" + "\n" +
                "4- Modificar Direccion" + "\n" +
                "5- Modificar Alias" + "\n" +
                "6- Modificar Telefono" + "\n" +
                "7- Salir del menu" + "\n";

        System.out.print(opciones);    
    }
    
    private void controlesMenuModificar()
    {
        String opciones = 
                "1- Para ver contacto anterior" + "\n" +
                "2- Para ver contacto siguiente" + "\n" +
                "3- Para seleccionar el contacto a modificar" + "\n" +
                "4- Salir del menu" + "\n";

        System.out.print(opciones);     
    }
    
    private void subMenuBuscar()
    {
        String opciones = "\n\n" + "Menu Buscar Contacto" + "\n\n" +
                "1- Buscar por Nombre" + "\n" +
                "2- Buscar por Apellido" + "\n" +
                "3- Buscar por Correo Electronico" + "\n" +
                "4- Buscar por Direccion" + "\n" +
                "5- Buscar por Alias" + "\n" + 
                "6- Salir del menu" + "\n";
        // salir se puede cambiar con regresar al menu anterior
        System.out.print(opciones);
    }
    
    private void subMenuEliminar()
    {
        String titulo = "\n\n" + "Menu Eliminar" + "\n\n" +
                "Instrucciones" + "\n\n" +
                "A continuacion se mostraran en pantalla los contactos," + "\n" +
                "comenzando por el primero, seguidos por " +
                " un menu de opciones." + "\n" + "Despues ingrese la opcion que" + 
                " desee ejecutar" + "\n\n";
        System.out.print(titulo);
    }
    
    private void controlesMenuEliminar()
    {
        String opciones = 
                "1- Para ver contacto anterior" + "\n" +
                "2- Para ver contacto siguiente" + "\n" +
                "3- Para seleccionar contacto que desea borrar" + "\n" +
                "4- Salir del menu" + "\n";
        System.out.print(opciones);
    }
    
    private void subMenuModificarTelefono()
    {
        String opciones = "\n\n" +
        "Que operacion desea realizar con el telefono" + "\n\n" +
        "1- Agregar telefono" + "\n" + 
        "2- Modificar telefono" + "\n" +
        "3- Eliminar telefono" + "\n" +
        "4- salir menu modificar telefono" + "\n";
        System.out.print(opciones);    
    }
    
    private void imprimirMensajeSalida()
    {
        System.out.println("\n" + "Usted ha decido terminar la aplicacion."
        + " Hasta Luego" + "\n");
    }
    
    private String[] capturarDatos()
    {
        String [] aRetornar = new String[7];
        String [] telefono = new String[2]; // tal vez este campo y sus valores den problema en el futuro
        String nombre = ingresarNombre();
        String apellido = ingresarApellido();
        String direccion = ingresarDireccion();
        telefono = ingresarTelefono();
        String correoElectronico = ingresarCorreoElectronico();
        String alias = ingresarAlias();
        
        aRetornar[0] = nombre;
        aRetornar[1] = apellido;
        aRetornar[2] = direccion;
        aRetornar[3] = telefono[0];
        aRetornar[4] = telefono[1];
        aRetornar[5] = correoElectronico;
        aRetornar[6] = alias;
        
        return aRetornar;
    }
    
    private String ingresarCorreoElectronico()
    {
        String correo = "";
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese correo electronico: ");
            correo = sc.nextLine();
            
            //if(!correo.matches("[a-z][a-z0-9]@[a-z0-9]\\.[a-z]+"))
            if(!correo.matches("^(.+)@(.+)$"))
            {
                System.out.print("Formato de Correo no valido."
                        + "Ingrese el correo electronico nuevamente");
            } else {
                valido = true;
            }
        }
     return correo;     
    }
    
    private String ingresarNombre()
    {
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese nombre del contacto: ");
            nombre = sc.nextLine();
            
            if(!nombre.matches("[a-zA-Z][a-z]+"))
            {
                System.out.println("Nombre no valido."
                        + "Ingrese un nombre nuevamente");
            }
            else
            {
                valido = true;
            }
        }
        return nombre;
    }
    
    private String ingresarApellido()
    {
        String apellido = "";
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese apellido del contacto: ");
            apellido = sc.nextLine();
            
            if(!apellido.matches("[a-zA-Z][a-z]+"))
            {
                System.out.println("Apellido no valido."
                        + " Ingrese un nombre nuevamente");
            }
            else
            {
                valido = true;
            }
        }
        return apellido;
    }    

    private String ingresarAlias()
    {
        String alias = "";
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese alias del contacto"
                    + " (consistente solo de letras y/o numeros"
                    + " sin caracteres especiales): ");
            alias = sc.nextLine();
            
            if(!alias.matches("[a-zA-Z0-9]*"))
            {
                System.out.println("Alias no valido."
                        + " Ingrese un alias nuevamente");
            }
            else
            {
                valido = true;
            }
        }
        return alias;
    }
    private String[] ingresarTelefono()
    {
        String telefono = "";
        String tipo = "";
        String [] aRetornar = new String[2];
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese telefono del contacto: ");
            telefono = sc.nextLine();
            System.out.print("Ingrese tipo de telefono (fijo o celular): ");
            tipo = sc.nextLine();
            
            if(tipo.toLowerCase().equals("fijo"))
            {
                if(!telefono.matches("[0-9]{7}"))
                {
                    System.out.println("Telefono fijo no valido."
                        + " Ingrese un telefon que contenga 7 digitos");
                }
                else
                {
                    valido = true;
                }
            }
            else if (tipo.toLowerCase().equals("celular"))
            {
                if(!telefono.matches("[0-9]{10}"))
                {
                    System.out.println("Telefono celular no valido."
                            + " Ingrese un telefono que contenga 10 digitos");
                }
                else
                {
                    valido = true;
                }
            }
            else
            {
                System.out.println("Tipo de telefono no valido."
                        + " Por favor ingrese un tipo de telefono valido"
                        + " (fijo o celular)");
            }    
        }
        aRetornar[0] = telefono;
        aRetornar[1] = tipo;
        return aRetornar;
    }
    
    // ingresar direccion - modificar expresion regular
    private String ingresarDireccion()
    {
        String direccion = "";
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido)
        {
            System.out.print("Ingrese direccion del contacto(cadena de numeros sin espacios): ");
            direccion = sc.nextLine();
            
            if(!direccion.matches("[0-9]+"))
            {
                System.out.println("Formato de direccion no valida."
                        + "Ingrese una direccion nuevamente");
            }
            else
            {
                valido = true;
            }
        }
        return direccion;
    }
    
    // tengo que agregar el tipo de opcion para saber con que limites
    // operar porque los menus tienen un rango distinto de opciones validas
    private int capturarOpcion(String tipoOpcion)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean opcionCorrecta = false;
        while(!opcionCorrecta)
        {
            while(!sc.hasNextInt())
            {
                sc.next();
                System.out.println("Dato no valido. Por favor ingrese un numero");
                System.out.print("Ingrese Opcion: ");
            }
            opcion = sc.nextInt();
            opcionCorrecta = verificarOpcion(opcion, tipoOpcion);
            //sc.next();
        }
        
        return opcion;
    }
    
    private boolean verificarOpcion(int opcion, String tipoOpcion)
    {
        boolean correcto = false;
        switch (tipoOpcion) {
            case "Menu Principal":
                if (opcion >= 1 && opcion <= 8)
                {
                    correcto = true;
                }
                else
                {
                    System.out.println("Opcion no valida. Por favor ingrese una opcion"
                        + " valida");
                    System.out.print("Ingrese Opcion: ");
                }break;
                
            case "SubMenu Modificar":
            //case "Menu Eliminar":
                if (opcion >= 1 && opcion <= 7)
                {
                    correcto = true;
                }
                else
                {
                    System.out.println("Opcion no valida. Por favor ingrese una opcion"
                        + " valida");
                    System.out.print("Ingrese Opcion: ");
                }break;
            
            case "Menu Eliminar":
            case "Menu Modificar":
            case "Menu Modificar Telefono":
                if (opcion >= 1 && opcion <= 4)
                {
                    correcto = true;
                }
                else
                {
                    System.out.println("Opcion no valida. Por favor ingrese una"
                            + " opcion valida");
                    System.out.print("Ingrese Opcion: ");
                }break;
            
            //case "SubMenu Modificar":
            case "Menu Buscar":
                if (opcion >= 1 && opcion <= 6)
                {
                    correcto = true;
                }   
                else
                {
                    System.out.println("Opcion no valida. Por favor ingrese una opcion"
                        + " valida");
                    System.out.print("Ingrese Opcion: ");
                }break;

            default:
                ;
        }
        return correcto;
    }
    
    private void llamarFuncionesMenuPrincipal()
    {
        boolean continuar = true;
        int opcion = 0;
        while(continuar)
        {
            this.opcionesMenu();
            System.out.print("Ingrese Opcion: ");
            opcion = this.capturarOpcion("Menu Principal");
            switch(opcion)
            {
                case 1:
                    System.out.println("\n");
                    this.agenda.mostrarContactos();
 
                    break;
                case 2:
                    //System.out.println("Se agrego Contacto");
                    this.agenda.agregarContacto(capturarDatos());
                    break;
                case 3:
                    //System.out.println("Modificar Contacto");
                    this.subMenuModificar();
                    this.llamarFuncionesMenuModificar();
                    break;
                case 4:
                    //System.out.println("Eliminar Contacto");
                    this.subMenuEliminar();
                    this.llamarFuncionesMenuEliminar();
                    break;
                case 5:
                    //System.out.println("Buscar Contacto");
                    this.subMenuBuscar();
                    this.llamarFuncionesMenuBuscar();
                    break;
                case 6:
                    agenda.exportarContactos();
                    System.out.println("\n"
                            + "Archivo exportado" + "\n"
                            + "El archivo fue exportado al directorio que" + "\n"
                            + "almacena la aplicacion");
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("Pendiente por agregar\n\n");
                    break;
                case 8:
                    imprimirMensajeSalida();
                    agenda.almacenarContactos();
                    agenda.cerrarArchivo();
                    continuar = false;
                    break;
                default:
                    ;
            }
        }
    }
  
    //private void llamarFuncionesMenuEliminar(int opcion)
    private void llamarFuncionesMenuEliminar()
    {
        int indice = 0;
        boolean continuar = true;
        int opcion;
        // this.subMenuEliminar();        
        while(continuar)
        {
            this.agenda.mostrarContacto(indice);
            this.controlesMenuEliminar();
            System.out.print("Ingrese opcion: ");
            opcion = capturarOpcion("Menu Eliminar");
            System.out.println("\n");
            
            switch(opcion)
            {
                case 1:
                    if(!agenda.agendaVacia())
                    {    
                        if(agenda.getNumeroContactos() > 1)
                        {
                            indice -= 1;
                            indice = indice < 0? agenda.getNumeroContactos() - 1:
                                    indice;
                        }
                            
                        else
                        {
                            indice = 0;
                        }
                    }
                    else
                    {
                        indice = 0;
                    }
                    //System.out.println("Posicion: " + indice);
                    break;
                case 2:
                    if(!agenda.agendaVacia())
                    {
                        if(agenda.getNumeroContactos() > 1)
                        {
                            indice += 1;
                            indice = indice > agenda.getNumeroContactos() - 1?
                                    0 : indice;
                        }
                        else
                        {
                            indice = 0;
                        }
                    }
                    else
                    {
                        indice = 0;
                    }
                    //System.out.println("Posicion: " + indice);
                    break;
                case 3:
                    if(!agenda.agendaVacia())
                    {
                        this.agenda.eliminarContacto(indice);
                        //indice = indice == 0? 0 : indice - 1;
                    }
                    else{
                        System.out.println("No hay contactos que eliminar."
                                + " La agenda esta vacia");
                    }
                    indice = 0;
                    break;

                case 4:
                    continuar = false;
                    //System.out.println("Opcion: " + opcion + " Continuar: " + continuar);
                    break;
                default:
                    ;
            }
        }
    }
  
    private void llamarFuncionesMenuModificar()
    {
        int opcion;
        int indice = 0;
        boolean  continuar = true;
        while(continuar)
        {
            System.out.println("\n");            
            this.agenda.mostrarContacto(indice);
            this.controlesMenuModificar();
            System.out.print("Ingrese Opcion: ");
            opcion = this.capturarOpcion("Menu Modificar");
            switch(opcion)
            {
                case 1:
                    if(!agenda.agendaVacia())
                    {
                        if(agenda.getNumeroContactos() > 1)
                        {
                            indice -= 1;
                            indice = indice < 0? agenda.getNumeroContactos() - 1:
                                    indice;
                        }
                            
                        else
                        {
                            indice = 0;
                        }
                    }
                    else
                    {
                        indice = 0;
                    }
                    break;
                case 2:
                    if(!agenda.agendaVacia())
                    {
                        if(agenda.getNumeroContactos() > 1)
                        {
                            indice += 1;
                            indice = indice > agenda.getNumeroContactos() - 1?
                                    0 : indice;
                        }
                        else
                        {
                            indice = 0;
                        }
                    }
                    else
                    {
                        indice = 0;
                    }
                    break;
                case 3:
                    if(!agenda.agendaVacia())
                    {
                        llamarFuncionesSubMenuModificar(indice);
                    }
                    else
                    {
                        System.out.println("La agenda esta vacia."
                                + " No hay contactos que modificar");
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
    
    private void llamarFuncionesSubMenuModificar(int indice)
    {
        this.opcionesMenuModificar();
        System.out.print("Ingrese opcion: ");
        String parametro = null;
        String campo = null;
        int opcion = this.capturarOpcion("SubMenu Modificar");
        switch(opcion)
        {
            case 1:
                System.out.println("Ingresar el nuevo nombre");
                //String nombre = this.ingresarNombre();
                parametro = this.ingresarNombre();
                campo = "nombre";
                break;
            case 2:
                System.out.println("Ingresar el nuevo apellido");
                //String apellido = this.ingresarApellido();
                parametro = this.ingresarApellido();
                campo = "apellido";
                break;
            case 3:
                System.out.println("Ingresar el nuevo correo electronico");
                //String correo = this.ingresarCorreoElectronico();
                parametro = this.ingresarCorreoElectronico();
                campo = "correo";
                break;
            case 4:
                System.out.println("Ingresar nueva direccion");
                //String direccion = this.ingresarDireccion();
                parametro = this.ingresarDireccion();
                campo = "direccion";
                break;
            case 5:
                System.out.println("Ingresar nuevo alias");
                parametro = this.ingresarAlias();
                campo = "alias";
                break;
            case 6:
                llamarFuncionesModificarTelefono(indice);
                break;
            case 7:
                break;
            default:
                break;
        }
        if(opcion != 6 && opcion != 7)
        {
            //boolean expr = opcion != 6 || opcion != 7;
            //System.out.println("Evaluacion de expresion" + expr);
            System.out.println("Opcion: " + opcion);
            agenda.modificarContacto(indice, campo, parametro);
        }
    }
public int capturarPosicionTelefono() 
{
    Scanner sc = new Scanner(System.in);
    boolean opcionCorrecta = false;
    int numero = 0;
    while(!opcionCorrecta)
    {
        while(!sc.hasNextInt())
        {
            sc.next();
            System.out.println("Dato no valido. Por favor ingrese un numero");
            System.out.print("Ingrese la posicion del telefono que desea "
                + " modificar (numero entero): ");
        }
        opcionCorrecta = true;
        numero = sc.nextInt();
    }
    return numero;
}        
    
    private void llamarFuncionesModificarTelefono(int posicion)
    {
        int opcion = 0;
        int posicionTelefono = 0;
        String [] telefono = new String[2];
        
        subMenuModificarTelefono();
        System.out.print("Ingrese Opcion: ");
        opcion = capturarOpcion("Menu Modificar Telefono");
        //String [] telefono = this.ingresarTelefono();

        Scanner sc = new Scanner(System.in);
        switch(opcion)
        {
            case 1:
                System.out.println("Agregar Telefono");
                
                telefono = this.ingresarTelefono();  
                
                agenda.modificarTelefonoContacto(posicion, "agregar", 
                        telefono[0], telefono[1], posicionTelefono);
                break;
                
            case 2:
                System.out.println("Modificar Telefono");
                
                telefono = this.ingresarTelefono();
                
                System.out.print("Ingrese la posicion del telefono que desea "
                        + " modificar (numero entero): ");
                
                posicionTelefono = capturarPosicionTelefono();
                
                agenda.modificarTelefonoContacto(posicion, "modificar", 
                        telefono[0], telefono[1],posicionTelefono - 1);
                break;
                
            case 3:
                System.out.println("Eliminar Telefono");
                
                System.out.print("Ingrese la posicion del telefono que desea "
                        + " modificar (numero entero): ");
                
                posicionTelefono = capturarPosicionTelefono();
                
                System.out.println("Posicion telefono: " + posicionTelefono);
                
                agenda.modificarTelefonoContacto(posicion, "eliminar", 
                        "", "", posicionTelefono - 1);                
                break;
            case 4:
                break;
        }
            
    }
    
    private void llamarFuncionesMenuBuscar()
    {
        System.out.print("Ingresar Opcion: ");
        int opcion = this.capturarOpcion("Menu Buscar");
        String parametro = null;
        switch(opcion)
        {
            case 1:
                parametro = this.ingresarNombre();
                System.out.println("\n" + "Resultado de busqueda por nombre"
                + "\n");                
                agenda.mostrarContactos(agenda.buscarPorNombre(parametro));

                break;
            case 2:
                parametro = this.ingresarApellido();
                System.out.println("\n"+ "Resultado de busqueda por apellido"
                        + "\n"); 
                agenda.mostrarContactos(agenda.buscarPorApellido(parametro));
                               
                break;
            case 3:
                parametro = this.ingresarCorreoElectronico();
                System.out.println("\n"+ "Resultado de busqueda por correo"
                        + " electronico" + "\n");
                agenda.mostrarContactos(agenda.buscarPorCorreoElectronico(parametro));
                                
                break;
            case 4:
                parametro = this.ingresarDireccion();
                System.out.println("\n" + "Resultado de busqueda por direccion"
                        + "\n");
                agenda.mostrarContactos(agenda.buscarPorDireccion(parametro));
                                
                break;
            case 5:
                parametro = this.ingresarAlias();
                System.out.println("\n");
                agenda.mostrarContactos(agenda.buscarPorAlias(parametro));
                                
                break;
            case 6:
                break;
            default:
                ;
        }
    }    
}
