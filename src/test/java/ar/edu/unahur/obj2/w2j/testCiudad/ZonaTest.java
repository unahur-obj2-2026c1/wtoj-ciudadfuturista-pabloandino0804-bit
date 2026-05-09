package ar.edu.unahur.obj2.w2j.testCiudad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.ciudad.*;
import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

public class ZonaTest {
    @Test
    public void laZonaOtorga1OperacionTrasCumplirCiertaCondicion() throws Exception{
        Zona unaZona = new Zona(40);
        CiudadFuturista ciudad = new CiudadFuturista();
        ciudad.setCantidadMaxima(14);
        Mision exploracion = new Exploracion();
        Mision transporte = new Transporte();
        Sensor sensor1 = new Sensor(250, 45, true);
        Sensor sensor2 = new Sensor(250, 45, false);
        List<Sensor> sensores = new ArrayList<>();
        sensores.add(sensor1);
        sensores.add(sensor2);
        Mision vigilancia = new Vigilancia(sensores);
        Dron dronSeguridad = new DronSeguridad(50, 200, vigilancia);
        Dron dron1 = new DronComercial(100, 70, transporte);
        Dron dron2 = new DronSeguridad(50, 70, exploracion);
        Dron dron3 = new DronSeguridad(300, 50, transporte);
        Escuadron escuadron = new Escuadron(ciudad);
        escuadron.agregarDron(dron1);
        escuadron.agregarDron(dron2);
        escuadron.agregarDron(dron3);
        escuadron.agregarDron(dronSeguridad);
        escuadron.operar(unaZona);
        assertEquals(unaZona.cantOperaciones(), 1);
    }
}
