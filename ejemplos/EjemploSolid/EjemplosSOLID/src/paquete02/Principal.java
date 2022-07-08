/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        Persona per1 = new Persona("José", 20);
        Persona per2 = new Persona("Sebastian", 21);
        Persona per3 = new Persona("Sofia", 22);

        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
        OperacionesEstudiantes oper = new OperacionesEstudiantes();
        oper.establecerEstudiante(lista);
        oper.establecerPromedioEdades();
        oper.establecerPromedioEdadesCualitativo();
        System.out.printf("%s",oper);
    }
}
