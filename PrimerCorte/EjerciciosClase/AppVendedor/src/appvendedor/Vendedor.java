package appvendedor;

public class Vendedor {

    //Atributos
    private String numeroIdentidad;
    private int tipoVendedor;
    private double ventasMes;
    private double comision;
    
       //Métodos
    public Vendedor() {
    }

    public   Vendedor(String numeroIdentidad, int tipoVendedor, double ventasMes) {
        this.numeroIdentidad = numeroIdentidad;
        this.setTipoVendedor(tipoVendedor);
        this.ventasMes = ventasMes;       
       
    }

    public Vendedor(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }
    
    

    public void calcularComision() {

        if (this.tipoVendedor == 1) {
            this.comision = this.ventasMes * 0.25;
        } else if (this.tipoVendedor == 2) {
            this.comision = this.ventasMes * 0.20;
        }

    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public int getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(int tipoVendedor) {
        if(tipoVendedor==1 || tipoVendedor==2){
           this.tipoVendedor = tipoVendedor;
        }else{
          this.tipoVendedor = 0;
          System.out.println("Tipo de vendedor no valido");
        }
        
    }
    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    

}
