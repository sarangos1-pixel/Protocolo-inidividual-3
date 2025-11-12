/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: debe ser implementado por las clases derivadas
    public abstract void calcularSalario();

    // Método concreto: muestra los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre del empleado: " + nombre);
        calcularSalario();
    }
}

