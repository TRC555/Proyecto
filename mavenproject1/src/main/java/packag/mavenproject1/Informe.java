
package packag.mavenproject1;

import java.util.ArrayList;

public class Informe 
{
    ArrayList<Registro> registro = new ArrayList<>();
    ArrayList<Categoria> categoria = new ArrayList<>();
    
    public Informe(ArrayList<Registro> registro, int a)
    {
        ArrayList<Registro> mediador = new ArrayList<>(registro);
        
        registro = mediador;
    }
    
    public Informe(ArrayList<Categoria> categoria)
    {
        ArrayList<Categoria> mediador = new ArrayList<>(categoria);
        
        this.categoria = mediador;
    }
    
    public Informe(ArrayList<Registro> registro, ArrayList<Categoria> categoria)
    {
        
        ArrayList<Registro> mediador1 = new ArrayList<>(registro);
        
        ArrayList<Categoria> mediador2 = new ArrayList<>(categoria);
        
        this.registro = mediador1;
        this.categoria = mediador2;
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
