
package appfigura;

public class Rectangulo extends Figura {
    
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        float area=this.base*this.altura;
        super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro=2*this.base+2*this.altura;
        super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar() {
       System.out.println("DATOS DEL RECTANGULO");
       System.out.println("Base: "+this.base);
       System.out.println("Altura: "+this.altura);
       System.out.println("Area:" +super.getArea());
       System.out.println("Perimetro: "+super.getPerimetro());
    }
    
}
