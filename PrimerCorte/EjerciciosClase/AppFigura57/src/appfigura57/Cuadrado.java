
package appfigura57;


public class Cuadrado extends Figura {
    
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    

    @Override
    public void calcularArea() {
        float area=this.lado*this.lado;
        super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro=this.lado*4;
        super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar() {
        System.out.println("DATOS DEL CUADRADO");
        System.out.println("Lado: "+this.lado);
        System.out.println("Area: "+super.getArea());
        System.out.println("Perimetro: "+super.getPerimetro());
    }
    
}
