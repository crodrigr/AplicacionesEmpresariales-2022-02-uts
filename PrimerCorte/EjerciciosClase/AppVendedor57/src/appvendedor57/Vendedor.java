
package appvendedor57;

public class Vendedor {
    //Atributos
    
    private String numeroDocumento;
    private int    tipoVendedor;
    private double ventasMes;
    private double comision;
    
    
    //Métodos

    public Vendedor() {
    }

    public Vendedor(String numeroDocumento, int tipoVendedor, double ventasMes) {
        this.numeroDocumento = numeroDocumento;
        this.tipoVendedor = tipoVendedor;
        this.ventasMes = ventasMes;
    }

    public Vendedor(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    public void calcularComisiones(){
        if(this.tipoVendedor==1){
          this.comision=this.ventasMes*0.25;
        }else if(this.tipoVendedor==2){
          this.comision=this.ventasMes*0.20;
        }     
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(int tipoVendedor) {
        if(tipoVendedor==1 || tipoVendedor==2){
        this.tipoVendedor = tipoVendedor;
        }else{
         System.out.println("Tipo vendedor no valido");
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
