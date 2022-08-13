
package appnumero;

public class Numero {
    
    //Atributo
    public int dato;
    
    
    //Métodos
    public Numero(){}
    
    public Numero(int numero){
      this.dato=numero;
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
