package descansoApp.herramientas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ArchivoGrabacion {

    private final BufferedWriter out; 
    //Charset charset;                                 

    public ArchivoGrabacion(String unNombre) throws IOException {
        //charset = Charset.forName("UTF-8"); 
        out = new BufferedWriter(new FileWriter(unNombre));
    }

    public void grabarLinea(String linea) throws IOException {
        out.write(linea);
        out.newLine();
    }

    public void cerrar() throws IOException {
        out.flush();
        out.close();
    }
}
