package ar.edu.unahur.obj2.w2j;

public class Zona {
    private Integer tamano;
    private Integer operacionRecibidad;

    public Zona(Integer tamano, Integer operacionRecibidad){
        this.tamano = tamano;
        this.operacionRecibidad = operacionRecibidad;
    }

    public Integer tamanoTotal(){
        return tamano;
    }

    public void recibirOperacion(){
        this.operacionRecibidad +=1;
    }
}
