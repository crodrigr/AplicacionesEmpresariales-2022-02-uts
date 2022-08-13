package apppublicacion;

import java.util.Scanner;

public class AppPublicacion {

    //Variables
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Ventas ventas = new Ventas();
        System.out.println("APP DE PUBLICACLIONES CON HERENCIA");

        Publicacion p1 = crearPublicacion();
        Publicacion p2 = crearPublicacion();
        Publicacion p3 = crearPublicacion();

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        //add publicaciones en listado de ventas realizadas
        ventas.newVenta(p3);
        ventas.newVenta(p2);
        System.out.println("Listado de las ventas realizadas");
        ventas.mostrarVentas();

    }

    public static Publicacion crearPublicacion() {

        Publicacion publicacion;
        System.out.println("Ingrese el titulo: ");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el precio: ");
        float precio = leer.nextFloat();
        System.out.println("Publicacion es: 0.Publicacion, 1. Libro y 2. Disco ");
        int tipo = leer.nextInt();
        if (tipo == 1) {
            System.out.println("Ingrese el número de paginas: ");
            int numPaginas = leer.nextInt();
            System.out.println("Ingrse el año de la publicación: ");
            int añoPublicacion = leer.nextInt();
            publicacion = new Libro(numPaginas, añoPublicacion, titulo, precio);
        } else if (tipo == 2) {
            System.out.println("Ingrese la duración en minutos del disco: ");
            float duracion = leer.nextFloat();
            publicacion = new Disco(duracion, titulo, precio);
        } else {
            publicacion = new Publicacion(titulo, precio);
        }

        return publicacion;
    }

}
