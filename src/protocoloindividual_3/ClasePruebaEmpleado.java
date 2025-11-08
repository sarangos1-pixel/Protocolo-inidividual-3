/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protocoloindividual_3;

/**
 *
 * @author Sebastian
 */
public class ClasePruebaEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("luisa", 5000);
        gerente.mostrarDetalles();
        

        Empleado vendedor = new Vendedor("Luis", 10000, 0.1);
        vendedor.mostrarDetalles();
        
    }
}
