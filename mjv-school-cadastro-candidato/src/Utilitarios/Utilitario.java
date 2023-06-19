package Utilitarios;

public class Utilitario {

    public static String getValorValido(boolean bool) {
        if (bool) {
            return "true";
        }
        return "false";
    }

    public static String getValorValido(String texto) {
        if (texto == null) {
            return "";
        }
        return texto;
    }
}
