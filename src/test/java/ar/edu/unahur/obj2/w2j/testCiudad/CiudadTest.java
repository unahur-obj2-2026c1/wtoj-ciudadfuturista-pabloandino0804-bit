package ar.edu.unahur.obj2.w2j.testCiudad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.ciudad.CiudadFuturista;

public class CiudadTest {
    @Test
    public void CiudadFuturistaTieneValorInicial10(){
        CiudadFuturista ciudad = new CiudadFuturista();
        assertEquals(10, ciudad.getCantidadMaxima());
    }
}
