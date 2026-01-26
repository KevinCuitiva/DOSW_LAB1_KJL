import java.util.*;

public class CarreraParalelo {
    
    static class Resultados {
        int numeroMayor;
        int numeroMenor;
        int cantidadDatos;
        boolean esParODivisible;
        
        public Resultados(int numeroMayor, int numeroMenor, int cantidadDatos, boolean esParODivisible) {
            this.numeroMayor = numeroMayor;
            this.numeroMenor = numeroMenor;
            this.cantidadDatos = cantidadDatos;
            this.esParODivisible = esParODivisible;
        }
        
        @Override
        public String toString() {
            return "Resultados{" +
                    "numeroMayor=" + numeroMayor +
                    ", numeroMenor=" + numeroMenor +
                    ", cantidadDatos=" + cantidadDatos +
                    ", esParODivisible=" + esParODivisible +
                    '}';
        }
    }
    
    // Interfaz funcional para operación con lista de números
    @FunctionalInterface
    interface OperacionNumeros {
        int operar(List<Integer> numeros);
    }
    
    // Carril 1 - Encuentra el número más grande
    public static OperacionNumeros encontrarMayor = lista -> {
        if (lista == null || lista.isEmpty()) return Integer.MIN_VALUE;
        return lista.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
    };
    
    // Carril 2 - Encuentra el número más pequeño y verifica si es divisible por 2
    public static OperacionNumeros encontrarMenor = lista -> {
        if (lista == null || lista.isEmpty()) return Integer.MAX_VALUE;
        return lista.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
    };
    
    public static boolean esDivisiblePorDos(int numero) {
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
        // Aquí irán las pruebas de los dos carriles
    }
}
