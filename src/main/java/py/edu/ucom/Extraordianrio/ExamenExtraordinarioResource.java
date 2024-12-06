package py.edu.ucom.Extraordianrio;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/examen-extraordinario/presupuesto")
public class ExamenExtraordinarioResource {

    @Inject
    PresupuestoService presupuestoService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Presupuesto obtenerPresupuesto(@PathParam("id") Long id) {
        return presupuestoService.obtenerPresupuestoPorId(id);
    }
}
