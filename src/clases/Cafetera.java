/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;
            
    public Cafetera (int capacidadMaxima, int cantidadActual){
        if(cantidadActual>capacidadMaxima){
            this.cantidadActual=capacidadMaxima;
            this.capacidadMaxima=capacidadMaxima;
        }
        else{
            this.capacidadMaxima=capacidadMaxima;
            this.cantidadActual=cantidadActual;
        }
        
    }
    
    public Cafetera (){
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        int aux;
        aux = this.getCapacidadMaxima();
        this.setCantidadActual(aux);
    }
    
    public String servirTaza(int nPersonas){
        int aux,aux3;
        String aux2;
        if(this.getCantidadActual()>=nPersonas){
            aux = this.getCantidadActual() - nPersonas;
            this.setCantidadActual(aux);
            aux2 = "Tazas servidas: "+nPersonas;
        }
        else{
            aux3 = this.getCantidadActual();
            aux = aux3 - this.getCantidadActual();
            this.setCantidadActual(aux);
            aux2 = "Usted no tiene para servir "+nPersonas+" tazas de cafe."+"\n"+
                   "Por lo tanto le serviremos "+aux3+" Tazas de cafe."+"\n"+
                   "La cantidad actual es de: "+this.getCantidadActual();
        }
        return aux2;
    }
    
    public void vaciarCafetera (){
        this.setCantidadActual(0);
    }
    
    public void agregarCafe (int cantidad){
        int aux;
        if((cantidad+this.getCantidadActual())>=this.getCapacidadMaxima()){
            aux = this.getCapacidadMaxima();
            this.setCantidadActual(aux);
        }
        else{
            aux = this.getCantidadActual() + cantidad;
            this.setCantidadActual(aux);
        }
    }
    
    public String mostrar(){
        String aux;
        aux = "La capacidad maxima es de: "+this.getCapacidadMaxima()+"\n"+
              "La cantidad actual es de: "+this.getCantidadActual();
        return aux;
    }
    
}
