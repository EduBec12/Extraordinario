package py.edu.ucom.Extraordianrio;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PresupuestoService {

    public Presupuesto obtenerPresupuestoPorId(Long id) {
        // Recupera el presupuesto desde la base de datos o crea un objeto simulado
        Presupuesto presupuesto = new Presupuesto();
        presupuesto.setId(id);
        presupuesto.setNombre("Presupuesto " + id);
        presupuesto.setMonto(1500.0);

        // Simulación de movimientos
        Movimiento movimiento1 = new Movimiento(1L, "Compra de insumos", 500.0);
        Movimiento movimiento2 = new Movimiento(2L, "Pago de salarios", 1000.0);

        presupuesto.setMovimientos(List.of(movimiento1, movimiento2));
        
        return presupuesto;
    }
}