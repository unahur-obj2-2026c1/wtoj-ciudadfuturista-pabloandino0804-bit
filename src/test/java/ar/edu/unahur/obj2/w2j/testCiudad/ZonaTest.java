package ar.edu.unahur.obj2.w2j.testCiudad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Escuadron;
import ar.edu.unahur.obj2.w2j.ciudad.CiudadFuturista;
import ar.edu.unahur.obj2.w2j.ciudad.Zona;
import ar.edu.unahur.obj2.w2j.drones.Dron;
import ar.edu.unahur.obj2.w2j.drones.DronComercial;
import ar.edu.unahur.obj2.w2j.drones.DronSeguridad;
import ar.edu.unahur.obj2.w2j.misiones.Exploracion;
import ar.edu.unahur.obj2.w2j.misiones.Mision;
import ar.edu.unahur.obj2.w2j.misiones.Transporte;

public class ZonaTest {
    @Test
    public void laZonaOtorga1OperacionTrasCumplirCiertaCondicion() throws Exception{
        Zona unaZona = new Zona(40);
        CiudadFuturista ciudad = new CiudadFuturista();
        ciudad.setCantidadMaxima(14);

        Mision exploracion = new Exploracion();
        Mision transporte = new Transporte();
        Dron dron1 = new DronComercial(100, 70, transporte);
        Dron dron2 = new DronSeguridad(50, 70, exploracion);
        Dron dron3 = new DronSeguridad(300, 50, transporte);
        Escuadron escuadron = new Escuadron(ciudad);
        escuadron.agregarDron(dron1);
        escuadron.agregarDron(dron2);
        escuadron.agregarDron(dron3);
        escuadron.operar(unaZona);
        assertEquals(unaZona.cantOperaciones(), 1);
    }
}
