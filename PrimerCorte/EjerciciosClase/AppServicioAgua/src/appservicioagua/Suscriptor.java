package appservicioagua;

public class Suscriptor {
    //Atributos
    private String codigo;
    private String nombre;
    private int    estrato;
    private float  consumo;
    private float  valorPagar;

    public Suscriptor() {
    }

    public Suscriptor(String codigo, String nombre, int estrato, float consumo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estrato = estrato;
        this.consumo = consumo;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    public void calcularValorPagar(float tarifaBasica,float valorMto3Agua){
       
        this.valorPagar=tarifaBasica+(this.consumo*valorMto3Agua);
    
    }
    
    
    
    
}
