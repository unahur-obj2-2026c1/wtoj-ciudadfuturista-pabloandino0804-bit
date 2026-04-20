package ar.edu.unahur.obj2.w2j;

public class Sensor {
    private Integer capacidad;
    private Integer durabilidad;
    private Boolean mejorasTecnologicas;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas){
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer getCapacidad(){
        return capacidad;
    }

    public Integer getDurabilidad(){
        return durabilidad;
    }

    public Boolean tieneMejoras(){
        return mejorasTecnologicas;
    }

    public Integer eficiencia(){
        if (mejorasTecnologicas){
            return 2*capacidad;
        }
        else {
            return capacidad;
        }
    }
}