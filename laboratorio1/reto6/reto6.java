import java.util.HashMap;
import java.util.Map;

public class reto6 {
    
    private static Map<String, Runnable> maquina = new HashMap<>();
    
    public static void ejecutarComando(String comando) {
        
        comando = comando.toUpperCase();
        
       if (maquina.containsKey(comando)) {
            maquina.get(comando).run();
        } else {
            System.out.println("Comando desconocido: " + comando);
        }
    }
    
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
    
    // main
    public static void main(String[] args) {
        inicializarFragmento1();
        inicializarFragmento2();
        
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
