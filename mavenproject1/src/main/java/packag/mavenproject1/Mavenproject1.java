
package packag.mavenproject1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Mavenproject1 {
    
    
    //Main
    
    public static void main(String[] args) throws InterruptedException 
    {   
        ArrayList<Registro> registro = new ArrayList<>();
        
        ArrayList<Categoria> categoria = new ArrayList<>();
        
        Contraseña pin = new Contraseña();
        
        int menu1;
        
        if(leerBinario("Guardado\\Contraseña.bin")!=null)
        {
            if(leerInformacion("Guardado\\Informacion.bin")!=null)
            {
                categoria = leerInformacion("Guardado\\Informacion.bin");
            }
            
            pin = leerBinario("Guardado\\Contraseña.bin");
        }
        else
        {
            pin.setPin(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nuevo ping: ")));
        }
        
        if(leerRegistro()!=null)
        {
            registro = leerRegistro();
        }
        
        for(int i=0; i!=1;)
        {
            
            //JOptionPane.showMessageDialog(null, "Valor de reporte: "+registro.size());
            
            Menu_Principal menu = new Menu_Principal();
            
            menu.Fondodemenu();
            
            menu.setVisible(true);
            
            for(boolean a=true; a!=menu.estado;)
            {
                
            }
            
            menu.setVisible(false);
            
            menu1 = menu.i;
            
            switch(menu1)
            {
                case 1:

                    if(categoria.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Aun no hay categorias");
                    }
                    else
                    {
                        
                        Informe guardado;
                        
                        ArrayList<Registro> registro2 = new ArrayList<>();
                        
                        registro2.addAll(registro);
                        
                        guardado = IngresarVenta(categoria,registro2, pin.indicador);
                        
                        if(guardado.getRegistro()!=null)
                        {
                            if(guardado.getRegistro().isEmpty())
                            {
                                categoria = guardado.getCategoria();
                            }
                            else
                            {
                                registro = guardado.getRegistro();
                                categoria = guardado.getCategoria();
                            }
                            
                        }
                        
                        
                        
                    }
                    
                    break;

                case 2:
                    
                    if(categoria.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Aun no se crean categorias");
                    }
                    else
                    {
                        Inventario inventario = new Inventario();
            
                        inventario.Fondodemenu();
                        
                        inventario.setCategoria(categoria);
                        
                        inventario.setVisible(true);
                        
                        for(boolean a=true; a!=inventario.estado;)
                        {
                           TimeUnit.MILLISECONDS.sleep(50);
                        }

                        inventario.setVisible(false);
                        
                        while(inventario.terminar!=true)
                        {
                            TimeUnit.MILLISECONDS.sleep(50);
                        }
                        
                    }
                    
                    
                    break;
                    
                case 3:

                    String as;
                    int b;
                    
                   as = JOptionPane.showInputDialog(null, "Ingrese el pin:");
                    
                   if(as!=null)
                   {
                       
                   }
                   
                   if(as!=null)
                   {
                       try
                       {
                           b = Integer.parseInt(as);
                   
                           if(b==pin.getPin())
                            {
                                
                               
                               Informe add; 
                                
                               add = MenuAdministrador(categoria, registro, pin);
                               
                               categoria = add.getCategoria();
                                       
                               registro = add.getRegistro();
                               
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "pin incorrecto");
                            }
                       }
                       catch(Exception error)
                       {
                            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
                       }
                       
                   }
                   else
                   {
                       
                   }
                   
                    break;
                    
                case 4:
                    
                    i=1;
                
                    break;
                    
                case 5:
                    
                    
                    Fecha menu_fecha = new Fecha();
                    
                    for(boolean a=true; a!=menu_fecha.estado; )
                    {
                        menu_fecha.setVisible(true);
                    }
                    
                    menu_fecha.setVisible(false);
                    
                    boolean indicador=false;
                    
                    if(menu_fecha.cancelar==false)
                    {
                      
                        if(registro.isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "aun no hay ventas");
                        }
                        else
                        {
                           for(int z=0; z<registro.size(); z++)
                            {
                                if(menu_fecha.fecha.equals(registro.get(z).fecha))
                                {
                                    indicador=true;
                                }
                            }


                            if(registro.get(registro.size()-1).fecha==null && indicador==false)
                            {
                                registro.get(registro.size()-1).setfecha(menu_fecha.fecha);
                            }
                            else
                            {
                                if(indicador==true)
                                {
                                    JOptionPane.showMessageDialog(null, "Fecha ya registrada");
                                }
                                else
                                {
                                    
                                    if(registro.get(registro.size()-1).fecha!=null)
                                    {
                                        JOptionPane.showMessageDialog(null, "El dia de hoy no se registran ventas");        
                                    }
                                    else
                                    {
                                        registro.get(registro.size()-1).setfecha(menu_fecha.fecha);
                                    }
                                }

                            }
                        }
                        
                                                
                    }
                    else
                    {
                        
                    }
                    
                  
                    
                    break;
                
                case 6:
                    
                    if(registro==null)
                    {
                        
                    }
                    else
                    {
                        
                        Reporte(registro);
                    }
                    
                    
                    break;
                    
                case 7:
                    
                    int pin2;
                    
                    pin2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la contraseña para borrar toda la informacion: "));
                    
                    if(pin2!=pin.getPin())
                    {
                        JOptionPane.showMessageDialog(null, "");
                    }
                    else
                    {
                        categoria.clear();
                        registro.clear();
                        pin=null;
                    }
                    
                    break;
                    
                case 8:
                    
                    registro.trimToSize();
                    
                    for(int j=0; j<registro.size(); j++)
                    {
                        
                        registro.trimToSize();
                        
                        for(int k=j+1; k<registro.size(); k++)
                        {
                            
                            registro.trimToSize();
                           
                            if(registro.get(j).getproducto(0).getnombre3().equals(registro.get(k).getproducto(0).getnombre3()) && registro.get(j).getproducto(0).getfecha().equals(registro.get(k).getproducto(0).getfecha()) && registro.get(k).getE_S()==registro.get(j).getE_S() && registro.get(k).getproducto(0).getPrecio()==registro.get(j).getproducto(0).getPrecio())
                            {
                                
                                registro.get(j).getproducto(0).setCantidad(registro.get(j).getproducto(0).getCantidad()+registro.get(k).getproducto(0).getCantidad());
                                
                                registro.remove(k);
                              
                            }
                            
                        }
                        
                    }
                    
                    Kardex(registro);
                    
                    break;
                    
            }
            
            GuardarRegistro(registro);
            GuardarInformacion(categoria);
            GuardarDatosGenerales(pin);
            
        }
        System.exit(0);
    }
    
    //Guardado de informacion
    
    public static void GuardarInformacion(ArrayList<Categoria> historial)
    {
        try
        {
            
            FileOutputStream archivo = new FileOutputStream("Guardado\\Informacion.bin");
            try (ObjectOutputStream escritura = new ObjectOutputStream(archivo)) {
                escritura.writeObject(historial);
            }
            
        }
        catch(IOException error)                                                                        //metodo de escritura de archivo binario
        {           
            error.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No se pudo guardar la informacion general");
        }
        
        
    }
    
    public static ArrayList<Categoria> leerInformacion(String ruta)
    {
        try 
        {
            
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( ruta ));
            
            ArrayList<Categoria> his = (ArrayList<Categoria>) file.readObject();                                      //Metodo de lectura de archivo binario
            
            file.close();
            
            return his;
            
        } 
        
        catch (ClassNotFoundException | IOException ex) 
        {
             System.out.println(ex);
        }
        
        return null;
    }
                                                                            
    public static void GuardarDatosGenerales(Contraseña historial)
    {
        try
        {
            
            FileOutputStream archivo = new FileOutputStream("Guardado\\Contraseña.bin");
            try (ObjectOutputStream escritura = new ObjectOutputStream(archivo)) {
                escritura.writeObject(historial);
            }
            
        }
        catch(IOException error)                                                                        //metodo de escritura de archivo binario
        {           
            error.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No se pudo guardar la informacion general");
        }
        
        
    }                                                               //BLOQUE DE GUARDADO Y CARGADO
    
    public static Contraseña leerBinario(String ruta)
    {
        try 
        {
            
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( ruta ));
            
            Contraseña his = (Contraseña) file.readObject();                                      //Metodo de lectura de archivo binario
            
            file.close();
            
            return his;
        } 
        
        catch (ClassNotFoundException | IOException ex) 
        {
             System.out.println(ex);
        }
        
        return null;
    }
    
    public static void GuardarRegistro(ArrayList<Registro> registro)
    {
       try
        {
            
            FileOutputStream archivo = new FileOutputStream("Guardado\\Registro.bin");
            try (ObjectOutputStream escritura = new ObjectOutputStream(archivo)) {
                escritura.writeObject(registro);
            }
            
        }
        catch(IOException error)                                                                        //metodo de escritura de archivo binario
        {           
            error.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No se pudo guardar la informacion general");
        } 
    }
    
    public static ArrayList<Registro> leerRegistro()
    {
        try 
        {
            
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( "Guardado\\Registro.bin" ));
            
            ArrayList<Registro> his = (ArrayList<Registro>) file.readObject();                                      //Metodo de lectura de archivo binario
            
            file.close();
            
            return his;
        } 
        
        catch (ClassNotFoundException | IOException ex) 
        {
             System.out.println(ex);
        }
        
        return null;
    }
    
    //Funciones operacionales
    
    public static Informe IngresarVenta(ArrayList<Categoria> categoria, ArrayList<Registro> registro, int indicador) throws InterruptedException
    {
       
        Informe retorno;
        
        Ingresar_venta menuventa = new Ingresar_venta();
        
        menuventa.Fondodemenu();
        
        menuventa.setCombobox(categoria);
        
        menuventa.setVisible(true);
        
        for(boolean a=true; a!=menuventa.getestado();)
        {
             TimeUnit.MILLISECONDS.sleep(50);
        }
        
        menuventa.setVisible(false);
            
        if(menuventa.getcancelar() == true)
        {
            
            retorno = new Informe(categoria);
            
            return retorno;
            
        }
        else
        {
           
            ArrayList add = new ArrayList<>();
            
            add = menuventa.getRegistro();
            
            int cola;
            
            cola = registro.size();
            
            if(registro.isEmpty())
            {
                Registro add2 = new Registro(add);
                registro.add(add2);
            }
            else
            {
                
                Registro add2 = new Registro(add);
                registro.add(add2);
                
            }
            
            
            
        }
        
        retorno = new Informe(registro, categoria);
        
        return  retorno; 
    }
    
    public static Informe MenuAdministrador(ArrayList<Categoria> categoria, ArrayList<Registro> registro, Contraseña pin) throws InterruptedException
    {
       int menu;
       
       Menu_Administrador Jframe = new Menu_Administrador();
            
       Jframe.setCategoria(categoria);
       
        Jframe.Fondodemenu();
        
       
        for(int i=0; i!=1;)
        {
            
            Jframe.estado=false;    

            Jframe.setVisible(true); 
            
            for(boolean a=true; a!=Jframe.estado;)
            {
                
                TimeUnit.MILLISECONDS.sleep(50);
            }

            Jframe.setVisible(false);

            menu = Jframe.i;

            switch(menu)
            {
               case 1:

                   String nombre_categoria;

                   nombre_categoria = JOptionPane.showInputDialog(null, "Ingrese el nombre de la categoria a crear: ");

                   if(nombre_categoria!=null)
                   {
                       Categoria categoria_add = new Categoria(nombre_categoria); 

                       categoria.add(categoria_add);
                   }
                   
                   

                   break;

               case 2:

                   if(categoria.isEmpty())
                   {
                        JOptionPane.showMessageDialog(null, "Aun no se crean categorias");
                   }
                   else
                   {

                        crear_producto menu_producto = new crear_producto();

                        menu_producto.setCategoria(categoria);

                        menu_producto.setVisible(true); 
                        
                        for(boolean a=true; a!=menu_producto.estado;)
                        {
                           TimeUnit.MILLISECONDS.sleep(50);
                        }

                        menu_producto.setVisible(false);
                        
                        if(categoria!=null)
                        {
                            categoria = menu_producto.categoria;
                        }
                     
                        registro.add(menu_producto.registro);
                        
                   }

                   break;

               case 3:

                   int seleccion;

                   seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Se borrara toda la informacion\n\n"
                                                                   +"1)Confirmar\n"
                                                                   +"2)Cancelar"));

                    if(seleccion == 1)
                    {
                        categoria.clear();
                        registro.clear();
                        registro.clear();
                        pin.indicador=0;
                        pin=null;
                    }
                    else
                    {

                    }   

                   break;

               case 4:

                   Ingresar_productos productos = new Ingresar_productos();

                   productos.setCombobox(categoria);

                   productos.setVisible(true);
                   
                   for(boolean a=true; a!=productos.estado;)
                   {
                       TimeUnit.MILLISECONDS.sleep(50);
                   }

                   productos.setVisible(false);
                   
                   Registro report = new Registro(productos.registro);
                   
                   report.addE_S(true);
                   
                   
                   
                   registro.add(report);

                   break;

               case 5:

                   i=1;

                   break;

               case 6:

                   Modificar_inventario ventana = new Modificar_inventario();
                   
                   ventana.setCategoria(categoria);
                   
                   ventana.setVisible(true);
                   
                   for(boolean a=true; a!=ventana.estado ; )
                   {
                       TimeUnit.MILLISECONDS.sleep(50);
                       
                   }
                   
                   ventana.setVisible(false);
                   
                   if(ventana.confirmacion==true)
                   {
                       categoria = ventana.categoria;
                   }
                   
                   
                   
                   break;
            }
        }
        
        GuardarInformacion(categoria);
        GuardarDatosGenerales(pin);
        GuardarRegistro(registro);
      
        if(leerBinario("Guardado\\Contraseña.bin")!=null)
        {
            if(leerInformacion("Guardado\\Informacion.bin")!=null)
            {
                categoria = leerInformacion("Guardado\\Informacion.bin");
            }
            
            pin = leerBinario("Guardado\\Contraseña.bin");
        }
        else
        {
            pin.setPin(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nuevo ping: ")));
        }
        
        if(leerRegistro()!=null)
        {
            registro = leerRegistro();
        }
       
        
        Informe info = new Informe(registro, categoria);
        
        return info;
   }
  
    public static void Reporte(ArrayList<Registro> registro) throws InterruptedException
    {
        
        
        
            ArrayList<Registro> provisional = new ArrayList<>(registro);
        
            Collections.reverse(provisional);

            Reporte_Excel ventana = new Reporte_Excel();

            ventana.Fondodemenu();

            ventana.setComboboxes(provisional);

            ventana.setVisible(true);

            for(boolean a=true; a!=ventana.estado;)
            {

                TimeUnit.MILLISECONDS.sleep(50);

            }

            ventana.setVisible(false);
            
            while(ventana.terminar!=true)
            {
                TimeUnit.MILLISECONDS.sleep(50);       
            }
            
            if(ventana.estado2 == true)
            {
                
                Modificar_reportes ventana2 = new Modificar_reportes();
                
                ventana2.setReportes(registro);
                    
                ventana2.setVisible(true);
                
                for(boolean b=true; b!=ventana2.estado; )
                {
                    TimeUnit.MILLISECONDS.sleep(50);
                }
                
                ventana2.setVisible(false);
                
            }
    }

    public static void Kardex(ArrayList<Registro> registros) throws InterruptedException
    {
     
       Kardex ventana = new Kardex(); 
       
       ventana.setVisible(true);
       
       ventana.setinformacion(registros);
       
        while(ventana.estado!=true)
        {
            TimeUnit.MILLISECONDS.sleep(50);
        }

        ventana.setVisible(false);
     
    }
}   

