/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public interface ICalculosdeCostos {
    
    int VALOR_HORA_ALQUILER = 15000;
    double costoAlquiler();
    double costoTotal(double valorHora);
   
}
