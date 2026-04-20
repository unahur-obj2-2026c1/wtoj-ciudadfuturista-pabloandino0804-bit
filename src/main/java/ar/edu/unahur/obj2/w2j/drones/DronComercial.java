package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.misiones.Mision;

public class DronComercial extends Dron{
    
    public DronComercial(Integer autonomia, Integer procesamiento, Mision mision){
        super(autonomia, procesamiento, mision);
    }

    @Override
    public Integer eficiencia(){
        return autonomia * 10 + this.mision.eficienciaOpExtra() + 10;
    }

    @Override
    public Boolean esAvanzadoSegunTipo(){
        return false;
    }
}
