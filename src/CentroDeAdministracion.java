import java.util.ArrayList;

public class CentroDeAdministracion {
    private String denominacion;
    private String direccion;
    private Persona responsable;
    private ArrayList<ReceptorVacuna> quienLaPuso;
    private ArrayList<PonedorVacuna> quienLaRecibio;

    public CentroDeAdministracion(String denominacion, String direccion, Persona responsable) {
        this.denominacion = denominacion;
        this.direccion = direccion;
        this.responsable = responsable;
    }
}
