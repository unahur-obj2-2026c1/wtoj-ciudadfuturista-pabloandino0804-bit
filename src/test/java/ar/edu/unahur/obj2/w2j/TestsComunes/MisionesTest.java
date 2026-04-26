package ar.edu.unahur.obj2.w2j.TestsComunes;

import ar.edu.unahur.obj2.w2j.Sensor;
import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MisionesTest {
    @Test
    public void MisionTransporteDa100AlDronComercialQueHaceQueSuEficienciaSea615() {
        Mision transporte = new Transporte();
        Dron miDron = new DronComercial(50, 200, transporte);
        assertEquals(transporte.eficienciaOpExtra(), 100);
        assertEquals(615, miDron.eficiencia());
    }

    @Test
    public void MisionExploracionNoRecibeNingunExtra(){
        Mision exploracion = new Exploracion();
        Dron miDron = new DronSeguridad(50, 200, exploracion);
        assertEquals(exploracion.eficienciaOpExtra(), 0);
        assertEquals(500, miDron.eficiencia());
    }

    @Test
    public void MisionVigilancia(){
        Sensor sensor1 = new Sensor(250, 45, true);
        Sensor sensor2 = new Sensor(250, 45, false);
        Mision vigilancia = new Vigilancia();
        Dron miDron = new DronSeguridad(50, 200, vigilancia);
        ((Vigilancia) vigilancia).añadirSensor(sensor1);
        ((Vigilancia) vigilancia).añadirSensor(sensor2);
        assertEquals(1250, miDron.eficiencia());
    }
}
