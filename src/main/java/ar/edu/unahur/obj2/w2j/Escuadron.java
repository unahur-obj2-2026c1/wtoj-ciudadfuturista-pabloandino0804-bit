package ar.edu.unahur.obj2.w2j;

import ar.edu.unahur.obj2.w2j.drones.*;
import ar.edu.unahur.obj2.w2j.misiones.*;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {
    private List<Dron> drones = new ArrayList<>();
    private CiudadFuturista ciudad = new CiudadFuturista();

    public Escuadron(List<Dron> drones){
        this.drones = drones;
    }

    public void agregarDron(Dron unDron) throws Exception{
        if (ciudad.getCantidadMaxima() >= this.drones.size()) {
            throw new Exception("Supera la cantidad máxima definida por la ciudad.");
        }
        this.drones.add(unDron);
    }
}
