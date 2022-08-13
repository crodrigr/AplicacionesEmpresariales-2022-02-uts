package appservicioagua57;

import java.util.ArrayList;
import java.util.Scanner;

public class AppServicioAgua57 {

    //Variables Globales
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Suscriptor> listSuscriptores = new ArrayList<Suscriptor>();
    static final float VALOR_MT3 = 100;
    static float totalValorePagar;

    public static void main(String[] args) {

        System.out.println("PROGRAMA DE SERVICIO DE AGUA QUE CALCULA LOS VALORES A APAGAR ");
        cargarDatosSuscriptor();
        calcularValorPagar();
        mostrarSuscriptores();        
        System.out.println("Total a pagar de todos los suscriptores: "+totalValorePagar);
        

    }
    
    
    static void calcularValorPagar() {
        float tarifaBasica;
        for (int i = 0; i < listSuscriptores.size(); i++) {
            Suscriptor item = listSuscriptores.get(i);
            tarifaBasica = switch (item.getEstrato()) {
                case 1 -> 10000;
                case 2 -> 15000;
                case 3 -> 20000;
                case 4 -> 25000;
                default -> 30000;
            };
            item.calcularValorPagar(tarifaBasica, VALOR_MT3);
            totalValorePagar+=item.getValorPagar();
        }

    }

    static void mostrarSuscriptores() {
        System.out.println("Listado de suscriptores..");
        for (int i = 0; i < listSuscriptores.size(); i++) {
            Suscriptor item = listSuscriptores.get(i);
            System.out.println("Código: " + item.getCodigo()
                    + " Nombre: " + item.getNombre()
                    + " Estrato: " + item.getEstrato()
                    + " Consumo: " + item.getConsumo()
                    + " Pagar: " + item.getValorPagar());

        }

    }

    static void cargarDatosSuscriptor() {
        System.out.println("Carga de datos de suscriptores....");
        System.out.println("Ingrese el número de suscriptores a procesar: ");
        int numSuscriptores = leer.nextInt();

        for (int i = 0; i < numSuscriptores; i++) {

            String codigo;
            String nombre;
            int estrato;
            float consumo;

            System.out.println("Ingrese el código del suscriptor: ");
            codigo = leer.next();
            System.out.println("Ingrese el nombre del suscriptor: ");
            nombre = leer.next();
            System.out.println("Ingrese el estrato del suscriptor: ");
            estrato = leer.nextInt();
            System.out.println("Ingrese el consumo: ");
            consumo = leer.nextFloat();
            listSuscriptores.add(new Suscriptor(codigo, nombre, estrato, consumo));
        }

    }
}
