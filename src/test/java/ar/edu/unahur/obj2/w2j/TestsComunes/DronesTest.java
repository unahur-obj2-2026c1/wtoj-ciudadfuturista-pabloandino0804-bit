package ar.edu.unahur.obj2.w2j.TestsComunes;

import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class DronesTest {
    @Test
    public void elDronComercialNoEsAvanzadoSegunTipoPeroSiPorSuMisionCon60Autonomia(){
        Mision transporte = new Transporte();
        Dron dronComercial = new DronComercial(60, 120, transporte);
        assertFalse(dronComercial.esAvanzadoSegunTipo());
    }

    @Test
    public void unDronDeSeguridadEsAvanzadoCuandoSuProcesamientoSuperaLos50(){
        Mision transporte = new Transporte(); 
        Dron dronSeguridad = new DronSeguridad(250, 55, transporte);
        assertTrue(dronSeguridad.esAvanzadoSegunTipo());
    }
}
