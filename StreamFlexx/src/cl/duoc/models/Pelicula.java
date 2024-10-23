/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido implements Suscripcion{
    
    private double duracion;
    private double calificacion;

    public Pelicula(String codigo,String titulo, boolean recomendacion, double duracion, double calificacion ) {
        super(codigo, titulo, recomendacion);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(this.toString() + ", Duracion: " + duracion + " mins, Calificacion: " + calificacion);
    }
    
    @Override
    public double calcularCostoMensual(){
        double costo = COSTO_BASE_SUSCRIPCION;
        if(calificacion > 4.5){
            costo *= 1.10;
        }
        return costo;
    }
    
}