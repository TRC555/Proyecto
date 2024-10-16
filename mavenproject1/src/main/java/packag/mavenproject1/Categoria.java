
package packag.mavenproject1;
import java.util.ArrayList;
import java.io.Serializable;

public class Categoria implements Serializable
{
    ArrayList<Producto> productos = new ArrayList<>();
    String nombre;
    
    public Categoria(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void addProduct(Producto producto)
    {
        productos.add(producto);
    }

    public Producto getProducto(int a)
    {
        return productos.get(a);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getProductosize()
    {
        return productos.size();
    }
    
    public ArrayList<Producto> getProductos()
    {
        return productos;
    }
    
    public int getSize()
    {
        return productos.size();
    }
    
}
