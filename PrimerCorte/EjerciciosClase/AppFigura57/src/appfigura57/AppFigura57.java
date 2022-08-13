package appfigura57;

public class AppFigura57 {

    public static void main(String[] args) {

        Figura f1 = new Cuadrado(4);
        Figura f2 = new Rectangulo(2, 9);
        Figura f3 = new Circulo(7);

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
