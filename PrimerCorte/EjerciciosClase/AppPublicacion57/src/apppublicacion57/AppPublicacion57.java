
package apppublicacion57;

import java.util.Scanner;

public class AppPublicacion57 {
    
    //Variable global 
    static Scanner leer=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        Ventas ventas=new Ventas();
        
        System.out.println("PROGRAMA DE PUBLICACIONES CON HERENCIA \n");
        
        Publicacion p1=newPublicacion();
        Publicacion p2=newPublicacion();
        Publicacion p3=newPublicacion();
        
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        
        System.out.println("\nLISTADO DE PUBLICACIONES VENDIDAS \n");
        ventas.newVenta(p1);
        ventas.newVenta(p3);
        ventas.listadoVentas();
        
        
    }
    
    public static Publicacion newPublicacion(){
        
        Publicacion publicacion;
        System.out.println("Ingrese el titulo: ");
        String titulo=leer.nextLine();
        System.out.println("Ingrese el precio: ");
        float precio=leer.nextFloat();
        System.out.println("Tipo de publicacion: 0. Publicacion, 1. Libro y 2.Disco: ");
        int tipo=leer.nextInt();
        switch (tipo) {
            case 1 -> {
                System.out.println("Ingrese número de paginas: ");
                int paginas=leer.nextInt();
                System.out.println("Ingrese el año de publicación: ");
                int año=leer.nextInt();
                publicacion=new Libro(paginas,año,titulo,precio);
            }
            case 2 -> {
                System.out.println("Ingrese la duración:  ");
                float duracion=leer.nextFloat();
                publicacion=new Disco(duracion,titulo,precio);
            }
            default -> publicacion=new Publicacion(titulo,precio);
        } 
                   
      return publicacion;
    }
    
}
