import java.util.ArrayList;

public class Hospital extends CentroDeAdministracion{
    private String nombreHospital;
    private String direccion;
    private ArrayList<Sanitario> sanitarios;

    public Hospital(String denominacion, String direccion, Persona responsable, String nombreHospital, String direccion1, ArrayList<Sanitario> sanitarios) {
        super(denominacion, direccion, responsable);
        this.nombreHospital = nombreHospital;
        this.direccion = direccion1;
        this.sanitarios = sanitarios;
    }
}
