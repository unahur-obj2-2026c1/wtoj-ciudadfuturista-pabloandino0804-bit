package ar.edu.unahur.obj2.w2j;

import ar.edu.unahur.obj2.w2j.misiones.Mision;

public class Dron {
    protected Integer autonomia;
    protected Integer procesamiento;
    protected Mision mision;

    public Dron(Integer autonomia, Integer procesamiento, Mision mision){
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    public Integer eficiencia(){
        return autonomia * 10;
    }

    public void setAutonomia(Integer autonomia){
        this.autonomia = autonomia;
    }
}
