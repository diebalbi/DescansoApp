package descansoApp.herramientas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JTextField;

public class Utilidades {

    public static Calendar soloFecha(Calendar f) {
        f.set(Calendar.HOUR, 0);
        f.set(Calendar.HOUR_OF_DAY, 0);
        f.set(Calendar.MINUTE, 0);
        f.set(Calendar.SECOND, 0);
        f.set(Calendar.MILLISECOND, 0);
        return f;
    }
   
    public static void imprimirFecha(Calendar f) {
        System.out.println(f.get(Calendar.DAY_OF_MONTH));
        System.out.println(f.get(Calendar.MONTH));
        System.out.println(f.get(Calendar.YEAR));
        System.out.println("");
        System.out.println(f.get(Calendar.HOUR));
        System.out.println(f.get(Calendar.MINUTE));
    }
    
    public static void soloNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent key){
                char caracter = key.getKeyChar();
                if(!Character.isDigit(caracter)){
                    key.consume();
                }
            }
        });
    }
    
    public static void limitarNumeros(final JTextField campo, final int cantidad){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent key){
                int largo = campo.getText().length();
                if(largo >= cantidad){
                    key.consume();
                }
            }
        });
    }
}
