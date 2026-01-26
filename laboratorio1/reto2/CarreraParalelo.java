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
    
    // Segunda vuelta - Validaciones
    public static boolean esNumeroDeDosDigitos(int numero) {
        return numero >= 10 && numero <= 99;
    }
    
    public static boolean cantidadDatosEsPar(int cantidad) {
        return cantidad % 2 == 0;
    }
    
    public static boolean cantidadDatosEsImpar(int cantidad) {
        return cantidad % 2 != 0;
    }
    
    // Función combinada final - La gran meta
    public static Resultados procesarDosListas(List<Integer> lista1, List<Integer> lista2) {
        int numeroMayor = encontrarMayor.operar(lista1);
        int numeroMenor = encontrarMenor.operar(lista2);
        int cantidadDatos = lista1.size() + lista2.size();
        
        // Verificar si el número mayor es múltiplo de 2 o divisor de 2
        boolean esParODivisible = (numeroMayor % 2 == 0) || (numeroMayor != 0 && 2 % numeroMayor == 0);
        
        return new Resultados(numeroMayor, numeroMenor, cantidadDatos, esParODivisible);
    }
    
    public static void main(String[] args) {
        // Aquí irán las pruebas de los dos carriles
    }
}
