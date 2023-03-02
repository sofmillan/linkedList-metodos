package Guia;

import java.util.LinkedList;

public class Stack {

    protected LinkedList linkedlist = new LinkedList();

    public void push(Object o){
        linkedlist.addFirst(o);
    }

    public Object pop(){
        if(linkedlist.isEmpty()){
            return null;
        }
        return this.linkedlist.removeFirst();
    }

    public Object peek(){
        return this.linkedlist.getFirst();
    }
}
