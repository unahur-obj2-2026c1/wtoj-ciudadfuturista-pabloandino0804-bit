package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class Transporte implements Mision{
    @Override
    public Integer eficienciaOpExtra(){
        return 100;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        if (dron.getAutonomia() > 50){
            return true;
        }
        else {
            return false;
        }
    }
}
