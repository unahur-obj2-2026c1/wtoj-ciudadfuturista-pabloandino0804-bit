package ar.edu.unahur.obj2.w2j.testsDrones;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Escuadron;
import ar.edu.unahur.obj2.w2j.ciudad.*;
import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

public class EscuadronesTest {
    @Test
    public void se_Agrega_Un_Dron_Al_Escuadron_Si_Su_Cantidad_No_Excede() throws Exception{
        Mision exploracion = new Exploracion();
        CiudadFuturista ciudad = new CiudadFuturista();
        ciudad.setCantidadMaxima(14);
        Dron dron1= new DronComercial(100, 70, exploracion);
        Dron dron2 = new DronSeguridad(50, 70, exploracion);
        Escuadron escuadronDrones = new Escuadron(ciudad);
        escuadronDrones.agregarDron(dron1);
        escuadronDrones.agregarDron(dron2);
        assertNotEquals(escuadronDrones.getDrones().size(), ciudad.getCantidadMaxima());
    }

    @Test
    public void sePuedeOperarUnaZonaSiCumpleLaCondicion() throws Exception{
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
        assertTrue(escuadron.puedeOperarLaZona(unaZona));
    }
}
