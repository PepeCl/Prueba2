/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo {
    
    private String tipoFrenos;
    private int capacidadBatKm;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFrenos, int capacidadBatKm) {
        this.tipoFrenos = tipoFrenos;
        this.capacidadBatKm = capacidadBatKm;
    }

    public BicicletaElectrica(String tipoFrenos, int capacidadBatKm, String idVehiculo, boolean mantDiario, int horasUso) {
        super(idVehiculo, mantDiario, horasUso);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBatKm = capacidadBatKm;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBatKm() {
        return capacidadBatKm;
    }

    public void setCapacidadBatKm(int capacidadBatKm) {
        this.capacidadBatKm = capacidadBatKm;
    }
    
    
    
    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoFrenos=" + tipoFrenos + ", capacidadBatKm=" + capacidadBatKm + '}';
    }
    
    @Override
    public double costoAlquiler(){
        double valHoraBici = 0;
        if (capacidadBatKm < 20){
            valHoraBici = VALOR_HORA_ALQUILER * 0.95;
        }else{
            valHoraBici = VALOR_HORA_ALQUILER;
        }
        return valHoraBici;
    }
    
    @Override
    public double costoTotal(double valorHora){
        double costo = 0;
        costo = valorHora * super.getHorasUso();
        return costo;
    }
}
