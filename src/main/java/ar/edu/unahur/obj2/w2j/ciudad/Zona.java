package ar.edu.unahur.obj2.w2j.ciudad;

public class Zona {
    private Integer tamano;
    private Integer operaciones = 0;

    public Zona(Integer tamano){
        this.tamano = tamano;
    }

    public Integer cantOperaciones(){
        return operaciones;
    }

    public Integer tamanoTotal(){
        return tamano;
    }

    public void recibirOperacion(){
        this.operaciones +=1;
    }
}
