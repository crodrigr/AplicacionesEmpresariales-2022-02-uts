
package appbankasociate;

import java.util.ArrayList;


public class AppBankAsociate {  
    public static void main(String[] args) {
        
        Employed emp1=new Employed("Camilo");
        Employed emp2=new Employed("Juan");
        
        ArrayList<Employed> empleados=new ArrayList<Employed>();
        
        empleados.add(emp1);
        empleados.add(emp2);
                       
        Bank banco=new Bank("Itau");
        //Asociación entre bank y empleado
        banco.setEmpleados(empleados);
        banco.mostrarEmpleados();
        
    }
    
}
