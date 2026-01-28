import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class reto5 {
    
    // Estudiante A: HashSet - almacena números sin orden y elimina múltiplos de 3
    public static Set<Integer> batallaHashSet(Integer[] numeros) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        
        for (Integer num : numeros) {
            hashSet.add(num);
        }
        
        Set<Integer> resultado = hashSet.stream()
            .filter(n -> n % 3 != 0)  
            .collect(Collectors.toSet());
        
        return resultado;
    }
    
    // Estudiante B: TreeSet - almacena números en orden ascendente y elimina múltiplos de 5
    public static Set<Integer> batallaTreeSet(Integer[] numeros) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        
        for (Integer num : numeros) {
            treeSet.add(num);
        }
        
        Set<Integer> resultado = treeSet.stream()
            .filter(n -> n % 5 != 0)  // Lambda: mantener solo los que NO son múltiplos de 5
            .collect(Collectors.toSet());
        
        return resultado;
    }
    
    // Choque: Unir ambas colecciones eliminando duplicados
    public static Set<Integer> unirColecciones(Set<Integer> hashSetResult, Set<Integer> treeSetResult) {
        TreeSet<Integer> unionOrdenada = new TreeSet<>();
        
        unionOrdenada.addAll(hashSetResult);
        unionOrdenada.addAll(treeSetResult);
        
        return unionOrdenada;
    }

    public static void main(String[] args) {
        // Ejemplo de entrada
        Integer[] numerosHashSet = {4, 9, 15, 7, 18, 21, 10, 5};
        Integer[] numerosTreeSet = {12, 3, 25, 10, 7, 30, 18, 4};
        
        System.out.println("=== BATALLA DE CONJUNTOS ===\n");
        
        // Estudiante A: HashSet (elimina múltiplos de 3)
        Set<Integer> resultadoHashSet = batallaHashSet(numerosHashSet);
        System.out.println("HashSet original: " + java.util.Arrays.toString(numerosHashSet));
        System.out.print("HashSet sin multiplos de 3: ");
        resultadoHashSet.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");
        
        // Estudiante B: TreeSet (elimina múltiplos de 5)
        Set<Integer> resultadoTreeSet = batallaTreeSet(numerosTreeSet);
        System.out.println("TreeSet original: " + java.util.Arrays.toString(numerosTreeSet));
        System.out.print("TreeSet sin multiplos de 5 (ordenado): ");
        resultadoTreeSet.forEach(n -> System.out.print(n + " "));  
        System.out.println("\n");
        
        // Unión final (eliminando duplicados)
        Set<Integer> unionFinal = unirColecciones(resultadoHashSet, resultadoTreeSet);
        System.out.println("=== UNION FINAL (sin duplicados, ordenada) ===");
        unionFinal.forEach(n -> System.out.println("Numero en arena: " + n));  
    }
}
