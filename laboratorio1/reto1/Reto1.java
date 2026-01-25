import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}

public class Reto1 {
    public static void main(String[] args) {
        // Crear lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Kevin Cuitiva", 20, "kevin.cuitiva@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante("Laura Castillo", 20, "laura.castillo@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante("Juan Silva", 21, "juan.silva@mail.escuelaing.edu.co", 6));

        // Usar streams y lambdas para generar mensaje de bienvenida
        String mensajeBienvenida = estudiantes.stream()
            .map(e -> e.getNombre() + ", estudiante de la escuela de " + e.getSemestre() + " semestre de " + e.getEdad() + " años")
            .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
            .map(e -> e.getCorreo())
            .collect(Collectors.joining(" y "));

        System.out.println("Hola, bienvenidos Nosotros somos la pareja conformada por " + mensajeBienvenida + ". Nuestros correos institucionales son " + correos + ".");
    }
}
