package apppublicacion;

import java.util.ArrayList;


public class Ventas {
    
    private ArrayList<Publicacion> listVentas;

    public Ventas() {
        listVentas=new ArrayList<Publicacion>();
    }

    public ArrayList<Publicacion> getListVentas() {
        return listVentas;
    }

    public void setListVentas(ArrayList<Publicacion> listVentas) {
        this.listVentas = listVentas;
    }
    
    public void newVenta(Publicacion publicacion){
        this.listVentas.add(publicacion);
    }
    
    public void mostrarVentas(){
      
        for(int i=0;i<this.listVentas.size();i++){
            this.listVentas.get(i).mostrar();
        }
    
    }
    
    
    
    
}
