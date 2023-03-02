package Guia;

import java.util.LinkedList;

public class Queue {

    protected LinkedList linkedlist = new LinkedList();
    public void agregar(Object o){
        this.linkedlist.add(o);
    }

    public Object eliminar(){
        return this.linkedlist.removeFirst();
    }
}
