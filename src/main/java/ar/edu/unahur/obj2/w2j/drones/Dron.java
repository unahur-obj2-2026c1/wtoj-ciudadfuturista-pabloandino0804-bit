package ar.edu.unahur.obj2.w2j.drones;

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
        return autonomia * 10 + this.mision.eficienciaOpExtra();
    }

    public Integer getAutonomia(){
        return autonomia;
    }

    public void setAutonomia(Integer autonomia){
        this.autonomia = autonomia;
    }

    public Integer getProcesamiento(){
        return procesamiento;
    }

    public Mision getmision(){
        return mision;
    }

    public void cambiarMision(Mision mision){
        this.mision = mision;
    }

    public Boolean esAvanzadoSegunTipo() {
       return null; 
    }

    
    public Boolean esAvanzado() {
        return this.esAvanzadoSegunTipo() || this.mision.esAvanzadoSegunMision(this);
    }
}
