
package appfigura57;


public abstract class Figura {
    
    private float area;
    private float perimetro;

    public Figura() {
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
