package Ejercicios;

public class LinkedList {

    class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
        }

        Node() {
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarInicio(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if (nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if (tail == null) {
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }



    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarInicio(valor);
        } else {
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if (actual.next == null) {
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }

    }

    public boolean contieneValor(int valor) {
        Node nuevoNodo = new Node(valor);
        Node actual = head;
        while(actual!=null){
            if(actual.value==nuevoNodo.value){
                return true;
            }
            actual=actual.next;
        }
        return false;
    }

    public int obtenerPorPosicion(int posicion){
        Node actual = head;
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            return actual.value;
        } else {
            for (int i = 0; i < posicion ; i++){
                if(actual==null){
                    throw new IndexOutOfBoundsException();
                }
                actual=actual.next;
            }
            return actual.value;
        }

    }


    public void eliminarInicio(){
        head = head.next;
    }

    public void eliminarFinal(){
        Node actual = head;
        while(actual.next.next!=null){
            actual=actual.next;
        }
        actual.next=null;
    }

    public void eliminarPorPosicion(int posicion){
        Node actual = head;
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            eliminarInicio();
        } else {
            for (int i = 0; i < posicion-1 ; i++){
                if(actual==null){
                    throw new IndexOutOfBoundsException();
                }
                actual=actual.next;
            }
            actual.next=actual.next.next;
        }
    }

    public void recorrer(){
        Node actual = head;
        while(actual!=null){
            System.out.println(actual.value);
            actual=actual.next;
        }

    }
}