import java.util.ArrayList;

public class Medico extends Sanitario{
    private String especialidad;

    public Medico(String nombre, String NIF, String direccion, Integer edad, Fecha fechaVacunacion, Integer numeroDosisAdministradas, ArrayList<Vacuna> vacunas, String especialidad) {
        super(nombre, NIF, direccion, edad, fechaVacunacion, numeroDosisAdministradas, vacunas);
        this.especialidad = especialidad;
    }

    @Override
    public void ponerVacuna() {

    }
}
