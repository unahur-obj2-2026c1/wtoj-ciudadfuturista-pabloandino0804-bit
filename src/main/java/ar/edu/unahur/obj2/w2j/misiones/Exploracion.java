package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class Exploracion implements Mision{

    @Override
    public Integer eficienciaOpExtra(){
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron){
        if (dron.eficiencia()%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
