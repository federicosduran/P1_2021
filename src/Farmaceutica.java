import java.util.ArrayList;

public class Farmaceutica {
    private String pais;
    private String nombre;
    private String sede;
    private ArrayList<Vacuna> vacunas;

    public Farmaceutica(String pais, String nombre, String sede, ArrayList<Vacuna> vacunas) {
        this.pais = pais;
        this.nombre = nombre;
        this.sede = sede;
        this.vacunas = vacunas;
    }
}
