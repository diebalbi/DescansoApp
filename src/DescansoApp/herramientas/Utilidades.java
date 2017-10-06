package descansoApp.herramientas;

import java.util.Calendar;

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
}
