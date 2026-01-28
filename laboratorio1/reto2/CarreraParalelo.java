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
            return "Resultados{numeroMayor=" + numeroMayor + ", numeroMenor=" + numeroMenor + 
                   ", cantidadDatos=" + cantidadDatos + ", esParODivisible=" + esParODivisible + "}";
        }
    }
    
    @FunctionalInterface
    interface OperacionNumeros {
        int operar(List<Integer> numeros);
    }
    
    public static OperacionNumeros encontrarMayor = lista -> {
        if (lista == null || lista.isEmpty()) return Integer.MIN_VALUE;
        return lista.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
    };
    
    public static OperacionNumeros encontrarMenor = lista -> {
        if (lista == null || lista.isEmpty()) return Integer.MAX_VALUE;
        return lista.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
    };
    
    public static boolean esDivisiblePorDos(int numero) {
        return numero % 2 == 0;
    }
    
    public static boolean esNumeroDeDosDigitos(int numero) {
        return numero >= 10 && numero <= 99;
    }
    
    public static boolean cantidadDatosEsPar(int cantidad) {
        return cantidad % 2 == 0;
    }
    
    public static boolean cantidadDatosEsImpar(int cantidad) {
        return cantidad % 2 != 0;
    }
    
    public static Resultados procesarDosListas(List<Integer> lista1, List<Integer> lista2) {
        int numeroMayor = encontrarMayor.operar(lista1);
        int numeroMenor = encontrarMenor.operar(lista2);
        int cantidadDatos = lista1.size() + lista2.size();
        boolean esParODivisible = (numeroMayor % 2 == 0) || (numeroMayor != 0 && 2 % numeroMayor == 0);
        return new Resultados(numeroMayor, numeroMenor, cantidadDatos, esParODivisible);
    }
    
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(15, 3, 42, 8, 99, 12);
        List<Integer> lista2 = Arrays.asList(7, 25, 4, 18, 33, 6);
        
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println();
        
        int mayor = encontrarMayor.operar(lista1);
        System.out.println("Mayor en lista1: " + mayor);
        System.out.println("Dos digitos: " + esNumeroDeDosDigitos(mayor));
        System.out.println();
        
        int menor = encontrarMenor.operar(lista2);
        System.out.println("Menor en lista2: " + menor);
        System.out.println("Divisible por 2: " + esDivisiblePorDos(menor));
        System.out.println();
        
        int total = lista1.size() + lista2.size();
        System.out.println("Total datos: " + total);
        System.out.println("Es par: " + cantidadDatosEsPar(total));
        System.out.println();
        
        Resultados resultado = procesarDosListas(lista1, lista2);
        System.out.println(resultado);
    }
}
