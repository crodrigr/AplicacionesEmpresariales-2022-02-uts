package appvendedor57;

import java.util.Scanner;

public class AppVendedor57 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA LAS COMISIONES DE VENTAS DE VENDEDORES");
        
        String numeroDocumento;
        int tipoVendedor;
        double ventasMes;
        
        System.out.println("Ingres por favor el número de documeto: ");
        numeroDocumento=leer.next();
        System.out.println("Ingrese el tipo de vendedor: ");
        tipoVendedor=leer.nextInt();
        System.out.println("Ingrese las ventas del mes: ");
        ventasMes=leer.nextDouble();
        
        Vendedor vendedor=new Vendedor(numeroDocumento,tipoVendedor,ventasMes);
        
     
        vendedor.setTipoVendedor(5);
        vendedor.calcularComisiones();
        
        System.out.println("Vendedor: "+vendedor.getNumeroDocumento()+" comisiones: "+vendedor.getComision());
        
        
        
        
        
    }
    
}
