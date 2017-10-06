package descansoApp.herramientas;

public class ValidarNumero {
    public static boolean esNumero(String texto) {
        boolean correcto;
        try {
            Integer.parseInt(texto);
            correcto = true;
        } catch (NumberFormatException e) {
            correcto = false;
        }
        return correcto;
    }
}
