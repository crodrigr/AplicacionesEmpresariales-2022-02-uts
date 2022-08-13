
package appservicioaguauts;

import java.util.Scanner;

public class AppServicioAguaUTS {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el documento");
        String numDocumento=leer.next();
        System.out.println("Ingrese el estado 1: activo o 2: suspendido");
        int estado=leer.nextInt();
        System.out.println("Ingrese el estrato: 1,2,3,4,5");
        int estrato=leer.nextInt();
        
        if(estado==1){
           if(estrato==1){
            System.out.println("Valor de la tarifa básica es: $10.000");   
           }else if(estrato==2){
            System.out.println("Valor de la tarifa básica es: $15.000");   
           }else if(estrato==3){
            System.out.println("Valor de la tarifa básica es: $30.000");   
           }else if(estrato==4){
            System.out.println("Valor de la tarifa básica es: $50.000");    
           }else{
            System.out.println("Valor de la tarifa básica es: $65.000");   
           }
        
        }else{
          System.out.println("Valor de la tarifa básica es: $0");
        
        }            
        
        
        
    }
    
}
