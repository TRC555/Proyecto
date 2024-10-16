
package packag.mavenproject1;
import java.util.ArrayList;
import java.io.Serializable;

public class Contraseña implements Serializable
{
    
    ArrayList<String> categorias = new ArrayList<>();
    
    int pin=0;
    
    int indicador=0;
    
    public void setPin(int a)
    {
        pin = a;
    }
    
    public int getPin()
    {
        return pin;
    }
    
    public void guardarCategoria(ArrayList<String> categorias)
    {
        this.categorias = categorias;
    }
    
    public ArrayList<String> cargarCategoria()
    {
        return this.categorias;
    }
    
    public void siguientei()
    {
        indicador=indicador+1;
    }
    
}
