/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class Registro {
    
    private ArrayList<Contenido> contenidos;

    public Registro() {
        this.contenidos = new ArrayList<>();
    }
    
    public void agregarContenido(Contenido contenido){
        for(Contenido c : contenidos){
            if(c.getCodigo().equals(contenido.getCodigo())){
                System.out.println("Contenido ya existe.");
                return;
            }
        }
        contenidos.add(contenido);
    }
    
    public void listarContenidos(){
        for (Contenido c : contenidos){
            c.mostrarDetalles();
        }
    }
    
    public int cantidadContenidos(){
        return contenidos.size();
    }
    
    public ArrayList<Contenido> getContenidos(){
        return contenidos;
    }
}
