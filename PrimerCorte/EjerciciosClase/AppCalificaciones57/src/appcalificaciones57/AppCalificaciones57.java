package appcalificaciones57;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCalificaciones57 {

    //Variables Globales
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Estudiante> listEstudiantes = new ArrayList<Estudiante>();

    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE CALCULA LAS NOTAS FINALES DE UN CURSO");
        cargarDatosEstudiantes();
        calcularNotasFinales();
        mostrarEstudiantes();
        generarEstadisticas();

    }

    static void generarEstadisticas() {
        System.out.println("Generando estadisticas.......");
        float sumaNotasFinales=0f;
        float promedioNotasFinales;
        float notaFinal;
        int aprobados=0;
        int reprobados=0;
        for (int i = 0; i < listEstudiantes.size(); i++) {
            notaFinal=listEstudiantes.get(i).getNotaFinal();
            sumaNotasFinales+=notaFinal;
            if(notaFinal<3){
              reprobados++;
            }else{
              aprobados++;
            }
        }
        promedioNotasFinales=sumaNotasFinales/listEstudiantes.size();
        System.out.println("El promedio del curso es: " +promedioNotasFinales);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Reprobados: "+reprobados);
    }

    static void calcularNotasFinales() {
        System.out.println("Calculando las notas finales.......");
        for (int i = 0; i < listEstudiantes.size(); i++) {
            listEstudiantes.get(i).calcularNotaFinal();
        }

    }

    static void cargarDatosEstudiantes() {
        listEstudiantes.add(new Estudiante("001", "Camilo Rodriguez", 4.5f, 4.8f, 4.9f));
        listEstudiantes.add(new Estudiante("002", "Juan   Camargo", 1.5f, 1.8f, 1.9f));
        listEstudiantes.add(new Estudiante("003", "Celina Torres", 3.5f, 2.8f, 3.9f));
        listEstudiantes.add(new Estudiante("004", "Diego  Rangel", 3.5f, 3.8f, 2.9f));
        listEstudiantes.add(new Estudiante("005", "Diana  Tarazona", 2.5f, 3.8f, 4.9f));
        String codigo;
        String nombre;
        float nota1;
        float nota2;
        float nota3;
        System.out.println("Ingrese el código del estudiante: ");
        codigo = leer.next();
        while (!codigo.equals("999")) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = leer.next();
            System.out.println("Ingrese la nota1: ");
            nota1 = leer.nextFloat();
            System.out.println("Ingrese la nota2: ");
            nota2 = leer.nextFloat();
            System.out.println("Ingrese la nota3: ");
            nota3 = leer.nextFloat();
            listEstudiantes.add(new Estudiante(codigo, nombre, nota1, nota2, nota3));
            System.out.println("Ingrese el código del estudiante: ");
            codigo = leer.next();
        }
    }

    static void mostrarEstudiantes() {
        for (int i = 0; i < listEstudiantes.size(); i++) {
            Estudiante item = listEstudiantes.get(i);
            System.out.println("Código: " + item.getCodigo()
                    + " Nombre: " + item.getNombre()
                    + " Nota1:  " + item.getNota1()
                    + " Nota2:  " + item.getNota2()
                    + " Nota3:  " + item.getNota3()
                    + " NotaFinal " + item.getNotaFinal());
        }

    }

}
