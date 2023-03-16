import java.util.ArrayList;

public class CentroDeSalud extends CentroDeAdministracion{
    private ArrayList<Sanitario> sanitarios;

    public CentroDeSalud(String denominacion, String direccion, Persona responsable, ArrayList<Sanitario> sanitarios) {
        super(denominacion, direccion, responsable);
        this.sanitarios = sanitarios;
    }
}
