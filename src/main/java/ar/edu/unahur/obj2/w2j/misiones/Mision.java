package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public interface Mision {
    Integer eficienciaOpExtra();

    Boolean esAvanzadoSegunMision(Dron dron);
}
