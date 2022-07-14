/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

public class Principal3 {

    public static void main(String[] args) {

        // Guardar los objetos d tipo Generador Peliculas en un 
        // archivo serializado
        String nombreArchivo = "Peliculas.data";
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecePeliculas();
        System.out.println(lectura);

    }
}
