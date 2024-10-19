
package packag.mavenproject1;

import java.io.Serializable;
import java.util.ArrayList;


public class Registro implements Serializable
{
    
    boolean E_S;
    
    ArrayList<Producto> productos;
    
    String fecha;
   
    int dia=0, mes=0, año=0;
    
    
    public Registro(ArrayList<Producto> productos)
    {
        this.productos = productos;
    }
    
    public void setfecha(String fecha)
    {
        dia=1;
        mes=1;
        año=1;
        
        this.fecha = fecha;
    }
    
    
    public void añadirproductos(ArrayList<Producto> productos)
    {
        this.productos.addAll(productos);
    }
    
    public ArrayList<Producto> getProducto()
    {
        return productos;
    }
    
    public String getfecha()
    {
        return fecha;
    }
    
    public Producto getproducto(int i)
    {
        return productos.get(i);
    }
    
   public void addE_S(boolean a)
   {
       E_S = a;
   }
    
   public boolean getE_S()
   {
       return E_S;
   }
   
}
