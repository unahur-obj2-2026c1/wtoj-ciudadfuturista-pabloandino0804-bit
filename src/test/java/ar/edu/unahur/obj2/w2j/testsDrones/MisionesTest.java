package ar.edu.unahur.obj2.w2j.testsDrones;

import ar.edu.unahur.obj2.w2j.Sensor;
import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class MisionesTest {
    //Tests de eficiencia operativa extra en cada mision
    @Test
    public void misionTransporteDa100AlDronComercialQueHaceQueSuEficienciaSea615() {
        Mision transporte = new Transporte();
        Dron miDron = new DronComercial(50, 200, transporte);
        assertEquals(transporte.eficienciaOpExtra(), 100);
        assertEquals(615, miDron.eficiencia());
    }

    @Test
    public void misionExploracionNoRecibeNingunExtra(){
        Mision exploracion = new Exploracion();
        Dron miDron = new DronSeguridad(50, 200, exploracion);
        assertEquals(0, exploracion.eficienciaOpExtra());
        assertEquals(500, miDron.eficiencia());
    }

    @Test
    public void misionVigilanciaOtorga750ConDosDrones(){
        Sensor sensor1 = new Sensor(250, 45, true);
        Sensor sensor2 = new Sensor(250, 45, false);
        Mision vigilancia = new Vigilancia();
        Dron miDron = new DronSeguridad(50, 200, vigilancia);
        ((Vigilancia) vigilancia).añadirSensor(sensor1);
        ((Vigilancia) vigilancia).añadirSensor(sensor2);
        assertEquals(750, vigilancia.eficienciaOpExtra());
        assertEquals(1250, miDron.eficiencia());
    }

    //Tests de avanzado segun mision
    @Test
    public void dronEsAvanzadoEnTransporteCuandoSuAutonomiaEsMayorQue50(){
        Mision transporte = new Transporte();
        Dron dronPrueba = new DronComercial(70, 200, transporte);
        assertTrue(transporte.esAvanzadoSegunMision(dronPrueba));
    }

    @Test
    public void esAvanzadoEnExploracionCuandoSuEficienciaOperativaEsPar(){
        Mision exploracion = new Exploracion();
        Dron dronPrueba1 = new DronComercial(100, 70, exploracion);
        Dron dronPrueba2 = new DronSeguridad(50, 70, exploracion);
        assertFalse(exploracion.esAvanzadoSegunMision(dronPrueba1));
        assertTrue(exploracion.esAvanzadoSegunMision(dronPrueba2));;
    }

    @Test
    public void esAvanzadoEnVigilanciaCuandoTodosSusDronesSonDuraderos(){
        Sensor sensor1 = new Sensor(250, 600, true);
        Sensor sensor2 = new Sensor(250, 600, false);
        Mision vigilancia = new Vigilancia();
        Dron dronPrueba = new DronSeguridad(50, 200, vigilancia);
        ((Vigilancia) vigilancia).añadirSensor(sensor1);
        ((Vigilancia) vigilancia).añadirSensor(sensor2);
        assertTrue(vigilancia.esAvanzadoSegunMision(dronPrueba));
    }
}

