/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public abstract class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto: las subclases deben implementarlo
    public abstract void acelerar();

    // Método concreto: tiene implementación
    public void mostrarMarca() {
        System.out.println("Marca del vehículo: " + marca);
    }
}
