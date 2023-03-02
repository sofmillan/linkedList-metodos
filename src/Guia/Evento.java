package Guia;

import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    protected Queue<Integer> tiquetes;

    protected int capacidadDisponible;

    public Evento(int capacidadDisponible){
        this.capacidadDisponible = capacidadDisponible;
        this.tiquetes = new LinkedList<>();
    }

    public void agregarTiquete(int numeroPersonas){
        this.tiquetes.add(numeroPersonas);

    }

    public int procesarHastaAgotarExistencia(){
        int pedidosProcesados = 0;
        while(!tiquetes.isEmpty()){
           int tiquetesFaltantes = capacidadDisponible - tiquetes.peek();
           if(tiquetesFaltantes<0){
               return pedidosProcesados;
           }
           capacidadDisponible-=tiquetes.remove();
           pedidosProcesados++;
        }
        return 0;
    }
}
