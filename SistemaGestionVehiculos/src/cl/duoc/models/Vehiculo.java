/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements ICalculosdeCostos{
    
    private String idVehiculo;
    private boolean mantDiario;
    private int horasUso;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, boolean mantDiario, int horasUso) {
        this.idVehiculo = idVehiculo;
        this.mantDiario = mantDiario;
        this.horasUso = horasUso;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public boolean isMantDiario() {
        return mantDiario;
    }

    public void setMantDiario(boolean mantDiario) {
        this.mantDiario = mantDiario;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }
      
    @Override
    public abstract String toString();
    
    @Override
    public double costoAlquiler(){
        return 0;
    }
    
    @Override
    public double costoTotal(double valorHora){
        return 0;
    }
    
    
    }
    
    
   
    

