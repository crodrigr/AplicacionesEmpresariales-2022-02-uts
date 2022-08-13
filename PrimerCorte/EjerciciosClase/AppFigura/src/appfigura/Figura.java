
package appfigura;


public abstract class Figura {
    
    private float area;
    private float perimetro;

    public Figura() {
    }
    
    public Figura(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
    
    public abstract void mostrar();
          
    
}
