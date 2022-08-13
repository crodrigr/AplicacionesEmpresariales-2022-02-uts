
package appcalificaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCalificaciones {

    static Scanner leer=new Scanner(System.in);
    static ArrayList<Estudiante> listEstudiantes=new ArrayList<Estudiante>();    
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAMA DE CALCULO DE LA NOTA FINAL DE UN CURSO")        ;
        cargarDatosEstudiantes();
        calcularNotaFinalEstudiantes();
        mostrarListadoEstudiantes();
        mostraEstadisticas();
        
     
    }
    
    static void mostraEstadisticas(){
        float sumaNotasFinales=0f;
        float promedioNotas;
        int   aprobados=0;
        int   reprobados=0;
        for(int i=0;i<listEstudiantes.size();i++){
          float notaFinal=listEstudiantes.get(i).getNotaFinal();
           sumaNotasFinales+=notaFinal;
           if(notaFinal<3){
             reprobados++;
           }else{
             aprobados++;
           }          
        }
        promedioNotas=sumaNotasFinales/listEstudiantes.size();
        System.out.println("ESTADISTICAS DEL CURSO");
        System.out.println("El promedio del curos es: "+promedioNotas);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Reprobaos: "+reprobados);
        
    
    
    }    
    
    static void cargarDatosEstudiantes(){
       listEstudiantes.add(new Estudiante("001","Camilo Rodriguez",4.5f,4.8f,3.5f));
       listEstudiantes.add(new Estudiante("002","Celina Torres",3.5f,3.8f,4.5f));
       listEstudiantes.add(new Estudiante("003","Juan   Villamizar",3.5f,3.8f,2.5f));
       listEstudiantes.add(new Estudiante("004","Carlos  Camargo",2.5f,1.0f,4.5f));
       listEstudiantes.add(new Estudiante("005","Diego   Rangel",2.5f,1.0f,3.5f));
       String codigo;
       System.out.println("Ingrese el código del estudiantes: ");
       codigo=leer.next();
       String nombre;
       float  nota1;
       float  nota2;
       float  nota3;       
       while(!codigo.equals("999")){         
          System.out.println("Ingrese el nombre del estudiante: ");
          nombre=leer.next();         
          System.out.println("Ingrese la nota 1: ");
          nota1=leer.nextFloat();          
          System.out.println("Ingrese la nota 2: ");
          nota2=leer.nextFloat();
          System.out.println("Ingrese la nota 3: ");
          nota3=leer.nextFloat();
          listEstudiantes.add(new Estudiante(codigo,nombre,nota1,nota2,nota3));
          System.out.println("Ingrese el código del estudiantes: ");
          codigo=leer.next();
       }
    }
    
    static void calcularNotaFinalEstudiantes(){
        System.out.println("Calculando notas finales del curso...!");
        for(int i=0;i<listEstudiantes.size();i++){
          listEstudiantes.get(i).calcularNotaFinal();                 
        }
    
    }
    
    static void mostrarListadoEstudiantes(){
      
        for(int i=0;i<listEstudiantes.size();i++){
          Estudiante item=listEstudiantes.get(i);
          System.out.println("Código: "+item.getCodigo()+
                             " Nombre: "+item.getNombre()+
                             " Nota 1: "+item.getNota1()+
                             " Nota 2: "+item.getNota2()+
                             " Nota 3: "+item.getNota3()+
                             " Nota final : "+item.getNotaFinal());
        
        }
    
    }
    
}
