
package appfigura;


public class Circulo extends Figura {
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea() {
       float area=(float) (2*Math.PI*(this.radio*this.radio));
       super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
       float perimetro=(float) (2*Math.PI*this.radio);
       super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar() {
       System.out.println("DATOS DEL CIRCULO");
       System.out.println("Radio: "+this.radio);       
       System.out.println("Area:" +super.getArea());
       System.out.println("Perimetro: "+super.getPerimetro());
    }
    
    
    
}
