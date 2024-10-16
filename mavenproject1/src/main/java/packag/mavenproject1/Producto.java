
package packag.mavenproject1;

import java.io.Serializable;

public class Producto implements Serializable
{
    String factura;
    int precio, cantidad, preciocosto;
    String nombre;
    
    public Producto(int precio, String nombre, int cantidad, int preciocosto)
    {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.preciocosto = preciocosto;
    }
    
    public String getnombre3()
    {
        return nombre;
    }
    
    public String getNombre()
    {
        return "("+cantidad+")"+" "+nombre+" "+"Precio: "+precio;
    }
    
    public String getNombre2()
    {
        return nombre+"---"+"Precio: "+precio+"---";
    }
    
    public String getNombreYCantidad()
    {
        return nombre+"---"+"Precio: "+precio+"---"+"Cantidad: "+cantidad+"---"+"Total: "+cantidad*precio;
    }
    
    public int getpreciocosto()
    {
        return preciocosto;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setfactura(String factura)
    {
        this.factura = factura;
    }
    
    public String getfactura()
    {
        return factura;
    }
    
    public int getPrecio()
    {
        return precio;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }
    
    public void setPrecioCosto(int preciocosto)
    {
        this.preciocosto = preciocosto;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
}