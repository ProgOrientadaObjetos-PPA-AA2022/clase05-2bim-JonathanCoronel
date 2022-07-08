/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {

        ArrayList<Transporte> lista = new ArrayList<>();
        Scanner entradada = new Scanner(System.in);
        entradada.useLocale(Locale.US);
        boolean bandera = true;
        int opc;
        while (bandera) {
            System.out.printf("Menu de opcione\n1.-Agregar un Bus\n"
                    + "2.-Agregar un Taxi\n3.-Agregar Aereo\n"
                    + "4.-Agregar Marítimo\n5.-Salir\n");
            opc = entradada.nextInt();
            if (opc == 1) {
                TransporteBus bus = new TransporteBus();
                bus.establecerTarifa();
                lista.add(bus);
            } else {
                if (opc == 2) {
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerTarifa();
                    lista.add(taxi);
                } else {
                    if (opc == 3) {
                        TransporteAereo aereo = new TransporteAereo();
                        aereo.establecerTarifa();
                        lista.add(aereo);
                    } else {
                        if (opc == 4) {
                            TransporteMaritimo maritimo = new TransporteMaritimo();
                            maritimo.establecerTarifa();
                            lista.add(maritimo);
                        } else {
                            if (opc == 5) {
                                bandera = false;
                            } else {
                                System.out.println("Valor fuera del Rango Permitido");
                            }

                        }

                    }
                }
            }

        }
        TiposTransporte trans = new TiposTransporte();
        trans.establecerTransportes(lista);
        trans.establecerPromedioTarifas();
        System.out.printf("%s", trans);
    }
}
