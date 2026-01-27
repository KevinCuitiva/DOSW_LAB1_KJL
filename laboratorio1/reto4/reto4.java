import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reto4 {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (Map.Entry<String, Integer> entrada : lista) {
            hashMap.putIfAbsent(entrada.getKey(), entrada.getValue());
        }

        return hashMap;
    }

    // Función extra del estudiante A
    public static void imprimirEnMayusculas(Map<String, Integer> mapa) {
        mapa.forEach((k, v) ->
            System.out.println("Clave: " + k.toUpperCase() + " | Valor: " + v)
        );
    }
}
