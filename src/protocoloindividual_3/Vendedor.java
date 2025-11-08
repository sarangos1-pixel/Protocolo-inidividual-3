/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario del vendedor (comisión por ventas): " + (ventas * comision));
    }
}
