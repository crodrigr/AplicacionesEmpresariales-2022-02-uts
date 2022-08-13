
package appnumero;

import java.util.Scanner;


public class AppNumero {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int dato;
        System.out.println("Ingrese el número");
        dato=leer.nextInt();
        
        Numero numero=new Numero(dato);
        
        System.out.println("Numero es: "+numero.parImpar()+ " y  "+numero.negativoPositivo());
        
        
        
        
    }
    
}
