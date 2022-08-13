
package apppublicacion;

public class Libro extends Publicacion {
    
    private int numeroPaginas;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(int numeroPaginas, int añoPublicacion, String titulo, float precio) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public void mostrar() {
        System.out.println("INFORMACIÓN DE UN LIBRO");
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Número paginas: "+this.numeroPaginas);
        System.out.println("Año de publicación: "+this.añoPublicacion );
    }
    
    
    
    
}
