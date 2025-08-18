package control;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class TiendaFecher {

    public static String obtenerProductos (String urlApi){
        StringBuilder resultado = new StringBuilder();

        try {
            URL url = new URL(urlApi);
            HttpURLConnection conexion = (HttpsURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);
            conexion.connect();

        }catch(Exception e){
            System.err.println("Error: " + e );
        }

        return resultado.toString();
    }

}