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
public class Nave {

    public String tipoNave;
    public String tipoCombustible;
    public float capacidadCombustible;

    public Nave() {
    }

    public Nave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public Nave(String tipoNave, String tipoCombustible, float capacidadCombustible) {
        this.tipoNave = tipoNave;
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public String toString() {
        return "Nave{" + "tipoNave=" + tipoNave + ", tipoCombustible=" + tipoCombustible + ", capacidadCombustible=" + capacidadCombustible + '}';
    }

}
