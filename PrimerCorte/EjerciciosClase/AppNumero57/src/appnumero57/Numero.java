package appnumero57;


public class Numero {
    
    //Atributos
    public int dato;

    //Métodos

    public Numero() {
    }

    public Numero(int dato) {
        this.dato = dato;
    }
 
    
    public String parImpar(){       
        if(this.dato%2==0){
          return "Par";
        }else{
          return "Impar";
        }   
    }
    
    public String negativoPositivo(){
       if(this.dato<0){
          return "Negativo";
       }else if(this.dato>0){
          return "Positivo";
       }else{
          return "Cero";
       }
    }
        
}
