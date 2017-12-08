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
public class AvionCarga extends Nave{
    private float cargaMaximaKG;

    public AvionCarga() {
    }

    public AvionCarga(float cargaMaximaKG) {
        this.cargaMaximaKG = cargaMaximaKG;
    }

    public AvionCarga(float cargaMaximaKG, String tipoNave, String tipoCombustible, float capacidadCombustible) {
        super(tipoNave, tipoCombustible, capacidadCombustible);
        this.cargaMaximaKG = cargaMaximaKG;
    }

    public float getCargaMaximaKG() {
        return cargaMaximaKG;
    }

    public void setCargaMaximaKG(float cargaMaximaKG) {
        this.cargaMaximaKG = cargaMaximaKG;
    }

    @Override
    public String toString() {
        return "AvionCarga{" + tipoNave 
                +" combustible "+ tipoCombustible 
                +  " capacidad de combustible "+ +capacidadCombustible 
                +  " CargaMaxima "+ cargaMaximaKG +'}' ;
    }
}
