/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Contenido {
    
    private String codigo;
    private String titulo;
    private boolean recomendacion;

    public Contenido(String codigo, String titulo, boolean recomendacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.recomendacion = recomendacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(boolean recomendacion) {
        this.recomendacion = recomendacion;
    }
    
    public abstract void mostrarDetalles();
    public abstract double calcularCostoMensual();
    
    @Override
    public String toString() {
        return "Contenido{" + "codigo=" + codigo + ", titulo=" + titulo + ", recomendacion=" + recomendacion + '}';
    }
    
    
    
    
}
