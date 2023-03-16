import java.util.ArrayList;

public class Persona implements ReceptorVacuna {
    private String nombre;
    private String NIF;
    private String direccion;
    private Integer edad;
    private Fecha fechaVacunacion;
    private Integer numeroDosisAdministradas;
    private ArrayList<Vacuna> vacunas;

    public Persona(String nombre, String NIF, String direccion, Integer edad, Fecha fechaVacunacion, Integer numeroDosisAdministradas, ArrayList<Vacuna> vacunas) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccion = direccion;
        this.edad = edad;
        this.fechaVacunacion = fechaVacunacion;
        this.numeroDosisAdministradas = numeroDosisAdministradas;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public void recibirVacuna() {
    }
}
