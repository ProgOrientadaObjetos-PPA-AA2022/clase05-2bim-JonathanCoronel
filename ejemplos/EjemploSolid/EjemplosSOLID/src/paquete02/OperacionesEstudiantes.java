/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }

        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerPromedioEdadesCualitativo() {

        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "Promedio Jovenes";
        } else {
            if (promedioEdades > 21) {
                promedioEdadesCualitativo = "Promedio Adulto";

            }
        }
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public String obtenerPromedioEdadesCualitativo() {
        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Lista estudiantes\n");
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    estudiantes.get(i).obtenerNombre());
        }
        cadena = String.format("%s\nPromedio Edades:%.2f\n"
                + "Promedio Cualitativo: %s\n",
                cadena, promedioEdades, promedioEdadesCualitativo);
        return cadena;
    }
}
