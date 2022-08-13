
package appfigura;


public class AppFigura {

    
    public static void main(String[] args) {
        
        Figura f1=new Cuadrado(5);
        Figura f2=new Rectangulo(3,9);
        Figura f3=new Circulo(9);
        
        f1.calcularArea();
        f1.calcularPerimetro();
        f1.mostrar();
        
        f2.calcularArea();
        f2.calcularPerimetro();
        f2.mostrar();
        
        f3.calcularArea();
        f3.calcularPerimetro();
        f3.mostrar();
        
       
    }
    
}
