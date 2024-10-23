/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido implements Suscripcion{
    
    private int temporadas;
    private boolean finalizada;

    public Serie(int temporadas, boolean finalizada, String codigo, String titulo, boolean recomendacion) {
        super(codigo, titulo, recomendacion);
        this.temporadas = temporadas;
        this.finalizada = finalizada;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(this.toString() + ", Temporadas: " + temporadas + ", Finalizada: " + finalizada);
    }
    
    @Override
    public double calcularCostoMensual(){
        double costo = COSTO_BASE_SUSCRIPCION;
        if(temporadas > 3 && !finalizada){
            costo *= 1.08;
        }
        return costo;
      }   
   }
