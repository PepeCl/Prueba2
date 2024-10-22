/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motocicleta extends Vehiculo{
    
    private int capBateria;
    private boolean modoEco;

    public Motocicleta() {
    }

    public Motocicleta(int capBateria, boolean modoEco) {
        this.capBateria = capBateria;
        this.modoEco = modoEco;
    }

    public Motocicleta(int capBateria, boolean modoEco, String idVehiculo, boolean mantDiario, int horasUso) {
        super(idVehiculo, mantDiario, horasUso);
        this.capBateria = capBateria;
        this.modoEco = modoEco;
    }

    public int getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(int capBateria) {
        this.capBateria = capBateria;
    }

    public boolean isModoEco() {
        return modoEco;
    }

    public void setModoEco(boolean modoEco) {
        this.modoEco = modoEco;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "capBateria=" + capBateria + ", modoEco=" + modoEco + '}';
    }
    
    
    @Override
    public double costoAlquiler(){
        double valHorMoto = 0;
        if (super.getHorasUso() > (capBateria/2)){
            valHorMoto = VALOR_HORA_ALQUILER * 1.08;
        }else{
            valHorMoto = VALOR_HORA_ALQUILER;
        }
        return valHorMoto;
    }
    
    @Override
    public double costoTotal(double valorHora){
        double costo = 0;
        costo = valorHora * super.getHorasUso();
        return costo;
    }
    
    
}
