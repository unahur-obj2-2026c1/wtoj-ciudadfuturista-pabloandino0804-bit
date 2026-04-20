package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.misiones.Mision;

public class DronSeguridad extends Dron{
    public DronSeguridad(Integer autonomia, Integer procesamiento, Mision mision){
        super(autonomia, procesamiento, mision);
    }

    @Override
    public Boolean esAvanzadoSegunTipo(){
        return this.getProcesamiento() > 50;
    }
}
