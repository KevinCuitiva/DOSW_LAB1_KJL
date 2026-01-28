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

    public static String procesarEco(String mensaje) {
        String repetido = repetirConBuilder.procesar(mensaje);
        String invertido = invertirConBuffer.procesar(repetido);
        return invertido;
    }

    public static void main(String[] args) {
        String input = "Eco";
        
        System.out.println("Input: " + input);
        String repetido = repetirConBuilder.procesar(input);
        System.out.println("Repetido (3 veces): " + repetido);
        
        String invertido = invertirConBuffer.procesar(repetido);
        System.out.println("Invertido: " + invertido);
        
        System.out.println();
        String resultado = procesarEco(input);
        System.out.println("Resultado final: " + resultado);
    }
}
