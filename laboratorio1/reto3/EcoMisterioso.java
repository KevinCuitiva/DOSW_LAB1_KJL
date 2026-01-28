import java.util.*;
import java.util.stream.*;

public class EcoMisterioso {

    @FunctionalInterface
    interface Transformacion {
        String procesar(String mensaje);
    }

    public static Transformacion repetirConBuilder = mensaje -> {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        return sb.toString();
    };

    public static Transformacion invertirConBuffer = mensaje -> {
        StringBuffer sf = new StringBuffer(mensaje);
        return sf.reverse().toString();
    };

    public static void main(String[] args) {
        
    }
}
