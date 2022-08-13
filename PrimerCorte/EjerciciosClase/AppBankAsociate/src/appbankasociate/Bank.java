package appbankasociate;

import java.util.ArrayList;


public class Bank {
    
    private String nombre;
    
    private ArrayList<Employed> empleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Employed> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Employed> empleados) {
        this.empleados = empleados;
    }

    public Bank(String nombre) {
        this.nombre = nombre;
    }

    public Bank() {
    }

    public void mostrarEmpleados(){
       System.out.println("Listados de empleados del banco "+this.nombre);
       for(Employed e: this.empleados){
           System.out.println("Nombre: "+e.getNombre());
       }    
    }
    
    
}
