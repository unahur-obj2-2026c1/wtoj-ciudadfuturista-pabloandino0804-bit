package ar.edu.unahur.obj2.w2j;

import ar.edu.unahur.obj2.w2j.ciudad.CiudadFuturista;
import ar.edu.unahur.obj2.w2j.ciudad.Zona;
import ar.edu.unahur.obj2.w2j.drones.*;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {
    private List<Dron> drones = new ArrayList<>();
    private CiudadFuturista ciudad = new CiudadFuturista();
    private Integer limite;
    
    public Escuadron(CiudadFuturista ciudad){
        this.limite = ciudad.getCantidadMaxima();
    }

    public Integer getCantidadMaxima(){
        return limite;
    }

    public List<Dron> getDrones(){
        return drones;
    }

    public void agregarDron(Dron unDron) throws Exception{
        if (this.drones.size() >= limite){
            throw new Exception("Supera la cantidad máxima definida por la ciudad.");
        }
        this.drones.add(unDron);
        
    }

    public Boolean puedeOperarLaZona(Zona zona){
        if (this.alMenosUnAvanzado() && this.capacidadOperativa() > zona.tamanoTotal() * 2){
            return true;
        }
        return false;
    }

    public int capacidadOperativa(){
        return drones.stream().mapToInt(dron -> dron.eficiencia()).sum();
    }

    public Boolean alMenosUnAvanzado(){
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public void operar(Zona zona) {
        if(this.puedeOperarLaZona(zona)){
            this.drones.stream().forEach(d -> d.disminuirAutonomia());
            zona.recibirOperacion();
        }
    }
}
