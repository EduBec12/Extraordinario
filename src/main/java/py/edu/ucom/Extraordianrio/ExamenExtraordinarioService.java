package py.edu.ucom.Extraordianrio;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExamenExtraordinarioService {

    public Presupuesto obtenerPresupuesto(Long id) {
        // Lógica para obtener el presupuesto, por ejemplo desde una base de datos
        Presupuesto presupuesto = new Presupuesto();
        presupuesto.setId(id);
        presupuesto.setNombre("Presupuesto " + id);
        presupuesto.setMonto(1500.0); // Monto de ejemplo
        
        return presupuesto;
    }
}