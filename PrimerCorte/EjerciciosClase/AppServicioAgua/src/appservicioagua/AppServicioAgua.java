package appservicioagua;

import java.util.ArrayList;
import java.util.Scanner;

public class AppServicioAgua {
    
    //Variables globales
    static Scanner leer=new Scanner(System.in);
    static ArrayList<Suscriptor> listSuscriptores=new ArrayList<Suscriptor>();
    static final float VALOR_MTO3=100f;
    static float TotalPagarSuscriptores;
    
    
    public static void main(String[] args) {
        System.out.println("PROGRAMA DE SERVICIO DE AGUA");
        cargarDatosSuscriptores();
        calcularValoresPagar();
        mostrarSuscriptores();
        System.out.println("El total a pagar de los suscriptores es: "+TotalPagarSuscriptores);
        Suscriptor cliente=new Suscriptor();
        
                
        
    }
    
    
    static void calcularValoresPagar(){
       System.out.println("PROCESANDO CALCULO DE VALORES A PAGAR DE CADA SUSCRIPTOR");
       float tarifaBasica;
       for(int i=0;i<listSuscriptores.size();i++){
          Suscriptor elemento=listSuscriptores.get(i);
          switch(elemento.getEstrato()){
              case 1:
                  tarifaBasica=10000f;
              break;
              case 2:
                  tarifaBasica=15000f;
              break;
              case 3:
                  tarifaBasica=20000f;
              break;
              case 4:
                  tarifaBasica=25000f;
              break;
              default:
                  tarifaBasica=30000f;
              break;          
           }
          elemento.calcularValorPagar(tarifaBasica,VALOR_MTO3);
          TotalPagarSuscriptores+=elemento.getValorPagar();
      }  
    
    }
    
    
    static void cargarDatosSuscriptores(){
      System.out.println("CARGA DE DATOS");
      int numeroSuscriptores;
      System.out.println("Ingrese el número de suscriptores a procesar: ");
      numeroSuscriptores=leer.nextInt();
      String codigo;
      String nombre;
      int    estrato;
      float  consumo;
      for(int i=0;i<numeroSuscriptores;i++){
          
          System.out.println("Ingrese el código del suscriptor: ");
          codigo=leer.next();
          System.out.println("Ingrese el nombre del suscriptor: ");
          nombre=leer.next();
          System.out.println("Ingrese el estrato (1,2,3,4,5) ");
          estrato=leer.nextInt();
          System.out.println("Ingrese el consumo del mes: ");
          consumo=leer.nextFloat();
          listSuscriptores.add(new Suscriptor(codigo,nombre,estrato,consumo));                  
      }         
    }
    
    static void mostrarSuscriptores(){
       System.out.println("LISTADO DE SUSCRIPTORES ");
       for(int i=0;i<listSuscriptores.size();i++){
          Suscriptor elemento=listSuscriptores.get(i);
          System.out.println("Código: "+elemento.getCodigo()+" Nombre:" 
                             +elemento.getNombre()+ " Estrato: "+elemento.getEstrato()
                             +" Consumo: "+elemento.getConsumo()+" Valor a pagar: "+elemento.getValorPagar());                          
      }     
    
    }
    
}
