import java.util.ArrayList;

public class Residencia {
    private String nombre;
    private String direccion;

    private ArrayList<Persona> personas;

    public Residencia(String nombre, String direccion, ArrayList<Persona> personas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.personas = personas;
    }

}
