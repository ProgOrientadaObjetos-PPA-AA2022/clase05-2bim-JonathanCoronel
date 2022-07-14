/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

public class Principal2 {

    public static void main(String[] args) {

        // Guardar los objetos d tipo Generador Peliculas en un 
        // archivo serializado
        String nombreArchivo = "Peliculas.data";
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");

        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("123455");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");

        APIDirectiGo api4 = new APIDirectiGo();
        api4.establecerApiKey("123455");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");

        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        archivo.establecerRegistro(gp);
        archivo.establecerSalida();
        archivo.establecerRegistro(gp2);
        archivo.establecerSalida();
        archivo.establecerRegistro(gp3);
        archivo.establecerSalida();
        archivo.establecerRegistro(gp4);
        archivo.establecerSalida();
       
    }
}
