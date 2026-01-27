import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class reto4 {

    public static Map<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> hashtable = new Hashtable<>();

        for (Map.Entry<String, Integer> entrada : lista) {
            hashtable.put(entrada.getKey(), entrada.getValue());
        }

        return hashtable;
    }

    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e ->
                System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue())
            );
    }
}
