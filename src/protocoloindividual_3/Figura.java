/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public abstract class Figura {
    // Método abstracto: debe ser implementado por las clases derivadas
    public abstract double calcularArea();

    // Método concreto: muestra el área de la figura
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
