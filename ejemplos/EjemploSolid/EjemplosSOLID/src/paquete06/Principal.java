/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Tarjeta tar1 = new Tarjeta("Banco de Loja", 2500);
        MayorEdad representante = new MayorEdad("José", tar1);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta());

    }
}
