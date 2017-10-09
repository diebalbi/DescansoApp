package descansoApp.herramientas;

import java.io.*;
/**
 *
 * @author Fido
 */
public class GestionArchivos {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionArchivos(){
     
    }
  
    public byte[] AbrirArchivoImagen(File archivo){
        byte[] imagen = new byte[1024*100];
        try{
            entrada = new FileInputStream(archivo);
            entrada.read(imagen);
        } catch(Exception e){ 
        }
        return imagen;
    }
    
    public String GuardarAImagen(File archivo, byte[] bytesImagen){
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            salida.write(bytesImagen);
            respuesta = "La imagen se guardo con exito";
        }
        catch(Exception e){
            
        }
        return respuesta;
    }
}
