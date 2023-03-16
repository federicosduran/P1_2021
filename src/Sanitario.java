import java.util.ArrayList;

public abstract class Sanitario extends Persona implements PonedorVacuna {
    public Sanitario(String nombre, String NIF, String direccion, Integer edad, Fecha fechaVacunacion, Integer numeroDosisAdministradas, ArrayList<Vacuna> vacunas) {
        super(nombre, NIF, direccion, edad, fechaVacunacion, numeroDosisAdministradas, vacunas);
    }
}
