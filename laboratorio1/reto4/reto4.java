import java.util.*;
import java.util.stream.Collectors;

public class reto4 {

    public static Map<String, Integer> combinarYMostrar(
            Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {

        Map<String, Integer> resultado = new HashMap<>(hashMap);

        hashTable.forEach(resultado::put);

        Map<String, Integer> finalMap =
                resultado.entrySet().stream()
                        .map(e -> Map.entry(e.getKey().toUpperCase(), e.getValue()))
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> a,
                                LinkedHashMap::new
                        ));

        finalMap.forEach((k, v) ->
                System.out.println("Clave: " + k + " | Valor: " + v)
        );

        return finalMap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> hashTable = new Hashtable<>();

        System.out.println("=== INGRESO DE DATOS PARA HASHMAP ===");
        System.out.print("¿Cuántos pares desea ingresar? ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.print("Clave " + (i + 1) + ": ");
            String clave = sc.nextLine();

            System.out.print("Valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            sc.nextLine();

            hashMap.putIfAbsent(clave, valor);
        }

        System.out.println("\n=== INGRESO DE DATOS PARA HASHTABLE ===");
        System.out.print("¿Cuántos pares desea ingresar? ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("Clave " + (i + 1) + ": ");
            String clave = sc.nextLine();

            System.out.print("Valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            sc.nextLine();

            hashTable.put(clave, valor);
        }

        System.out.println("\n===== RESULTADO FINAL =====");
        combinarYMostrar(hashMap, hashTable);
    }
}
