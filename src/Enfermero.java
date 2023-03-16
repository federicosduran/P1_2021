import java.util.ArrayList;

public class Enfermero extends Sanitario {

    public Enfermero(String nombre, String NIF, String direccion, Integer edad, Fecha fechaVacunacion, Integer numeroDosisAdministradas, ArrayList<Vacuna> vacunas) {
        super(nombre, NIF, direccion, edad, fechaVacunacion, numeroDosisAdministradas, vacunas);
    }

    @Override
    public void ponerVacuna() {

    }
}
