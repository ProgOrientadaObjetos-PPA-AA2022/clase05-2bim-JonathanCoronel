/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteAereo {

    public double tarifa;

    public void establecerTarifa() {
        tarifa = 100.00 + 0.20;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
