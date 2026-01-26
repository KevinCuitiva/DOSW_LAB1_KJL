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
        System.out.println("=== CARRERA EN PARALELO ===\n");
        
        // Crear dos listas de números para la carrera
        List<Integer> lista1 = Arrays.asList(15, 3, 42, 8, 99, 12);
        List<Integer> lista2 = Arrays.asList(7, 25, 4, 18, 33, 6);
        
        System.out.println("Lista 1 (Carril 1): " + lista1);
        System.out.println("Lista 2 (Carril 2): " + lista2 + "\n");
        
        // Prueba Carril 1 - Encontrar número mayor
        System.out.println("--- CARRIL 1: Encontrar Número Mayor ---");
        int mayor = encontrarMayor.operar(lista1);
        System.out.println("Número mayor en lista1: " + mayor);
        System.out.println("¿Es mayor de dos dígitos?: " + esNumeroDeDosDigitos(mayor) + "\n");
        
        // Prueba Carril 2 - Encontrar número menor
        System.out.println("--- CARRIL 2: Encontrar Número Menor ---");
        int menor = encontrarMenor.operar(lista2);
        System.out.println("Número menor en lista2: " + menor);
        System.out.println("¿Es divisible por 2?: " + esDivisiblePorDos(menor) + "\n");
        
        // Tercer choque - Validaciones finales
        System.out.println("--- TERCER CHOQUE: Validaciones ---");
        System.out.println("Cantidad total de datos: " + (lista1.size() + lista2.size()));
        System.out.println("¿Cantidad es par?: " + cantidadDatosEsPar(lista1.size() + lista2.size()));
        System.out.println("¿Cantidad es impar?: " + cantidadDatosEsImpar(lista1.size() + lista2.size()) + "\n");
        
        // La gran meta - Fusionar en una función
        System.out.println("--- LA GRAN META: Resultado Combinado ---");
        Resultados resultado = procesarDosListas(lista1, lista2);
        System.out.println(resultado);
        System.out.println("\nCarrera completada exitosamente!");
    }
}
