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
    
    public static void main(String[] args) {
        // Aquí irán las pruebas de los dos carriles
    }
}
