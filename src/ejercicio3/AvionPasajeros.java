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
public class AvionPasajeros extends Nave {

    private int cargaMaximaPasajeros;

    public AvionPasajeros() {
    }

    public AvionPasajeros(int cargaMaximaPasajeros) {
        this.cargaMaximaPasajeros = cargaMaximaPasajeros;
    }

    public AvionPasajeros(int cargaMaximaPasajeros, String tipoNave) {
        super(tipoNave);
        this.cargaMaximaPasajeros = cargaMaximaPasajeros;
    }

    public AvionPasajeros(int cargaMaximaPasajeros, String tipoNave, String tipoCombustible, float capacidadCombustible) {
        super(tipoNave, tipoCombustible, capacidadCombustible);
        this.cargaMaximaPasajeros = cargaMaximaPasajeros;
    }

    public int getCargaMaximaPasajeros() {
        return cargaMaximaPasajeros;
    }

    public void setCargaMaximaPasajeros(int cargaMaximaPasajeros) {
        this.cargaMaximaPasajeros = cargaMaximaPasajeros;
    }

    @Override
    public String toString() {
        return "AvionPasajeros{" + tipoNave
                + " combustible " + tipoCombustible
                + " capacidad de combustible " + +capacidadCombustible
                + " capacidad de pasajeros " + cargaMaximaPasajeros + '}';
    }
}
