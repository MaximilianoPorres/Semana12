/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Maxi
 */
public class Main {

    public static void main(String[] args) {
        Nave n1 = new Nave();
        Nave n2 = new Nave("Tipo de nave 1");
        Nave n3 = new Nave("tipo Nave 2", "Tipo combustible", 100);

        AvionCarga ac1 = new AvionCarga();
        AvionCarga ac2 = new AvionCarga(5000);
        AvionCarga ac3 = new AvionCarga(10000, "tipo Nave 2", "Tipo combustible", 100);

        AvionPasajeros ap1 = new AvionPasajeros();
        AvionPasajeros ap2 = new AvionPasajeros(200);
        AvionPasajeros ap3 = new AvionPasajeros(200, "Tipo Nave 1");

        System.out.println("Muestro los datos de las naves");

        System.out.println("Constructor Vacio en Nave");
        System.out.println(n1);
        System.out.println();

        System.out.println("Constructor con un parametro en Nave");
        System.out.println(n2);
        System.out.println();

        System.out.println("Constructor completo en Nave");
        System.out.println(n3);
        System.out.println();

        System.out.println("Constructor Vacio en Avion Carga");
        System.out.println(ac1);
        System.out.println();

        System.out.println("Constructor completo en Avion de Carga pero con super Vacio");
        System.out.println(ac2);
        System.out.println();

        System.out.println("Constructor completo en Avion de Carga pero con super Completo");
        System.out.println(ac3);
        System.out.println();

        System.out.println("Constructor Vacio en Avion Pasajeros");
        System.out.println(ap1);
        System.out.println();

        System.out.println("Constructor completo en Avion de Pasajeros pero con super Vacio");
        System.out.println(ap2);
        System.out.println();

        System.out.println("Constructor completo en Avion de Pasajeros pero con super con un atributo de los 3");
        System.out.println(ap3);
        System.out.println();
    }
}
