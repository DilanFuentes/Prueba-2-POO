/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflexx;



import cl.duoc.models.Contenido;
import cl.duoc.models.Documental;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Registro;
import cl.duoc.models.Serie;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class StreamFlexx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        Registro registro = new Registro();
        
        int opcion;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Agregar serie");
            System.out.println("3. Agregar documental");
            System.out.println("4. Listar contenido");
            System.out.println("5. Calcular costo mensual");
            System.out.println("6. Salir...");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese CODIGO: ");
                    String codigoPelicula = scanner.nextLine();
                    System.out.println("Ingrese titulo");
                    String tituloPelicula = scanner.nextLine();
                    System.out.println("¿Es una recomendacion? (Si/No): ");
                    boolean recomendacionPelicula = scanner.nextBoolean();
                    System.out.println("Ingrese duracion (min): ");
                    double duracionPelicula = scanner.nextDouble();
                    System.out.println("Ingrese calificacion: ");
                    double calificacionPelicula = scanner.nextDouble();
                    scanner.nextLine();
                    
                    registro.agregarContenido(new Pelicula(codigoPelicula, tituloPelicula, recomendacionPelicula, duracionPelicula,calificacionPelicula));
                    break;
                    
                case 2:
                    System.out.println("Ingrese CODIGO: ");
                    String codigoSerie = scanner.nextLine();
                    System.out.println("Ingrese titulo");
                    String tituloSerie = scanner.nextLine();
                    System.out.println("¿Es una recomendacion? (Si/No): ");
                    boolean recomendacionSerie = scanner.nextBoolean();
                    System.out.println("Ingrese numero de temporadas: ");
                    int temporadasSerie = scanner.nextInt();
                    System.out.println("¿Esta finalizada? (Si/No): ");
                    boolean finalizaSerie = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    registro.agregarContenido(new Serie(temporadasSerie, finalizaSerie, codigoSerie, tituloSerie, recomendacionSerie));
                    break;
                    
                case 3:
                    System.out.println("Ingrese CODIGO: ");
                    String codigoDocumental = scanner.nextLine();
                    System.out.println("Ingrese titulo");
                    String tituloDocumental = scanner.nextLine();
                    System.out.println("¿Es recomendacion? (Si/No): ");
                    boolean recomendacionDocumental = scanner.nextBoolean();
                    System.out.println("Ingrese duracion (min): ");
                    double duracionDocumental = scanner.nextDouble();
                    scanner.nextLine();
                    
                    registro.agregarContenido(new Documental(duracionDocumental, codigoDocumental, tituloDocumental, recomendacionDocumental));

                    break;
                    
                case 4:
                    System.out.println("Contenido disponible: ");
                    registro.listarContenidos();
                    System.out.println("Total de contenidos: " + registro.cantidadContenidos());
                    break;
                    
                case 5:
                    double costoTotal = 0;
                    for(Contenido contenido : registro.getContenidos()){
                        costoTotal += contenido.calcularCostoMensual();
                    }
                    System.out.println("Costo mensual total: " + costoTotal);
                    break;
                    
                case 6 :
                    System.out.println("Saliendo delñ programa");
                    break;
                 
                default: 
                    System.out.println("Opcion no valida. intente nuevamente");
                    
            } 
        }while (opcion != 6 );
        
        scanner.close();
        
    }
    
}
