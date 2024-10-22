/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Auxiliar {
    
    List<Vehiculo> listaveh = new ArrayList<>();

    public Auxiliar() {
    }

    public List<Vehiculo> getListaveh() {
        return listaveh;
    }

    public void setListaveh(List<Vehiculo> listaveh) {
        this.listaveh = listaveh;
    }

    @Override
    public String toString() {
        return "Auxiliar{" + "listaveh=" + listaveh + '}';
    }
    
    public void agregarVehiculo(Vehiculo veh){
        listaveh.add(veh);
    }
    
    public void verListado(){
        for (Vehiculo i : listaveh){
            System.out.println("ID: " + i.getIdVehiculo() + "\nTiempo de uso: " + i.getHorasUso() + " horas");
        }
    }
    
    public int totalVehiculos(){
        int contador = 0;
        for (Vehiculo i : listaveh){
            contador += 1;
        }
        return contador;
    }
}
