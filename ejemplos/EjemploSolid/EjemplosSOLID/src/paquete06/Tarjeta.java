/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {

    private String nomBanco;
    private double cupoMaximo;

    public Tarjeta(String nomBa, double cupoMax) {
        nomBanco = nomBa;
        cupoMaximo = cupoMax;
    }

    public void establecerNomBanco(String n) {
        nomBanco = n;
    }

    public void establecerCupoMaximo(double n) {
        cupoMaximo = n;
    }

    public String obtenerNomBanco() {
        return nomBanco;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre Banco: %s\nCupo Máximo: %.2f\n",
                nomBanco, cupoMaximo);
        return cadena;
    }
}
