import java.util.HashMap;
import java.util.Map;

public class reto6 {
    
    // Map que vincula comandos con acciones usando Runnable (expresiones lambda)
    private static Map<String, Runnable> maquina = new HashMap<>();
    
    // Método para ejecutar un comando
    public static void ejecutarComando(String comando) {
        // Convertir a mayúsculas para evitar errores de caso
        comando = comando.toUpperCase();
        
        // Verificar si el comando existe en el mapa
        if (maquina.containsKey(comando)) {
            // Ejecutar la acción asociada al comando
            maquina.get(comando).run();
        } else {
            System.out.println("Comando desconocido: " + comando);
        }
    }
    
    // Inicializar la máquina con los comandos del Fragmento 1 (Estudiante A)
    public static void inicializarFragmento1() {
        // SALUDAR
        maquina.put("SALUDAR", () -> {
            System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
        });
        
        // DESPEDIR
        maquina.put("DESPEDIR", () -> {
            System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
        });
        
        // CANTAR
        maquina.put("CANTAR", () -> {
            System.out.println("La máquina canta: 01010101");
        });
        
        // DANZAR
        maquina.put("DANZAR", () -> {
            System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
        });
    }
    
    // Inicializar los comandos del Fragmento 2 (Estudiante B)
    public static void inicializarFragmento2() {
        // BROMEAR
        maquina.put("BROMEAR", () -> {
            System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
        });
        
        // GRITAR
        maquina.put("GRITAR", () -> {
            System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
        });
        
        // SUSURRAR
        maquina.put("SUSURRAR", () -> {
            System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
        });
        
        // ANALIZAR
        maquina.put("ANALIZAR", () -> {
            System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
        });
    }
    
    // Main para demostrar el funcionamiento
    public static void main(String[] args) {
        // Inicializar ambos fragmentos
        inicializarFragmento1();
        inicializarFragmento2();
        
        // Demostrar todos los comandos
        System.out.println("=== MÁQUINA DE DECISIONES ===\n");
        
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
        
        System.out.println();
        
        ejecutarComando("CANTAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("DESPEDIR");
    }
}
