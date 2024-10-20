
package packag.mavenproject1;

import java.io.Serializable;

public class Producto implements Serializable
{
    String factura;
    int precio, cantidad, preciocosto;
    String nombre, marca, estado, fechaingreso;
    
    public Producto(int precio, String nombre, int cantidad, int preciocosto, String marca, String estado, String fechaingreso)
    {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.preciocosto = preciocosto;
        this.marca = marca;
        this.estado = estado;
        this.fechaingreso = fechaingreso;
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
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getEstado()
    {
        return estado;
    }
    
    public String getfecha()
    {
        return fechaingreso;
    }
    
    public Producto copiar()
    {
        return new Producto(this.precio, this.nombre, this.cantidad, this.preciocosto, this.marca, this.estado, this.fechaingreso);
    }
    
}
