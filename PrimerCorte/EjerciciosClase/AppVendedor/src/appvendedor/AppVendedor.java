
package appvendedor;

import java.util.Scanner;


public class AppVendedor {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("PROGRAMA DE COMISIÓN DE VENTAS");
        
        String numeroIdentidad;
        int tipoVendedor;
        double ventasMes;
        
        System.out.println("Por favor ingrese el número de identidad: ");
        numeroIdentidad=leer.next();
        System.out.println("Por favor ingrese tipo de vendedor 1 0 2: ");
        tipoVendedor=leer.nextInt();
        System.out.println("Por favor ingrese las ventas del mes: ");
        ventasMes=leer.nextDouble();
        
        Vendedor vendedor=new Vendedor(numeroIdentidad,tipoVendedor,ventasMes);
              
        vendedor.setTipoVendedor(2);
        vendedor.calcularComision();
        System.out.println("Vendedor : "+vendedor.getNumeroIdentidad()+ "  Comisiones: "+vendedor.getComision());
        
        
        
        
        
        
        
    }
    
}
