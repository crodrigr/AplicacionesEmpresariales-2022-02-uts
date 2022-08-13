
package appnumero57;

import java.util.Scanner;

public class AppNumero57 {
   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el número: ");
        int valor=leer.nextInt();
        Numero numero=new Numero(valor);
        System.out.println("El numero: "+numero.dato+" es "+numero.parImpar()+" y "+numero.negativoPositivo());
        
        
        
    }
    
}
