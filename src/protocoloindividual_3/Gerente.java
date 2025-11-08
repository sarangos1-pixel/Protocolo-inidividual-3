/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario del gerente (incluye bono): " + bono);
    }
}
