import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reto6 {

    private static Map<String, Runnable> maquina = new HashMap<>();

    public static void ejecutarComando(String comando) {

        comando = comando.toUpperCase();

        if (maquina.containsKey(comando)) {
            maquina.get(comando).run();
        } else {
            System.out.println("La máquina dice: Comando desconocido -> " + comando);
        }
    }

    public static void inicializarFragmento1() {
        maquina.put("SALUDAR", () ->
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!")
        );

        maquina.put("DESPEDIR", () ->
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.")
        );

        maquina.put("CANTAR", () ->
                System.out.println("La máquina canta: 01010101")
        );

        maquina.put("DANZAR", () ->
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.")
        );
    }

    public static void inicializarFragmento2() {
        maquina.put("BROMEAR", () ->
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…")
        );

        maquina.put("GRITAR", () ->
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!")
        );

        maquina.put("SUSURRAR", () ->
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos")
        );

        maquina.put("ANALIZAR", () ->
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!")
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        inicializarFragmento1();
        inicializarFragmento2();

        System.out.println("=== MÁQUINA DE DECISIONES ===");
        System.out.println("Escribe un comando y presiona ENTER.");
        System.out.println("Comandos disponibles:");
        System.out.println("SALUDAR, DESPEDIR, CANTAR, DANZAR, BROMEAR, GRITAR, SUSURRAR, ANALIZAR");
        System.out.println("Escribe SALIR para terminar.\n");

        while (true) {
            System.out.print(">> ");
            String comando = sc.nextLine();

            if (comando.equalsIgnoreCase("SALIR")) {
                System.out.println("La máquina dice: Apagándose… hasta pronto 👋");
                break;
            }

            ejecutarComando(comando);
        }

        sc.close();
    }
}
