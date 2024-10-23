/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido implements Suscripcion{
    
    private double duracion;

    public Documental(double duracion, String codigo, String titulo, boolean recomendacion) {
        super(codigo, titulo, recomendacion);
        this.duracion = duracion;
    }
    
    
    @Override
    public void mostrarDetalles(){
        System.out.println(this.toString() + ", Duracion: " + duracion + " mins");
    }
    
    @Override
    public double calcularCostoMensual(){
        double costo = COSTO_BASE_SUSCRIPCION   ;
        if(duracion > 90){
            costo *= 0.95;
        }
        return costo;
    }
}
