
package packag.mavenproject1;

import java.util.ArrayList;

public class Informe 
{
    ArrayList<Registro> registro = new ArrayList<>();
    ArrayList<Categoria> categoria = new ArrayList<>();
    
    public Informe(ArrayList<Registro> registro, int a)
    {
        this.registro = registro;
    }
    
    public Informe(ArrayList<Categoria> categoria)
    {
        this.categoria = categoria;
    }
    
    public Informe(ArrayList<Registro> registro, ArrayList<Categoria> categoria)
    {
        this.registro = registro;
        this.categoria = categoria;
    }
    
    public ArrayList<Registro> getRegistro()
    {
        return registro;
    }
    
    public ArrayList<Categoria> getCategoria()
    {
        return categoria;
    }
    
}
