/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Maxi
 */
public class Main {
    public static void main(String[] args) {
        Factura fac1 = new Factura("Minecraft", "Maxi", 700);
        Factura fac2 = new Factura("Overwatch", "Ivan", 20134);
        fac1.imprimirFactura();
        fac2.imprimirFactura();
    }
}
