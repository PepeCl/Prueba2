/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionvehiculos;

import cl.duoc.models.Automovil;
import cl.duoc.models.Auxiliar;
import cl.duoc.models.BicicletaElectrica;
import cl.duoc.models.Motocicleta;
import cl.duoc.models.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemaGestionVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        //Creo lista vacia auxiliar
        Auxiliar aux = new Auxiliar();
        
        //Creo objetos y una lista para almacenarlos
        Automovil auto1 = new Automovil(4, true, "VH001", true, 15);
        Automovil auto2 = new Automovil(2, false, "VH002", true, 22);
        Automovil auto3 = new Automovil(6, true, "VH003", true, 8);
        Automovil auto4 = new Automovil(2, true, "VH002", false, 11);
        List<Automovil> listaauto = new ArrayList<>();
        listaauto.add(auto1);
        listaauto.add(auto2);
        listaauto.add(auto3);
        listaauto.add(auto4);
        
        Motocicleta moto1 = new Motocicleta(20, true, "MT001", true, 50);
        Motocicleta moto2 = new Motocicleta(100, false, "MT002", true, 12);
        Motocicleta moto3 = new Motocicleta(11, true, "MT001", true, 12);
        List<Motocicleta> listamoto = new ArrayList<>();
        listamoto.add(moto1);
        listamoto.add(moto2);
        listamoto.add(moto3);
        
        BicicletaElectrica bici1 = new BicicletaElectrica("Disco", 30, "BE001", true, 44);
        BicicletaElectrica bici2 = new BicicletaElectrica("Disco", 50, "BE002", true, 150);
        BicicletaElectrica bici3 = new BicicletaElectrica("Disco", 88, "BE002", true, 123);
        List<BicicletaElectrica> listabici = new ArrayList<>();
        listabici.add(bici1);
        listabici.add(bici2);
        listabici.add(bici3);
        
  
        int opcion = 0;
        
        while (opcion != 4){
            System.out.println("***** MENU *****");
            System.out.println("Opcion 1: Agregar Vehiculo");
            System.out.println("Opcion 2: Ver lista de Vehiculos y cantidad");
            System.out.println("Opcion 3: Mostrar Costos");
            System.out.println("Opcion 4: Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el tipo de vehiculo a agregar (1 - 2 - 3): ");
                    System.out.println("1: Automovil");
                    System.out.println("2: Motocicleta");
                    System.out.println("3: Bicleta Electrica");
                    int tipo = entrada.nextInt();
                    
                    switch(tipo){
                        case 1:
                            for (Automovil i: listaauto){
                                System.out.println("Capacidad Automovil: " + i.getCantPasajeros() + " puertas\nPosee autopilot: " + i.isAutopilot() +"\nID: " + i.getIdVehiculo() + "\n*****");                              
                            }
                            System.out.println("Ingrese el ID del automovil a agregar");
                            String idAuto = entrada.next(); 
                            for (Automovil m : listaauto){
                                if (m.getIdVehiculo().equals(idAuto)){
                                    System.out.println("Vehiculo agregado correctamente");
                                    aux.agregarVehiculo(m);
                                    break;
                                }
                            }           
                            break;
                        case 2:
                            for (Motocicleta i:listamoto){
                                System.out.println("Capacidad de bateria: " + i.getCapBateria() + " horas de autonomia\nPosee Modo Eco: " + i.isModoEco() + "\nID: " + i.getIdVehiculo() + "\n*****");
                            }
                            System.out.println("Ingrese el ID del automovil a agregar");
                            String idMoto = entrada.next(); 
                            for (Motocicleta m : listamoto){
                                if (m.getIdVehiculo().equals(idMoto)){
                                    System.out.println("Motocicleta agregada correctamente");
                                    aux.agregarVehiculo(m);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            for (BicicletaElectrica i:listabici){
                                System.out.println("Tipo de freno: " + i.getTipoFrenos() + "\nCapacidad bateria: " + i.getCapacidadBatKm() + " kilometros\nID: " + i.getIdVehiculo() + "\n*****");
                            }
                            System.out.println("Ingrese el ID del automovil a agregar");
                            String idBici = entrada.next(); 
                            for (BicicletaElectrica m : listabici){
                                if (m.getIdVehiculo().equals(idBici)){
                                    System.out.println("Bicicleta Electrica agregada correctamente");
                                    aux.agregarVehiculo(m);
                                    break;
                                }
                            }
                            break;
                    }     
                    break;
                case 2:
                    System.out.println("Los vehiculos agregados son: ");
                    aux.verListado();
                    System.out.println("La cantidad de vehiculos agregados es de: " + aux.totalVehiculos());
                    break;
                case 3:
                    for (Vehiculo i : aux.getListaveh()){
                        System.out.println("El costo asociado al vehiculo ID " + i.getIdVehiculo() + " es: \nValor diario: " + i.costoAlquiler() + "\nValor Total: " + i.costoTotal(i.costoAlquiler()) + "\n*****");            
                    }
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
            }
        }
        
        
        
        
        
        
    }
    
}
