package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;
import ar.edu.unahur.obj2.w2j.Sensor;

import java.util.ArrayList;
import java.util.List;

public class Vigilancia implements Mision{
    private List<Sensor> sensores = new ArrayList<>();

    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public List<Sensor> cantSensores(){
        return sensores;
    }


    @Override
    public Integer eficienciaOpExtra(){
        return sensores.stream().mapToInt(s -> s.eficiencia()).sum();
    }



    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
    if (sensores.stream().allMatch(s-> s.esDuradero())){
            return true;
        }
        else {
            return false;
        }
    }
}
