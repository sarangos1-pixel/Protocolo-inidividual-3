/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */

public class claseVehiculoError {
    public static void main(String[] args) {
        
        // ❌ ERROR: No se puede instanciar una clase abstracta
        Vehiculo v = new Vehiculo("Toyota");

        v.mostrarMarca();
        v.acelerar();
    }
    
}
