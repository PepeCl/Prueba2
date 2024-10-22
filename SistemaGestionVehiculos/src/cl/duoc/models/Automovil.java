/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Automovil extends Vehiculo{
    
    private int cantPasajeros;
    private boolean autopilot;

    public Automovil() {
    }

    public Automovil(int cantPasajeros, boolean autopilot) {
        this.cantPasajeros = cantPasajeros;
        this.autopilot = autopilot;
    }

    public Automovil(int cantPasajeros, boolean autopilot, String idVehiculo, boolean mantDiario, int horasUso) {
        super(idVehiculo, mantDiario, horasUso);
        this.cantPasajeros = cantPasajeros;
        this.autopilot = autopilot;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }
    
    
    @Override
    public String toString() {
        return "Automovil{" + "cantPasajeros=" + cantPasajeros + ", autopilot=" + autopilot + '}';
    }
    
    @Override
    public double costoAlquiler(){
        double valHora = 0;
        if (autopilot){
            valHora = VALOR_HORA_ALQUILER * 1.1;
        }else{
            valHora = VALOR_HORA_ALQUILER;
        }
        return valHora;
    }
 
    @Override
    public double costoTotal(double valorHora){
        double costo = 0;
        costo = valorHora * super.getHorasUso();
        return costo;
    }
}
