package ar.edu.unahur.obj2.w2j;

public class Zona {
    private Integer tamano;
    private Integer operacionRecibidad = 0;

    public Integer tamanoTotal(){
        return tamano;
    }

    public void recibirOperacion(){
        this.operacionRecibidad +=1;
    }
}
